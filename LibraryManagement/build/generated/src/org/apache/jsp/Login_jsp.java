package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Login</title>\n");
      out.write("    <style>\n");
      out.write("/*        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("              background: url('https://static01.nyt.com/images/2015/10/24/opinion/24manguel/24manguel-superJumbo.jpg') no-repeat center center fixed;\n");
      out.write("            background-size: cover;\n");
      out.write("   \n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("            background-color: whitesmoke;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("              .header {\n");
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
      out.write(" .header a {\n");
      out.write("    color: white;\n");
      out.write("    text-decoration: none;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    transition: background-color 0.3s, color 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header a:hover {\n");
      out.write("    background-color: #555;\n");
      out.write("    color: whitesmoke;\n");
      out.write("}\n");
      out.write("     \n");
      out.write("        #register-form {\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("        .login-form {\n");
      out.write("            background-color: white;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.9);\n");
      out.write("            max-width: 550px;\n");
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
      out.write("        }*/\n");
      out.write("body {\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    background-color: #f5f5f5;\n");
      out.write("    display: flex;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    height: 100vh;\n");
      out.write("    background-image: url('https://static01.nyt.com/images/2015/10/24/opinion/24manguel/24manguel-superJumbo.jpg'); /* Add a background image */\n");
      out.write("    background-size: cover;\n");
      out.write("    background-position: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header {\n");
      out.write("    background-color: rgba(51, 51, 51, 0.8);\n");
      out.write("    color: white;\n");
      out.write("    padding: 15px;\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header h1 {\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header a {\n");
      out.write("    color: white;\n");
      out.write("    text-decoration: none;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    transition: background-color 0.3s, color 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header a:hover {\n");
      out.write("    background-color: #555;\n");
      out.write("    color: whitesmoke;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-form {\n");
      out.write("    background-color: rgba(255, 255, 255, 0.9);\n");
      out.write("    padding: 40px;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n");
      out.write("    max-width: 400px;\n");
      out.write("    width: 100%;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-form h1 {\n");
      out.write("    margin-bottom: 30px;\n");
      out.write("    color: #333;\n");
      out.write("    font-size: 28px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("    display: block;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input, textarea {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input:focus, textarea:focus {\n");
      out.write("    border-color: #007BFF;\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color: #007BFF;\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 16px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    transition: background-color 0.3s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"]:hover {\n");
      out.write("    background-color: #0056b3;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".error {\n");
      out.write("    color: red;\n");
      out.write("    font-weight: bold;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".success {\n");
      out.write("    color: green;\n");
      out.write("    font-weight: bold;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("       <div class=\"header\">\n");
      out.write("        <h1>LMS</h1>\n");
      out.write("         <a href=\"Register.jsp\">Register</a>\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <center>\n");
      out.write("        <div class=\"login-form\">\n");
      out.write("            <h1>LOGIN</h1>\n");
      out.write("            ");
 
                String username = request.getParameter("uname");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                boolean hasErrors = false;
                String errorMessage = "";

                Connection c = null;
                PreparedStatement statement = null;
                ResultSet rs = null;

                try {
                    c = DriverManager.getConnection("jdbc:derby://localhost:1527/Library");

                    if ("POST".equalsIgnoreCase(request.getMethod())) {
                        if (username == null || username.trim().isEmpty() || email == null || email.trim().isEmpty() || password == null || password.trim().isEmpty()) {
                            hasErrors = true;
                            errorMessage = "<p class='error'>All fields are required.</p>";
                        }

                        if (!hasErrors) {
                            String sql = "SELECT * FROM login WHERE user_name = ? AND email = ?";
                            statement = c.prepareStatement(sql);
                            statement.setString(1, username);
                            statement.setString(2, email);
                            rs = statement.executeQuery();

                            if (rs.next()) {
                                // User is registered; now check the password
                                String storedPassword = rs.getString("password");
                                if (storedPassword.equals(password)) {
                                    out.println("<p class='success'>Login successful.</p>");
                                    // Redirect to the main page or dashboard
                                    response.sendRedirect("main.jsp");
                                } else {
                                    errorMessage = "<p class='error'>Incorrect password.</p>";
                                }
                            } else {
                                errorMessage = "<p class='error'>Not registered. Please <a href='Register.jsp'>register</a>.</p>";
                            }
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    errorMessage = "<p class='error'>Database error: " + e.getMessage() + "</p>";
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
            
      out.write("\n");
      out.write("            <form id=\"Login\" action=\"Login.jsp\" method=\"post\">\n");
      out.write("                ");
      out.print( errorMessage );
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
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" value=\"\">\n");
      out.write("                <br><br>\n");
      out.write("                <input type=\"submit\" value=\"LOGIN\">\n");
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
