package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>LMS</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-image: url(\"https://www.pickthebrain.com/blog/wp-content/uploads/2016/02/book-67049_1280.jpg\");\n");
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
      out.write("  \n");
      out.write("\n");
      out.write("        .Transaction {\n");
      out.write("            margin-top: 20px;\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.9);\n");
      out.write("            max-width: 550px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form h2 {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            margin-bottom: 50px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input, textarea, select {\n");
      out.write("            width: 60%;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input:focus, textarea:focus, select:focus {\n");
      out.write("            border-color: #007BFF;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            width: 50%;\n");
      out.write("            margin: 40px;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            background-color: #007BFF;\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 16px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: background-color 0.3s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .error {\n");
      out.write("            color: red;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .success {\n");
      out.write("            color: green;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <h1>LMS</h1>\n");
      out.write("        <a href=\"viewtransaction.jsp\">View Transaction</a>\n");
      out.write("        <a href=\"ViewBooks.jsp\">View Books</a>\n");
      out.write("        <a href=\"ManageBooks.jsp\">Manage Books</a>\n");
      out.write("        <a href=\"Login.jsp\">Log Out</a>\n");
      out.write("    </div>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"Transaction\">\n");
      out.write("            <h1>Transactions</h1>\n");
      out.write("            <form id=\"trans\" action=\"main.jsp\" method=\"post\">\n");
      out.write("                <label for=\"tid\">ENTER TRANSACTION ID</label>\n");
      out.write("                <input type=\"text\" id=\"tid\" name=\"tid\" value=\"\" autocomplete=\"off\">\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"user_name\">ENTER USER NAME</label>\n");
      out.write("                <input type=\"text\" id=\"user_name\" name=\"user_name\" value=\"\" autocomplete=\"off\">\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"user_id\">ENTER USER ID</label>\n");
      out.write("                <input type=\"text\" id=\"user_id\" name=\"user_id\" value=\"\" autocomplete=\"off\">\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"user_email\">ENTER USER EMAIL</label>\n");
      out.write("                <input type=\"text\" id=\"user_email\" name=\"user_email\" value=\"\" autocomplete=\"off\">\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"book_name\">ENTER BOOK NAME</label>\n");
      out.write("                <input type=\"text\" id=\"book_name\" name=\"book_name\" value=\"\" autocomplete=\"off\">\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"book_id\">ENTER BOOK ID</label>\n");
      out.write("                <input type=\"text\" id=\"book_id\" name=\"book_id\" value=\"\" autocomplete=\"off\">\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"borrow_date\">BORROW DATE</label>\n");
      out.write("                <input type=\"date\" id=\"borrow_date\" name=\"borrow_date\" value=\"\" autocomplete=\"off\">\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"return_date\">RETURN DATE</label>\n");
      out.write("                <input type=\"date\" id=\"return_date\" name=\"return_date\" value=\"\" autocomplete=\"off\">\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"status\">Status:</label>\n");
      out.write("                <select id=\"status\" name=\"status\">\n");
      out.write("                    <option value=\"pending\">Pending</option>\n");
      out.write("                    <option value=\"returned\">Returned</option>\n");
      out.write("                </select>\n");
      out.write("                <br><br>    \n");
      out.write("                <input type=\"submit\" value=\"Submit\">\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            ");
 
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
            
      out.write("\n");
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
