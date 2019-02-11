package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pojos.Crust;
import DLBeans.PizzaDL;
import pojos.Size;
import java.util.ArrayList;
import pojos.Topping;
import DLBeans.ToppingDL;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("  <title>Luis' Pizza - Order</title>\n");
      out.write("  <meta charset=\"utf-8\"/>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\"/>\n");
      out.write("  <link rel=\"stylesheet\" href=\"PizzaLayout.css\"/>\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-default navDisplay\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"order.jsp\">Luis' Pizzas</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"order.jsp\">Order</a></li>\n");
      out.write("      <li><a href=\"Elogin.xhtml\">Employee</a></li>\n");
      out.write("      <li><a href=\"Cart.jsp\">Cart</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container contDisplay\">\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                ");

                
                String messageD = request.getParameter("msg");
                if(messageD != null){
                out.println("<h1>" + messageD + "</h1>");
                }
            
      out.write("\n");
      out.write("            </div>\n");
      out.write("        <div class=\"col-md-6 displayBG\">\n");
      out.write("                                    <h2>Build Your Own Pizza!</h2>\n");
      out.write("\t\t\t\t\t<form action=\"addToCart_proc\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"crust\" class=\"cols-sm-2 control-label\">Select Crust Type</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <select name=\"crust\" id=\"crust\" required>\n");
      out.write("                                                                        <option></option>\n");
      out.write("                                                                        ");

                                                                            ArrayList<Crust> crusts = PizzaDL.FecthCrustTypes();

                                                                            for(Crust c:crusts){
                                                                                    out.println("<option value='"+c.getName() + "|" + c.getId() + "'>"+ c.getName()+"</option>");
                                                                            }
                                                                        
      out.write("\n");
      out.write("                                                                    </select>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"size\" class=\"cols-sm-2 control-label\">Select Size</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <select name=\"size\" id=\"size\" required>\n");
      out.write("                                                                        <option></option>\n");
      out.write("                                                                        ");

                                                                            ArrayList<Size> sizes = PizzaDL.FecthSizes();

                                                                            for(Size s:sizes){
                                                                                    out.println("<option value='"+s.getName() + "|" + s.getSizeID() + "'>"+ s.getName()+"</option>");
                                                                            }
                                                                        
      out.write("                                                                 \n");
      out.write("                                                                    </select>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                \n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"toppings\" class=\"cols-sm-2 control-label\">Select Toppings</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                            ");

                                                                                ArrayList<Topping> topps = ToppingDL.FetchAllToppings();
                                                                                int i = 1;    
                                                                                for(Topping t:topps){
                                                                                        if(i == 1){
                                                                                            out.println("<input checked type=\"checkbox\" name='topping"+i+ "' value='"+t.getToppingID()+ "|" + t.getToppingName() + "|" + t.getToppingPrice()+ "'>"+ t.getToppingName()+". Price: $" + t.getToppingPrice() + "</option><br>");
                                                                                            
                                                                                        }else{
                                                                                            out.println("<input type=\"checkbox\" name='topping"+i+ "' value='"+t.getToppingID()+ "|"+t.getToppingName() + "|" + t.getToppingPrice()+ "'>"+ t.getToppingName()+". Price: $" + t.getToppingPrice() + "</option><br>");
                                                                                        
                                                                                        }
                                                                                        i++;
                                                                                }
                                                                                out.println("<input type='hidden' name='toppings' value='"+i+"'/>");
                                                                            
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"quantity\" class=\"cols-sm-2 control-label\">How many do you want?</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <select name=\"quantity\" id=\"quantity\" required>\n");
      out.write("                                                                        <option></option>\n");
      out.write("                                                                        ");

                                                                            

                                                                            for(int it = 1; it<= 5; it++){
                                                                                    out.println("<option value='"+ it + "'>"+ it +"</option>");
                                                                            }
                                                                        
      out.write("                                                                 \n");
      out.write("                                                                    </select>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group \">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" name=\"button\" id=\"button\" value=\"Add To Cart\" class=\" btnDis btn btn-primary \"/>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("            </div>\n");
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
