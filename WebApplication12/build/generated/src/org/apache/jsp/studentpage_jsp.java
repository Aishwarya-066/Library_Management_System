package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class studentpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("     <style>\n");
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
      out.write("    <body>\n");
      out.write("         <center>\n");
      out.write("        <h1>STUDENT DETAILS</h1>\n");
      out.write("        <form action=\"marksheet.jsp\" method=\"post\">\n");
      out.write("            ID: <input type = \"text\" name = \"id\">\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("          <input type = \"submit\" value = \"Submit\" />\n");
      out.write("        </form>\n");
      out.write("         ");

//           Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/Students");
//         
//           int id = Integer.valueOf(request.getParameter("id"));
//       
//         String sql = "SELECT * FROM student_detail WHERE id = ?";
// 
//PreparedStatement statement = c.prepareStatement(sql);
//statement.setInt(1, id);
//ResultSet rs = statement.executeQuery();
        
      out.write("\n");
      out.write("<!--            <table cellpadding=30px; border=\"2\" style=\"border-collapse: collapse;\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>NAME</th>\n");
      out.write("                        <th>EMAIL</th>\n");
      out.write("                        <th>CLASS</th>\n");
      out.write("                    </tr>-->\n");
      out.write("            ");

//            while(rs.next())
//            {
//                out.println("<tr><td>"+rs.getInt(1)+"</td>");
//                out.println("<td>"+rs.getString(2)+"</td>");
//                out.println("<td>"+rs.getString(3)+"</td>");
//                out.println("<td>"+rs.getString(4)+"</td>");
//                
//               
//            } 
// if (rs.next()) {
//                        out.println("<h2>ID: " + rs.getInt("id") + "</h2>");
//                        out.println("<h2>NAME: " + rs.getString("name") + "</h2>");
//                        out.println("<h2>EMAIL: " + rs.getString("email") + "</h2>");
//                        out.println("<h2>CLASS: " + rs.getString("class") + "</h2>");
//                    } else {
//                        out.println("<h2>No student found with ID: " + id + "</h2>");
//                    }
//               
            
                
      out.write(" \n");
      out.write("<!--                <button onclick=\"printMarksheet()\">Print Marksheet</button>-->\n");
      out.write("                </center>\n");
      out.write("           \n");
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
