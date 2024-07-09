package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class marksheet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("        /* Add your CSS styling here */\n");
      out.write("       \n");
      out.write("        /* Print styles */\n");
      out.write("        @media print {\n");
      out.write("            body {\n");
      out.write("                -webkit-print-color-adjust: exact;\n");
      out.write("            }\n");
      out.write("            button {\n");
      out.write("                display: none; /* Hide print button during printing */\n");
      out.write("            }\n");
      out.write("            @page {\n");
      out.write("                margin: 0; /* Remove margins to avoid unwanted browser headers and footers */\n");
      out.write("            }\n");
      out.write("            body {\n");
      out.write("                margin: 1cm; /* Add margin to avoid content being cut off */\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("      <script>\n");
      out.write("        function printMarksheet() {\n");
      out.write("            window.print();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

           Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/Students");
         
           int id = Integer.valueOf(request.getParameter("id"));
       
         String sql = "SELECT * FROM student_detail WHERE id = ?";
 
PreparedStatement statement = c.prepareStatement(sql);
statement.setInt(1, id);
ResultSet rs1 = statement.executeQuery();
if (rs1.next()) {
                        out.println("<h3>ID: " + rs1.getInt("id") + "</h3>");
                        out.println("<h3>NAME: " + rs1.getString("sname") + "</h3>");
                        out.println("<h3>EMAIL: " + rs1.getString("email") + "</h3>");
                        out.println("<h3>CLASS: " + rs1.getString("class") + "</h3>");
                    } else {
                        out.println("<h2>No student found with ID: " + id + "</h2>");
                    }
               

         String sql1 = "SELECT * FROM marks WHERE id = ?";
 
PreparedStatement statement1 = c.prepareStatement(sql1);
statement1.setInt(1, id);
ResultSet rs = statement1.executeQuery();


        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("            <table cellpadding=30px; border=\"2\" style=\"border-collapse: collapse;\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>COURSE</th>\n");
      out.write("                        <th>GRADE</th>\n");
      out.write("                        <th>RESULT</th>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("            ");

            while(rs.next())
            {
                out.println("<tr><td>"+rs.getString("c1")+"</td>");
                out.println("<td>"+rs.getString("g1")+"</td>");
                out.println("<td>"+rs.getString("r1")+"</td></tr>");
                out.println("<tr><td>"+rs.getString("c2")+"</td>");
                 out.println("<td>"+rs.getString("g2")+"</td>");
                out.println("<td>"+rs.getString("r2")+"</td></tr>");
                out.println("<tr><td>"+rs.getString("c3")+"</td></tr>");
                out.println("<td>"+rs.getString("g3")+"</td>");
                 out.println("<td>"+rs.getString("r3")+"</td></tr>");
                out.println("<tr><td>"+rs.getString("c4")+"</td>");
                out.println("<td>"+rs.getString("g4")+"</td>");
                out.println("<td>"+rs.getString("r4")+"</td></tr>");
                 out.println("<tr><td>"+rs.getString("c5")+"</td>");
                out.println("<td>"+rs.getString("g5")+"</td>");
                out.println("<td>"+rs.getString("r5")+"</td></tr>");
               
                
               
            } 
 
            
                
      out.write(" \n");
      out.write("           <button onclick=\"printMarksheet()\">Print Marksheet</button>     \n");
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
