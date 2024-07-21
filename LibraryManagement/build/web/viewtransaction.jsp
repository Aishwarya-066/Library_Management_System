<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page import="javax.mail.*"%>
<%@page import="javax.mail.internet.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Transactions</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-image: url("https://www.pickthebrain.com/blog/wp-content/uploads/2016/02/book-67049_1280.jpg");
            background-color: whitesmoke;
            align-items: center;
        }

        .header {
            background-color: #333;
            color: white;
            padding: 15px;
            display: flex;
            align-items: center;
            justify-content: space-between;
        }

        .header h1 {
            margin: 0;
        }

        a {
            color: white;
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 5px;
            transition: background-color 0.3s, color 0.3s;
        }

        a:hover {
            background-color: #555;
            color: whitesmoke;
        }

        @media (max-width: 768px) {
            .header {
                flex-direction: column;
            }

            a {
                padding: 10px;
                text-align: center;
            }
        }
   .Transaction {
            margin: 20px;
            background-color: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .Transaction h1 {
            margin-top: 0;
        }

        form {
            margin-bottom: 20px;
        }

        label, select, input[type="submit"] {
            margin-right: 10px;
        }
  select {
            width: 40%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
            margin-bottom: 20px;
        }

     select:focus {
            border-color: #007BFF;
            outline: none;
        }
 input[type="submit"] {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }

        table, th, td {
            border: 1px solid #dee2e6;
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #f1f1f1;
        }

        .success {
            color: green;
        }

        .error {
            color: red;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>LMS</h1>
        <a href="main.jsp">Home</a>
        <a href="ViewBooks.jsp">View Books</a>
        <a href="ManageBooks.jsp">Manage Books</a>
        <a href="Login.jsp">Log Out</a>
    </div>

    <center>
        <div class="Transaction">
            <h1>View Transactions</h1>
            
            <!-- Filter Form -->
            <form id="filter-form" action="viewtransaction.jsp" method="post">
                <label for="status">Select Status:</label>
                <select id="status" name="status">
                    <option value="all">All</option>
                    <option value="pending">Pending</option>
                    <option value="returned">Returned</option>
                </select>
                <input type="submit" value="Filter">
            </form>
            
            <!-- Send Email Form -->
            <form id="send-email-form" action="viewtransaction.jsp" method="post">
                <input type="submit" name="sendEmails" value="Send Emails to Overdue Users">
            </form>

            <!-- Display Transactions -->
            <table border="1">
                <tr>
                    <th>TID</th>
                    <th>User Name</th>
                    <th>User ID</th>
                    <th>User Email</th>
                    <th>Book Name</th>
                    <th>Book ID</th>
                    <th>Borrow Date</th>
                    <th>Return Date</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>

                <% 
                    String statusFilter = request.getParameter("status");
                    boolean sendEmails = request.getParameter("sendEmails") != null;
                    Connection conn = null;
                    PreparedStatement ps = null;
                    ResultSet rs = null;

                    try {
                        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Library");

                        // Prepare SQL query with filtering based on status
                        String sql = "SELECT * FROM borrow_detail";
                        if ("pending".equals(statusFilter)) {
                            sql += " WHERE status = 'pending'";
                        } else if ("returned".equals(statusFilter)) {
                            sql += " WHERE status = 'returned'";
                        }

                        ps = conn.prepareStatement(sql);
                        rs = ps.executeQuery();

                        while (rs.next()) {
                            int tid = rs.getInt("Tid");
                            String userName = rs.getString("Bname");
                            int userId = rs.getInt("Bid");
                            String userEmail = rs.getString("Bemail");
                            String bookName = rs.getString("bookname");
                            String bookId = rs.getString("bookid");
                            String borrowDate = rs.getDate("borrow_date").toString();
                            String returnDate = rs.getDate("return_date").toString();
                            String status = rs.getString("status");
                %>
                <tr>
                    <td><%= tid %></td>
                    <td><%= userName %></td>
                    <td><%= userId %></td>
                    <td><%= userEmail %></td>
                    <td><%= bookName %></td>
                    <td><%= bookId %></td>
                    <td><%= borrowDate %></td>
                    <td><%= returnDate %></td>
                    <td><%= status %></td>
                    <td>
                        <form action="viewtransaction.jsp" method="post">
                            <input type="hidden" name="tid" value="<%= tid %>">
                            <input type="submit" name="updateStatus" value="Mark as Returned">
                        </form>
                    </td>
                </tr>
                <% 
                        }

                        // Handling POST requests for status update and email sending
                        if ("POST".equalsIgnoreCase(request.getMethod())) {
                            if (request.getParameter("updateStatus") != null) {
                                int tidToUpdate = Integer.parseInt(request.getParameter("tid"));
                                ps = conn.prepareStatement("UPDATE borrow_detail SET status = 'returned' WHERE Tid = ?");
                                ps.setInt(1, tidToUpdate);
                                int rowsUpdated = ps.executeUpdate();
                                if (rowsUpdated > 0) {
                                    out.println("<p class='success'>Status updated successfully.</p>");
                                } else {
                                    out.println("<p class='error'>Failed to update status.</p>");
                                }
                            } else if (sendEmails) {
                                ps = conn.prepareStatement("SELECT * FROM borrow_detail WHERE return_date < CURRENT_DATE AND status = 'pending'");
                                rs = ps.executeQuery();
                                while (rs.next()) {
                                    String email = rs.getString("Bemail");
                                    String userName = rs.getString("Bname");
                                    String bookName = rs.getString("bookname");
                                    
                                    // Send email
                                    String to = email;
                                    String from = "21cse066aishwarya@gmail.com"; // Replace with your email
                                    String host = "smtp.gmail.com"; // Replace with your SMTP server
                                    final String username = "21cse066aishwarya@gmail.com"; // Your email
                                    final String password = "hwev nmwm okgs xtpv"; // Your email password

                                    Properties properties = new Properties();
                                    properties.setProperty("mail.smtp.host", host);
                                    properties.setProperty("mail.smtp.port", "587"); // For TLS
                                    properties.setProperty("mail.smtp.auth", "true");
                                    properties.setProperty("mail.smtp.starttls.enable", "true"); // Enable STARTTLS

                                    Session session1 = Session.getInstance(properties, new Authenticator() {
                                        protected PasswordAuthentication getPasswordAuthentication() {
                                            return new PasswordAuthentication(username, password);
                                        }
                                    });

                                    try {
                                        MimeMessage message = new MimeMessage(session1);
                                        message.setFrom(new InternetAddress(from));
                                        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                                        message.setSubject("Overdue Book Notification");
                                        message.setText("Dear " + userName + ",\n\nThe book '" + bookName + "' is overdue. Please return it as soon as possible.\n\nThank you.");

                                        Transport.send(message);
                                        out.println("<p class='success'>Email sent to " + to + ".</p>");
                                    } catch (MessagingException e) {
                                        e.printStackTrace();
                                        out.println("<p class='error'>Failed to send email: " + e.getMessage() + "</p>");
                                    }
                                }
                            }
                        }
                        
                    } catch (SQLException e) {
                        e.printStackTrace();
                        out.println("<p class='error'>Database error: " + e.getMessage() + "</p>");
                    } finally {
                        if (rs != null) try { rs.close(); } catch (SQLException ignored) {}
                        if (ps != null) try { ps.close(); } catch (SQLException ignored) {}
                        if (conn != null) try { conn.close(); } catch (SQLException ignored) {}
                    }
                %>
            </table>
        </div>
    </center>
</body>
</html>
