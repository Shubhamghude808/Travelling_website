package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.IOException;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.sql.*;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Random;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin LOG</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/img/favicon.png\" type=\"image/png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/admin.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"header\" id=\"header\">\n");
      out.write("            <nav class=\"nav container\">\n");
      out.write("                <a href=\"Home.jsp\" class=\"nav__logo\">Travel</a>\n");
      out.write("                <div class=\"nav__toggle\" id=\"nav-toggle\">\n");
      out.write("                    <i class=\"ri-function-line\"></i>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <div class=\"container bootstrap snippets bootdey\" >\n");
      out.write("    <div class=\"row login-page\" style=\"background-image: url(assets/img/admin.jpg); background-size: cover\"> \n");
      out.write("        <div class=\"col-md-4 col-lg-4 col-md-offset-4 col-lg-offset-4\" style=\"margin-top: 100px\"> \n");
      out.write("    \t\t<img src=\"https://bootdey.com/img/Content/avatar/avatar7.png\" class=\"user-avatar img-thumbnail\"> \n");
      out.write("                <h1 class=\"new\" style=\"color: white\">ADMIN</h1> \n");
      out.write("    \t\t<form role=\"form\" class=\"ng-pristine ng-valid\"> \n");
      out.write("    \t\t\t<div class=\"form-content\"> \n");
      out.write("    \t\t\t\t<div class=\"form-group\"> \n");
      out.write("                                    <input type=\"text\" class=\"form-control input-underline input-lg\" placeholder=\"Email\" name=\"email\"> \n");
      out.write("    \t\t\t\t</div> \n");
      out.write("    \t\t\t\t<div class=\"form-group\"> \n");
      out.write("                                    <input type=\"password\" class=\"form-control input-underline input-lg\" placeholder=\"Password\" name=\"pass\"> \n");
      out.write("    \t\t\t\t</div> \n");
      out.write("    \t\t\t</div> \n");
      out.write("                    <button class=\"btn btn-info btn-lg\" style=\"padding-bottom: 5px;padding-left: 10px; padding-right: 10px; padding-top: 5px\" value=\"login\" name=\"log\">\n");
      out.write("                            Log in\n");
      out.write("    \t\t\t</button> &nbsp; \n");
      out.write("    \t\t\t<!--<button type=\"submit\" class=\"btn btn-info btn-lg\" style=\"padding-bottom: 5px;padding-left: 10px; padding-right: 10px; padding-top: 5px\">Register</button>-->\n");
      out.write("    \t\t</form> \n");
      out.write("                \n");
      out.write("                ");
 Class.forName("org.apache.derby.jdbc.ClientDriver"); 
      out.write("\n");
      out.write("                                                        ");

                                                        
                                                             String action = request.getParameter("log");
                                                             
                                                                if ("login".equals(action)) {
                                                                   // Your JSP code to execute when the button is clicked
                                                                    
                                                                 String adm="root";     
                                                                 String adp="root"; 
                                                                 
                                                            String email=request.getParameter("email");
                                                            String pass=request.getParameter("pass");
                                                            
                                                            
                                                            
                                                            if(email.equalsIgnoreCase(adm) && pass.equalsIgnoreCase(adp)){
                                                                          response.sendRedirect("design.jsp");           
                                                                }
                                                            else{
                                                                response.sendRedirect("log.jsp");   
                                                            }}
                                                        
      out.write("\n");
      out.write("    \t</div> \n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
