package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Register</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: whitesmoke;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .header {\n");
      out.write("    background-color: #333;\n");
      out.write("    color: white;\n");
      out.write("    padding: 15px;\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: space-between;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header h1 {\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(" a {\n");
      out.write("    color: white;\n");
      out.write("    text-decoration: none;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    transition: background-color 0.3s, color 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:hover {\n");
      out.write("    background-color: #555;\n");
      out.write("    color: whitesmoke;\n");
      out.write("}\n");
      out.write("        .register-form {\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.9);\n");
      out.write("            max-width: 800px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        form h2 {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("            font-size: 24px;\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            margin-bottom: 50px;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("        input, textarea {\n");
      out.write("            width: 60%;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        input:focus, textarea:focus {\n");
      out.write("            border-color: #007BFF;\n");
      out.write("            outline: none;\n");
      out.write("        }\n");
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
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("        .error {\n");
      out.write("            color: red;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
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
      out.write("         <a href=\"Login.jsp\">Login</a>\n");
      out.write("    </div>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"register-form\">\n");
      out.write("            <h1>REGISTER</h1>\n");
      out.write("            ");

                boolean hasErrors = false;
                StringBuilder errors = new StringBuilder();
                Connection c = null;
                PreparedStatement statement = null;

                try {
                    c = DriverManager.getConnection("jdbc:derby://localhost:1527/Library");

                    String name = request.getParameter("uname");
                    String email = request.getParameter("email");
                    String password = request.getParameter("password");
                    String confirmPassword = request.getParameter("cpassword");
                    int id = -1;

                    if ("POST".equalsIgnoreCase(request.getMethod())) {
                        // Validate ID
                        String idParam = request.getParameter("id");
                        try {
                            id = Integer.parseInt(idParam);
                        } catch (NumberFormatException e) {
                            hasErrors = true;
                            errors.append("<p class='error'>Invalid ID format.</p>");
                        }

                        // Validate other inputs
                        if (name == null || name.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>Name is required.</p>");
                        }
                        if (email == null || email.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>Email is required.</p>");
                        } else if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                            hasErrors = true;
                            errors.append("<p class='error'>Invalid email format.</p>");
                        }
                        if (password == null || password.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>Password is required.</p>");
                        } else if (!password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")) {
                            hasErrors = true;
                            errors.append("<p class='error'>Password must contain at least one uppercase letter, one number, and one special character.</p>");
                        }
                        if (confirmPassword == null || confirmPassword.trim().isEmpty()) {
                            hasErrors = true;
                            errors.append("<p class='error'>Confirm Password is required.</p>");
                        } else if (!password.equals(confirmPassword)) {
                            hasErrors = true;
                            errors.append("<p class='error'>Passwords do not match.</p>");
                        }

                        if (!hasErrors) {
                            String sql = "INSERT INTO login (user_id, user_name, password, email) VALUES (?, ?, ?, ?)";
                            statement = c.prepareStatement(sql);
                            statement.setInt(1, id);
                            statement.setString(2, name);
                            statement.setString(3, password);
                            statement.setString(4, email);

                            int rowsInserted = statement.executeUpdate();
                            if (rowsInserted > 0) {
                                out.println("<p class='success'>Registration successful.</p>");
                                name = "";
                                email = "";
                                password = "";
                                confirmPassword = "";
                            }
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    errors.append("<p class='error'>Database error: " + e.getMessage() + "</p>");
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
            
      out.write("\n");
      out.write("            <form id=\"registerForm\" method=\"post\" action=\"Register.jsp\">\n");
      out.write("                ");
      out.print( errors.toString() );
      out.write("\n");
      out.write("                \n");
      out.write("                <label for=\"uname\">ENTER YOUR NAME</label>\n");
      out.write("                <input type=\"text\" id=\"uname\" name=\"uname\" value=\"\">\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"id\">ENTER YOUR ID</label>\n");
      out.write("                <input type=\"text\" id=\"id\" name=\"id\" value=\"\">\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"email\">ENTER YOUR EMAIL</label>\n");
      out.write("                <input type=\"email\" id=\"email\" name=\"email\" value=\"\">\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"password\">PASSWORD</label>\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\">\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"cpassword\">CONFIRM PASSWORD</label>\n");
      out.write("                <input type=\"password\" id=\"cpassword\" name=\"cpassword\">\n");
      out.write("                <br><br>\n");
      out.write("                <input type=\"submit\" value=\"Register\">\n");
      out.write("            </form>\n");
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
