package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public final class log_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Error </title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/log.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"ex-page-content bootstrap snippets bootdeys\" style=\"display: flex;\n");
      out.write("  justify-content: center;\n");
      out.write("  align-items: center;\n");
      out.write("  height: 100vh; /* Adjust as needed */\">\n");
      out.write("    <div class=\"container\" >\n");
      out.write("        <div class=\"row\" style=\"display: flex\">\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <svg class=\"svg-box\" width=\"380px\" height=\"500px\" viewBox=\"0 0 837 1045\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:sketch=\"http://www.bohemiancoding.com/sketch/ns\">\n");
      out.write("                    <g id=\"Page-1\" stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\" sketch:type=\"MSPage\">\n");
      out.write("                        <path d=\"M353,9 L626.664028,170 L626.664028,487 L353,642 L79.3359724,487 L79.3359724,170 L353,9 Z\" id=\"Polygon-1\" stroke=\"#3bafda\" stroke-width=\"6\" sketch:type=\"MSShapeGroup\"></path>\n");
      out.write("                        <path d=\"M78.5,529 L147,569.186414 L147,648.311216 L78.5,687 L10,648.311216 L10,569.186414 L78.5,529 Z\" id=\"Polygon-2\" stroke=\"#7266ba\" stroke-width=\"6\" sketch:type=\"MSShapeGroup\"></path>\n");
      out.write("                        <path d=\"M773,186 L827,217.538705 L827,279.636651 L773,310 L719,279.636651 L719,217.538705 L773,186 Z\" id=\"Polygon-3\" stroke=\"#f76397\" stroke-width=\"6\" sketch:type=\"MSShapeGroup\"></path>\n");
      out.write("                        <path d=\"M639,529 L773,607.846761 L773,763.091627 L639,839 L505,763.091627 L505,607.846761 L639,529 Z\" id=\"Polygon-4\" stroke=\"#00b19d\" stroke-width=\"6\" sketch:type=\"MSShapeGroup\"></path>\n");
      out.write("                        <path d=\"M281,801 L383,861.025276 L383,979.21169 L281,1037 L179,979.21169 L179,861.025276 L281,801 Z\" id=\"Polygon-5\" stroke=\"#ffaa00\" stroke-width=\"6\" sketch:type=\"MSShapeGroup\"></path>\n");
      out.write("                    </g>\n");
      out.write("                </svg>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <div class=\"message-box\">\n");
      out.write("                    <h1 class=\"m-b-0\">500</h1>\n");
      out.write("                    <p>Login Server Error.</p>\n");
      out.write("                    <div class=\"buttons-con\">\n");
      out.write("                        <div class=\"action-link-wrap\">\n");
      out.write("                            <a href=\"admin.jsp\" class=\"btn btn-custom btn-info waves-effect waves-light m-t-20\">Go Back</a>\n");
      out.write("                            <a href=\"Home.jsp\" class=\"btn btn-custom btn-info waves-effect waves-light m-t-20\">Go to Home Page</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("        \n");
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
