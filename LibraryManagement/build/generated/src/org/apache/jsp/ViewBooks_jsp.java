package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ViewBooks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>View Books</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: whitesmoke;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .header {\n");
      out.write("            background-color: #333;\n");
      out.write("            color: white;\n");
      out.write("            padding: 15px;\n");
      out.write("            display: flex;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-between;\n");
      out.write("        }\n");
      out.write("        .header h1 {\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("        .header a {\n");
      out.write("            color: white;\n");
      out.write("            text-decoration: none;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            transition: background-color 0.3s, color 0.3s;\n");
      out.write("        }\n");
      out.write("        .header a:hover {\n");
      out.write("            background-color: #555;\n");
      out.write("            color: whitesmoke;\n");
      out.write("        }\n");
      out.write("        .search-form {\n");
      out.write("            margin: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .search-form input[type=\"text\"] {\n");
      out.write("            width: 60%;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        .search-form input[type=\"submit\"] {\n");
      out.write("            padding: 10px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            background-color: #007BFF;\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 16px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            transition: background-color 0.3s ease;\n");
      out.write("        }\n");
      out.write("        .search-form input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 80%;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            background-color: white;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            padding: 8px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("        }\n");
      out.write("        .delete-button {\n");
      out.write("            color: red;\n");
      out.write("            border: none;\n");
      out.write("            background: none;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .delete-button:hover {\n");
      out.write("            text-decoration: underline;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <h1>LMS</h1>\n");
      out.write("        <a href=\"main.jsp\">Home</a>\n");
      out.write("        <a href=\"AddBooks.jsp\">Add/Update Books</a>\n");
      out.write("        <a href=\"viewtransaction.jsp\">View Transaction</a>\n");
      out.write("        <a href=\"Login.jsp\">Log Out</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <div class=\"search-form\">\n");
      out.write("            <form method=\"get\" action=\"ViewBooks.jsp\">\n");
      out.write("                <input type=\"text\" name=\"search\" placeholder=\"Search by book name or author\" value=\"");
      out.print( request.getParameter("search") != null ? request.getParameter("search") : "" );
      out.write("\">\n");
      out.write("                <input type=\"submit\" value=\"Search\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Book ID</th>\n");
      out.write("                    <th>Book Name</th>\n");
      out.write("                    <th>Author Name</th>\n");
      out.write("                    <th>Genre</th>\n");
      out.write("                    <th>ISBN</th>\n");
      out.write("                    <th>Publisher</th>\n");
      out.write("                    <th>Publish Year</th>\n");
      out.write("                    <th>Actions</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    Connection c = null;
                    PreparedStatement statement = null;
                    ResultSet rs = null;
                    String searchQuery = request.getParameter("search");
                    String sql = "SELECT * FROM book_detail";

                    if (searchQuery != null && !searchQuery.trim().isEmpty()) {
                        sql += " WHERE bookname LIKE ? OR author LIKE ?";
                    }

                    try {
                        c = DriverManager.getConnection("jdbc:derby://localhost:1527/Library");
                        statement = c.prepareStatement(sql);

                        if (searchQuery != null && !searchQuery.trim().isEmpty()) {
                            statement.setString(1, "%" + searchQuery + "%");
                            statement.setString(2, "%" + searchQuery + "%");
                        }

                        rs = statement.executeQuery();

                        while (rs.next()) {
                            String bookId = rs.getString("bookid");
                            String bookName = rs.getString("bookname");
                            String authorName = rs.getString("author");
                            String genre = rs.getString("genre");
                            String isbn = rs.getString("isbn");
                            String publisher = rs.getString("publisher");
                            String publishYear = rs.getString("year_published");
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( bookId );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( bookName );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( authorName );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( genre );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( isbn );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( publisher );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( publishYear );
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <form method=\"post\" action=\"ViewBooks.jsp\" style=\"display:inline;\">\n");
      out.write("                            <input type=\"hidden\" name=\"deleteId\" value=\"");
      out.print( bookId );
      out.write("\">\n");
      out.write("                            <button type=\"submit\" class=\"delete-button\">Delete</button>\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
      } 
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        ");

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Clean up resources
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (c != null) {
                    try {
                        c.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

            // Handle delete request
            String deleteId = request.getParameter("deleteId");
            if (deleteId != null) {
                try {
                    c = DriverManager.getConnection("jdbc:derby://localhost:1527/Library");
                    String deleteSql = "DELETE FROM book_detail WHERE bookid = ?";
                    statement = c.prepareStatement(deleteSql);
                    statement.setString(1, deleteId);
                    int rowsDeleted = statement.executeUpdate();
                    if (rowsDeleted > 0) {
                        out.println("<p class='success'>Book deleted successfully.</p>");
                        response.sendRedirect("ViewBooks.jsp"); // Refresh the page to reflect changes
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    // Clean up resources
                    if (statement != null) {
                        try {
                            statement.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                    if (c != null) {
                        try {
                            c.close();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        
      out.write("\n");
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
