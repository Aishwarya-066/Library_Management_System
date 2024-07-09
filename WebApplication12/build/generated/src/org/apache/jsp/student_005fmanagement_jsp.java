package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class student_005fmanagement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: black; color: white\"> <center>\n");
      out.write("        <h1>MOVIES LIST!</h1>\n");
      out.write("        \n");
      out.write("   <body>\n");
      out.write("      \n");
      out.write("      <form>\n");
      out.write("         First Name: <input type = \"text\" name = \"first_name\">\n");
      out.write("         <br />\n");
      out.write("         Last Name: <input type = \"text\" name = \"last_name\" />\n");
      out.write("         <input type = \"submit\" value = \"Submit\" />\n");
      out.write("      </form>\n");
      out.write("      \n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

//            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/movies");
//            Statement st=c.createStatement();
//            Statement st1=c.createStatement();
//            Statement st2=c.createStatement();
//            Statement st3=c.createStatement();
//            ResultSet rs = st.executeQuery("Select * from movies");
//            ResultSet rs1 = st1.executeQuery("Select count(movie_id) from movies");
//            ResultSet rs2 = st2.executeQuery("Select avg(price) from movies");
//            ResultSet rs3 = st3.executeQuery("SELECT director FROM movies GROUP BY director ORDER BY avg(rating) DESC FETCH FIRST 1 ROWS ONLY");
             
           
        
      out.write("\n");
      out.write("            <table cellpadding=30px; border=\"2\" style=\"border-collapse: collapse;\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>MOVIE_ID</th>\n");
      out.write("                        <th>TITLE</th>\n");
      out.write("                        <th>DIRECTOR</th>\n");
      out.write("                        <th>RATING</th>\n");
      out.write("                        <th>PRICE</th>\n");
      out.write("                    </tr>\n");
      out.write("            ");

//            while(rs.next())
//            {
//                out.println("<tr><td>"+rs.getInt(1)+"</td>");
//                out.println("<td>"+rs.getString(2)+"</td>");
//                out.println("<td>"+rs.getString(3)+"</td>");
//                out.println("<td>"+rs.getInt(4)+"</td>");
//                out.println("<td>"+rs.getDouble(5)+"</td></tr>");
//               
//            }
//          out.println(" </table><br><br><table cellpadding=30px; border='2' style='border-collapse: collapse;'><tr> <th>TOTAL MOVIES IN LIST</th><th>AVERAGE PRICE IN LIST</th> <th>MAXIMUM RATING DIRECTOR</th></tr>");
//                     rs1.next();
//                     out.println("<tr><td>"+rs1.getInt(1)+"</td>");
//                     rs2.next();
//                     out.println("<td>"+rs2.getDouble(1)+"</td>");
//                     rs3.next();
//                     out.println("<td>"+rs3.getString(1)+"</td></tr>");
//                         
//                      
//                    
                
      out.write(" \n");
      out.write("           \n");
      out.write("             </table>\n");
      out.write("             </center>\n");
      out.write("    </body>\n");
      out.write("</html>-->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Front page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            background-image:  url(\"https://wallpapercave.com/wp/wp9473555.jpg\");\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            text-align: center;\n");
      out.write("            background-size: cover;\n");
      out.write("           color: white;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        div{\n");
      out.write("            margin-top: 150px;\n");
      out.write("        }\n");
      out.write("        div a{\n");
      out.write("            text-decoration: none;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        </style>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("        <h1>WELCOME TO STUDENT MANAGEMENT</h1>\n");
      out.write("        <h1>SYSTEM</h1>\n");
      out.write("        <br>\n");
      out.write("        <h2>LOGIN</h2>\n");
      out.write("        \n");
      out.write("        <form action=\"http://localhost:8080/WebApplication12/loginservlet\" method=\"post\">\n");
      out.write("            \n");
      out.write("               ");
      out.write("\n");
      out.write("    ");
 if (request.getParameter("error") != null) { 
      out.write("\n");
      out.write("        <p style=\"color: white;\">Invalid username or password. Please try again.</p>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("<!--    ID: <input type = \"text\" name = \"id\">\n");
      out.write("        <br>\n");
      out.write("        <br>-->\n");
      out.write("    \n");
      out.write("        USER NAME: <input type = \"text\" name = \"username\">\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        PASSWORD: <input type = \"password\" name = \"password\" />\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        ROLE: \n");
      out.write("        <select name=\"role\">\n");
      out.write("            <option value=\"admin\">Admin</option>\n");
      out.write("            <option value=\"student\">Student</option>\n");
      out.write("        </select><br>\n");
      out.write("        <br>\n");
      out.write("         <input type = \"submit\" value = \"Submit\" />\n");
      out.write("      </form>\n");
      out.write("      \n");
      out.write("\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
