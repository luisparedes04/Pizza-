package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DLBeans.ToppingDL;
import java.util.ArrayList;
import pojos.Topping;

public final class EmpManager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_view.release();
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
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      //  f:view
      com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.ViewTag.class) : new com.sun.faces.taglib.jsf_core.ViewTag();
      _jspx_th_f_view_0.setPageContext(_jspx_page_context);
      _jspx_th_f_view_0.setParent(null);
      _jspx_th_f_view_0.setJspId("id13");
      int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_f_view_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("<html>\n");
          out.write("<head>\n");
          out.write("  <title>Luis' Pizza - Employee Manager</title>\n");
          out.write("  <meta charset=\"utf-8\"/>\n");
          out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n");
          out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\"/>\n");
          out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
          out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
          out.write("</head>\n");
          out.write("\n");
          out.write("<nav class=\"navbar navbar-default\">\n");
          out.write("  <div class=\"container-fluid\">\n");
          out.write("    <div class=\"navbar-header\">\n");
          out.write("      <a class=\"navbar-brand\" href=\"order.jsp\">Luis' Pizzas</a>\n");
          out.write("    </div>\n");
          out.write("    <ul class=\"nav navbar-nav\">\n");
          out.write("      <li class=\"active\"><a href=\"order.jsp\">Order</a></li>\n");
          out.write("      <li><a href=\"Elogin.xhtml\">Employee</a></li>\n");
          out.write("      <li><a href=\"Cart.jsp\">Cart</a></li>\n");
          out.write("      <li><a href=\"Checkout.jsp\">Checkout</a></li>\n");
          out.write("    </ul>\n");
          out.write("  </div>\n");
          out.write("</nav>\n");
          out.write("    <body>\n");
          out.write("        <div class=\"container\">\n");
          out.write("            <div class=\"row\">\n");
          out.write("                <div class=\"col-md-4\">\n");
          out.write("                    <h5>Delete Topping</h5>\n");
          out.write("                    <form action=\"deleteTopping_proc\">\n");
          out.write("                        <select name=\"topping\">\n");
          out.write("            ");

                ArrayList<Topping> topps = ToppingDL.FetchAllToppings();
                
                for(Topping t:topps){
                        out.println("<option value='"+t.getToppingID() + "'>"+ t.getToppingName()+"</option>");
                }
            
          out.write("\t\n");
          out.write("                </select>\n");
          out.write("            <input type=\"hidden\" name=\"emp\" value=\"1\" />\n");
          out.write("                <input type=\"checkbox\" name=\"accept\" value=\"yes\">Delete Topping</input>\n");
          out.write("            <input type=\"submit\" name=\"button\" id=\"button\" value=\"Delete Topping\" class=\"btn btn-primary btn-lg btn-block login-button\"/>\n");
          out.write("            <h6>\n");
          out.write("            ");

                
                String messageD = request.getParameter("msgDelete");
                if(messageD != null){
                out.println("<h1>" + messageD + "</h1>");
                }
            
          out.write("\n");
          out.write("                </h6>\n");
          out.write("            </form>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"col-md-4\">\n");
          out.write("                    \t\t\t<h5>Add a Topping</h5>\n");
          out.write("\t\t\t\t\t<form action=\"addTopping_proc\">\n");
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t<label for=\"ToppingName\" class=\"cols-sm-2 control-label\">Topping</label>\n");
          out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" required name=\"topping\" id=\"topping\"  placeholder=\"Enter name of the topping\"/>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t<label for=\"price\" class=\"cols-sm-2 control-label\">Price</label>\n");
          out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" required name=\"price\" id=\"price\"  placeholder=\"Enter price of the topping\"/>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("                                                \n");
          out.write("                                                <div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t<label for=\"Employee\" class=\"cols-sm-2 control-label\">Employee ID</label>\n");
          out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
          out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" required name=\"emp\" readonly id=\"emp\" value=\"1\"/>\n");
          out.write("\t\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t<div class=\"form-group \">\n");
          out.write("\t\t\t\t\t\t\t<input type=\"submit\" name=\"button\" id=\"button\" value=\"Add Topping\" class=\"btn btn-primary btn-lg btn-block login-button\"/>\n");
          out.write("\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t</form>\n");
          out.write("            <div>\n");
          out.write("                <h1>\n");
          out.write("            ");

                
                String message = request.getParameter("msgAdd");
                if(message != null){
                out.println("<h1>" + message + "</h1>");
                }
            
          out.write("\n");
          out.write("                </h1>\n");
          out.write("            </div>\n");
          out.write("                </div>\n");
          out.write("                    <div class=\"col-md-4\">\n");
          out.write("                         <h5>Check Orders</h5>                                           \n");
          out.write("                    </div>\n");
          out.write("            </div> <!-- end of row -->\n");
          out.write("        </div>\n");
          out.write("    </body>\n");
          out.write("</html>    \n");
          int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
        return;
      }
      _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
      out.write('\n');
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
