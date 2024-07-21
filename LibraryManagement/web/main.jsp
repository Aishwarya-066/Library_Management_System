<%-- 
    Document   : main
    Created on : 20 Jul, 2024, 9:08:19 PM
    Author     : Aishwarya
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>LMS</title>
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

  

        .Transaction {
            margin-top: 20px;
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.9);
            max-width: 550px;
            text-align: center;
        }

        form h2 {
            margin-bottom: 20px;
            font-size: 24px;
        }

        h1 {
            margin-bottom: 50px;
        }

        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
        }

        input, textarea, select {
            width: 60%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
            margin-bottom: 20px;
        }

        input:focus, textarea:focus, select:focus {
            border-color: #007BFF;
            outline: none;
        }

        input[type="submit"] {
            width: 50%;
            margin: 40px;
            padding: 10px;
            border: none;
            border-radius: 5px;
            background-color: #007BFF;
            color: #fff;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        .error {
            color: red;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .success {
            color: green;
            font-weight: bold;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <div class="header">
        <h1>LMS</h1>
        <a href="viewtransaction.jsp">View Transaction</a>
        <a href="ViewBooks.jsp">View Books</a>
        <a href="ManageBooks.jsp">Manage Books</a>
        <a href="Login.jsp">Log Out</a>
    </div>
    <center>
        <div class="Transaction">
            <h1>Transactions</h1>
            <form id="trans" action="main.jsp" method="post">
                <label for="tid">ENTER TRANSACTION ID</label>
                <input type="text" id="tid" name="tid" value="" autocomplete="off">
                <br><br>
                <label for="user_name">ENTER USER NAME</label>
                <input type="text" id="user_name" name="user_name" value="" autocomplete="off">
                <br><br>
                <label for="user_id">ENTER USER ID</label>
                <input type="text" id="user_id" name="user_id" value="" autocomplete="off">
                <br><br>
                <label for="user_email">ENTER USER EMAIL</label>
                <input type="text" id="user_email" name="user_email" value="" autocomplete="off">
                <br><br>
                <label for="book_name">ENTER BOOK NAME</label>
                <input type="text" id="book_name" name="book_name" value="" autocomplete="off">
                <br><br>
                <label for="book_id">ENTER BOOK ID</label>
                <input type="text" id="book_id" name="book_id" value="" autocomplete="off">
                <br><br>
                <label for="borrow_date">BORROW DATE</label>
                <input type="date" id="borrow_date" name="borrow_date" value="" autocomplete="off">
                <br><br>
                <label for="return_date">RETURN DATE</label>
                <input type="date" id="return_date" name="return_date" value="" autocomplete="off">
                <br><br>
                <label for="status">Status:</label>
                <select id="status" name="status">
                    <option value="pending">Pending</option>
                    <option value="returned">Returned</option>
                </select>
                <br><br>    
                <input type="submit" value="Submit">
            </form>

            <% 
                if ("POST".equalsIgnoreCase(request.getMethod())) {
                   int tid = Integer.parseInt(request.getParameter("tid"));
                    String user_name = request.getParameter("user_name");
                    int user_id = Integer.parseInt(request.getParameter("user_id"));
                    String user_email = request.getParameter("user_email");
                    String book_name = request.getParameter("book_name");
                    String book_id = request.getParameter("book_id");
                    String borrow_date = request.getParameter("borrow_date");
                    String return_date = request.getParameter("return_date");
                    String status = request.getParameter("status");

                    Connection conn = null;
                    PreparedStatement ps = null;

                    try {
         
                        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Library");

                        String sql = "INSERT INTO borrow_detail (Tid, Bname, Bid, Bemail, borrow_date, return_date, status, bookname, bookid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                        ps = conn.prepareStatement(sql);
                        ps.setInt(1, tid);
                        ps.setString(2, user_name);
                        ps.setInt(3, user_id);
                        ps.setString(4, user_email);
                        ps.setDate(5, java.sql.Date.valueOf(borrow_date));
                        ps.setDate(6, java.sql.Date.valueOf(return_date));
                        ps.setString(7, status);
                        ps.setString(8, book_name);
                        ps.setString(9, book_id);
                        int rows = ps.executeUpdate();
                        if (rows > 0) {
                            out.println("<p class='success'>Transaction details inserted successfully.</p>");
                        } else {
                            out.println("<p class='error'>Failed to insert transaction details.</p>");
                        }
                    } catch (Exception e) {
                        out.println("<p class='error'>" + e.getMessage() + "</p>");
                    } finally {
                        if (ps != null) try { ps.close(); } catch (SQLException ignored) {}
                        if (conn != null) try { conn.close(); } catch (SQLException ignored) {}
                    }
                }
            %>
        </div>
    </center>
</body>
</html>
