package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<!--        <link rel=\"stylesheet\" href=\"/Assets/css/bootstrap-theme.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Assets/css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/Assets/css/bootstrap-theme.css\">\n");
      out.write("        <script src=\"/Assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"/Assets/js/jquery-1.11.2.min.js\"></script>-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <title>Welcome to Spring Web MVC project</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("       <div class=\"container\">\n");
      out.write("           <div class=\"row\">\n");
      out.write("               <div class=\"col-md-4-4\" >jkahkjHSA</div>\n");
      out.write("               <div class=\"col-m-4\">aaaaa</div>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"row\">\n");
      out.write("            <div class=\"col-xs-12 col-sm-6 col-md-8\">.col-xs-12 .col-sm-6 .col-md-8</div>\n");
      out.write("            <div class=\"col-xs-6 col-md-4\">.col-xs-6 .col-md-4</div>\n");
      out.write("          </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-xs-6 col-sm-4\">.col-xs-6 .col-sm-4</div>\n");
      out.write("              <div class=\"col-xs-6 col-sm-4\">.col-xs-6 .col-sm-4</div>\n");
      out.write("              <!-- Optional: clear the XS cols if their content doesn't match in height -->\n");
      out.write("              <div class=\"clearfix visible-xs-block\"></div>\n");
      out.write("              <div class=\"col-xs-6 col-sm-4\">.col-xs-6 .col-sm-4</div>\n");
      out.write("            </div>\n");
      out.write("       </div>\n");
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
