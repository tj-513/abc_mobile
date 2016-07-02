package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.abc.products.Product;
import com.abc.file.FileOperations;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>B-Mobile Online Shopping</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core CSS Uses relative paths from jsp  -->\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom CSS -->\r\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("css/heroic-features.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <!-- Navigation -->\r\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("                        <span class=\"lead\">B-Mobile</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">About</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Services</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Contact</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.navbar-collapse -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.container -->\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page Content -->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                <!-- Indicators -->\r\n");
      out.write("                <ol class=\"carousel-indicators\">\r\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\r\n");
      out.write("                    <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\r\n");
      out.write("                </ol>\r\n");
      out.write("\r\n");
      out.write("                <!-- Wrapper for slides -->\r\n");
      out.write("                <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("                    <div class=\"item active\">\r\n");
      out.write("                        <img src=\"images/banner2.jpg\" alt=\"...\">\r\n");
      out.write("                        <div class=\"carousel-caption\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <img src=\"images/banner1.jpg\" alt=\"...\">\r\n");
      out.write("                        <div class=\"carousel-caption\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"item\">\r\n");
      out.write("                        <img src=\"images/banner3.jpg\" alt=\"...\">\r\n");
      out.write("                        <div class=\"carousel-caption\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Controls -->\r\n");
      out.write("                    <a class=\"left carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("                        <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("                        <span class=\"sr-only\">Previous</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a class=\"right carousel-control\" href=\"#carousel-example-generic\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("                        <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("                        <span class=\"sr-only\">Next</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Jumbotron Header -->\r\n");
      out.write("                <header class=\"jumbotron\" style=\"text-align:center\">\r\n");
      out.write("\r\n");
      out.write("                    <h1>B-Mobile</h1>\r\n");
      out.write("                    <p style=\"text-align:center;\">Our Greatest pleasure is in giving you products with greatest quality.</p>\r\n");
      out.write("                    <p><a class=\"btn btn-primary btn-large\">Contact Us</a>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </header>\r\n");
      out.write("\r\n");
      out.write("                <hr>\r\n");
      out.write("\r\n");
      out.write("                <!-- Title -->            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Page Features -->\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <!-- Phone brands -->\r\n");
      out.write("                    <div class=\"list-group\">\r\n");
      out.write("                        <a href=\"#\" class=\"list-group-item active\">Latest</a>\r\n");
      out.write("                        <a href=\"#\" class=\"list-group-item\">Samsung</a>\r\n");
      out.write("                        <a href=\"#\" class=\"list-group-item\">Microsoft</a>\r\n");
      out.write("                        <a href=\"#\" class=\"list-group-item\">Apple</a>\r\n");
      out.write("                        <a href=\"#\" class=\"list-group-item\">HTC</a>\r\n");
      out.write("                        <a href=\"#\" class=\"list-group-item\">Huawei</a>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <span>Search Available items</span>\r\n");
      out.write("                        <form class=\"form-inline\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control col-md-9\" placeholder=\"find\">\r\n");
      out.write("                            <input type=\"submit\" value=\"Find\" class=\"btn btn-primary col-md-2\">\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!-- left column end-->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"row text-left col-md-9\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-12\">\r\n");
      out.write("                            <h3>Latest products available</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        ");
 ArrayList<Product> productList = (ArrayList) request.getAttribute("products"); 
      out.write(" \r\n");
      out.write("                       ");
 System.out.println(productList); 
      out.write("\r\n");
      out.write("                        ");
 for (Product product : productList) {
      out.write(" \r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("                            <div class=\"thumbnail\"> \r\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" /images/");
      out.print(product.getImage());
      out.write("\" alt=\"\">\r\n");
      out.write("                                <div class=\"caption\">\r\n");
      out.write("                                    <h4 class=\"pull-right\">$");
      out.print(product.getPrice());
      out.write("</h4>\r\n");
      out.write("                                    <h4><a href=\"#\">");
      out.print(product.getName());
      out.write("</a> </h4> \r\n");
      out.write("                                    <p> ");
      out.print(product.getDescription());
      out.write(" </p>\r\n");
      out.write("                                </div> \r\n");
      out.write("                                <div class=\"ratings\"> \r\n");
      out.write("                                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product.jsp\" class=\"btn btn-primary\">Order Now</a>\r\n");
      out.write("                                </div> \r\n");
      out.write("                            </div> \r\n");
      out.write("                        </div> \r\n");
      out.write("                        ");
 }
      out.write(" \r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /.row -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("\r\n");
      out.write("            <!-- Footer -->\r\n");
      out.write("\r\n");
      out.write("            <footer>\r\n");
      out.write("                <div class=\"row\" style=\"background-color:#999\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                        <p>Copyright &copy; B-Mobile.com 2014</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
