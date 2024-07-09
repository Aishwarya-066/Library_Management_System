package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>update</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>update student mark data</h1>\n");
      out.write("        <form action=\"http://localhost:8080/WebApplication12/updatingstudent\" method=\"post\">\n");
      out.write("            ID: <input type = \"text\" name = \"id\">\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        COURSE1: <input type = \"text\" name = \"c1\" />\n");
      out.write("        \n");
      out.write("        COURSE2: <input type = \"text\" name = \"c2\" />\n");
      out.write("        \n");
      out.write("        COURSE3: <input type = \"text\" name = \"c3\" />\n");
      out.write("        \n");
      out.write("        COURSE4: <input type = \"text\" name = \"c4\" />\n");
      out.write("        \n");
      out.write("        COURSE5: <input type = \"text\" name = \"c5\" />\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        GRADE1: <input type = \"text\" name = \"g1\" />\n");
      out.write("        \n");
      out.write("        GRADE2: <input type = \"text\" name = \"g2\" />\n");
      out.write("        \n");
      out.write("        GRADE3: <input type = \"text\" name = \"g3\" />\n");
      out.write("       \n");
      out.write("        GRADE4: <input type = \"text\" name = \"g4\" />\n");
      out.write("        \n");
      out.write("        GRADE5: <input type = \"text\" name = \"g5\" />\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        RESULT1: <input type = \"text\" name = \"r1\" />\n");
      out.write("        \n");
      out.write("        RESULT2: <input type = \"text\" name = \"r2\" />\n");
      out.write("        \n");
      out.write("        RESULT3: <input type = \"text\" name = \"r3\" />\n");
      out.write("        \n");
      out.write("        RESULT4: <input type = \"text\" name = \"r4\" />\n");
      out.write("        \n");
      out.write("        RESULT5: <input type = \"text\" name = \"r5\" />\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("         <input type = \"submit\" value = \"Submit\" />\n");
      out.write("      \n");
      out.write("        </form>\n");
      out.write("         ");
 if (request.getParameter("error") != null) { 
      out.write("\n");
      out.write("        <p style=\"color: white;\">updation failed.</p>\n");
      out.write("    ");
 } 
      out.write("\n");
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
