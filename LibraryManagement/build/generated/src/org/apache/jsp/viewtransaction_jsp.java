package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;
import javax.mail.*;
import javax.mail.internet.*;

public final class viewtransaction_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>View Transactions</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: whitesmoke;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header {\n");
      out.write("            background-color: #333;\n");
      out.write("            color: white;\n");
      out.write("            padding: 15px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-between;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .header h1 {\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a {\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            transition: background-color 0.3s, color 0.3s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a:hover {\n");
      out.write("            background-color: #555;\n");
      out.write("            color: whitesmoke;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @media (max-width: 768px) {\n");
      out.write("            .header {\n");
      out.write("                flex-direction: column;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a {\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("   .Transaction {\n");
      out.write("            margin: 20px;\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .Transaction h1 {\n");
      out.write("            margin-top: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        label, select, input[type=\"submit\"] {\n");
      out.write("            margin-right: 10px;\n");
      out.write("        }\n");
      out.write("  select {\n");
      out.write("            width: 40%;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("     select:focus {\n");
      out.write("            border-color: #007BFF;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write(" input[type=\"submit\"] {\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: background-color 0.3s;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table, th, td {\n");
      out.write("            border: 1px solid #dee2e6;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th, td {\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: #f1f1f1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .success {\n");
      out.write("            color: green;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .error {\n");
      out.write("            color: red;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <h1>LMS</h1>\n");
      out.write("        <a href=\"main.jsp\">Home</a>\n");
      out.write("        <a href=\"ViewBooks.jsp\">View Books</a>\n");
      out.write("        <a href=\"AddBooks.jsp\">Add Books</a>\n");
      out.write("        <a href=\"UpdateBooks.jsp\">Update Books</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <div class=\"Transaction\">\n");
      out.write("            <h1>View Transactions</h1>\n");
      out.write("            \n");
      out.write("            <!-- Filter Form -->\n");
      out.write("            <form id=\"filter-form\" action=\"viewtransaction.jsp\" method=\"post\">\n");
      out.write("                <label for=\"status\">Select Status:</label>\n");
      out.write("                <select id=\"status\" name=\"status\">\n");
      out.write("                    <option value=\"all\">All</option>\n");
      out.write("                    <option value=\"pending\">Pending</option>\n");
      out.write("                    <option value=\"returned\">Returned</option>\n");
      out.write("                </select>\n");
      out.write("                <input type=\"submit\" value=\"Filter\">\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            <!-- Send Email Form -->\n");
      out.write("            <form id=\"send-email-form\" action=\"viewtransaction.jsp\" method=\"post\">\n");
      out.write("                <input type=\"submit\" name=\"sendEmails\" value=\"Send Emails to Overdue Users\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            <!-- Display Transactions -->\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>TID</th>\n");
      out.write("                    <th>User Name</th>\n");
      out.write("                    <th>User ID</th>\n");
      out.write("                    <th>User Email</th>\n");
      out.write("                    <th>Book Name</th>\n");
      out.write("                    <th>Book ID</th>\n");
      out.write("                    <th>Borrow Date</th>\n");
      out.write("                    <th>Return Date</th>\n");
      out.write("                    <th>Status</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");
 
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
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( tid );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( userName );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( userId );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( userEmail );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( bookName );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( bookId );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( borrowDate );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( returnDate );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( status );
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <form action=\"viewtransaction.jsp\" method=\"post\">\n");
      out.write("                            <input type=\"hidden\" name=\"tid\" value=\"");
      out.print( tid );
      out.write("\">\n");
      out.write("                            <input type=\"submit\" name=\"updateStatus\" value=\"Mark as Returned\">\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 
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
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
