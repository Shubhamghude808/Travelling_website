package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public final class design_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"shortcut icon\" href=\"assets/img/favicon.png\" type=\"image/png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/admin.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/design.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(assets/img/des.jpg); background-size: cover\">\n");
      out.write("        \n");
      out.write("        <header class=\"header\" id=\"header\">\n");
      out.write("            <nav class=\"nav container\">\n");
      out.write("                <a href=\"Home.jsp\" class=\"nav__logo\">Travel</a>\n");
      out.write("                <div class=\"nav__toggle\" id=\"nav-toggle\">\n");
      out.write("                    <i class=\"ri-function-line\"></i>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container bootstrap snippets bootdey\" style=\"margin-top: 100px\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\" style=\"display: flex;\n");
      out.write("    justify-content: center;\">\n");
      out.write("            <div class=\"main-box no-header clearfix\" style=\"display: inline-block;\n");
      out.write("  background-color: whitesmoke; /* For demonstration */\n");
      out.write("  padding: 10px; /* For demonstration */\n");
      out.write("  text-align: center;\n");
      out.write("  vertical-align: middle;\">\n");
      out.write("                <span class=\"main-box-body clearfix\" >\n");
      out.write("                    <div class=\"table-responsive\" style=\"display: flex;align-items: center;justify-content: center; height: 100%;\">\n");
      out.write("                        <table class=\"table user-list\" >\n");
      out.write("                            \n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                <th colspan=\"5\">CLIENT DB</th>\n");
      out.write("                                </tr><br><br>\n");
      out.write("                                <tr>\n");
      out.write("                                <th><span>ID</span></th>\n");
      out.write("                                <th><span>Name</span></th>\n");
      out.write("                                <th><span>Email</span></th>\n");
      out.write("                                <th><span>Phone No.</span></th>\n");
      out.write("                                <th><span>Destination</span></th>\n");
      out.write("                                <th>&nbsp;</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            \n");
      out.write("                            ");

            try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/javap", "root", "root");
                 Statement st=con.createStatement();
                 
                 String str="select * from persons";
                 
                 ResultSet rs=st.executeQuery(str);
                 
                 while(rs.next()){
                   
      out.write("\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print(rs.getInt("id"));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString("name") );
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString("email") );
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString("phone") );
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString("destination") );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                                ");

                 }
            }
            catch(Exception e){
                
            }
        
      out.write(" \n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                            \n");
      out.write("<div class=\"container bootstrap snippets bootdey\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\" style=\"display: flex;\n");
      out.write("    justify-content: center;\">\n");
      out.write("            <div class=\"main-box no-header clearfix\" style=\"display: inline-block;\n");
      out.write("  background-color: whitesmoke; /* For demonstration */\n");
      out.write("  padding: 10px; /* For demonstration */\n");
      out.write("  text-align: center;\n");
      out.write("  vertical-align: middle;\">\n");
      out.write("                <span class=\"main-box-body clearfix\" >\n");
      out.write("                    <div class=\"table-responsive\" style=\"display: flex;align-items: center;justify-content: center; height: 100%;\">\n");
      out.write("                        <table class=\"table user-list\" >\n");
      out.write("                            \n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                <th colspan=\"1\">NewsLetter Subscribers DB</th>\n");
      out.write("                                </tr><br><br>\n");
      out.write("                                <tr>\n");
      out.write("                                <th><span>EMAIL</span></th>\n");
      out.write("                                \n");
      out.write("                                <th>&nbsp;</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            \n");
      out.write("                            ");

            try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                 Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/javap", "root", "root");
                 Statement st=con.createStatement();
                 
                 String str="select * from subscribers";
                 
                 ResultSet rs=st.executeQuery(str);
                 
                 while(rs.next()){
                   
      out.write("\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                                <tr>\n");
      out.write("                       <td>");
      out.print(rs.getString("sub_email") );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                                ");

                 }
            }
            catch(Exception e){
                
            }
        
      out.write(" \n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
