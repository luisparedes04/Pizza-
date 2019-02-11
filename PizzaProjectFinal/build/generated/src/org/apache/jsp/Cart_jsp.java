package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DLBeans.PizzaDL;
import java.io.IOException;
import java.util.ArrayList;
import pojos.Pizza;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>Luis' Pizza - Cart</title>\n");
      out.write("  <meta charset=\"utf-8\"/>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\"/>\n");
      out.write("  <link rel=\"stylesheet\" href=\"PizzaLayout.css\"/>\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <script>\n");
      out.write("      $(document).ready(function() {\n");
      out.write("\t\t//hide the submit button on page load\n");
      out.write("\t\t$(\"#pickupForm\").hide();\n");
      out.write("\t\t$(\"#deliveryForm\").hide();\t\t\n");
      out.write("\t});\n");
      out.write("      function display(){\n");
      out.write("          $(\"#pickupForm\").hide();\n");
      out.write("          if($(\"#option\").val() == \"2\"){\n");
      out.write("             $(\"#deliveryForm\").hide();\n");
      out.write("             $(\"#pickupForm\").show();             \n");
      out.write("          }\n");
      out.write("          if($(\"#option\").val() == \"1\"){\n");
      out.write("              $(\"#pickupFrom\").hide();\n");
      out.write("              $(\"#deliveryForm\").show();              \n");
      out.write("          }\n");
      out.write("          if($(\"#option\").val() == \"0\"){\n");
      out.write("              $(\"#pickupForm\").hide();\n");
      out.write("              $(\"#deliveryForm\").hide();\n");
      out.write("          }\n");
      out.write("      }\n");
      out.write("  </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<nav class=\"navDisplay navbar navbar-default\">\n");
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
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                \n");
      out.write("\t\t\t\t\t\t\t<label for=\"option\" class=\"cols-sm-2 control-label\">Select Delivery or Pick up</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <select name=\"option\" id=\"option\" required onchange=\"display()\">\n");
      out.write("                                                                        <option value=\"0\"></option>\n");
      out.write("                                                                        <option value=\"1\">Delivery</option>\n");
      out.write("                                                                        <option value=\"2\">Pick Up</option>\n");
      out.write("                                                                    </select>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                <form action=\"addOrderDelivery_proc\" id=\"deliveryForm\">\n");
      out.write("                    <h1>Enter Delivery Address</h1>\n");
      out.write("                                                 \n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"fname\" class=\"cols-sm-2 control-label\">First Name</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" required name=\"firstname\" id=\"firstname\"  placeholder=\"Enter your first name\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"lname\" class=\"cols-sm-2 control-label\">Last Name</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" required name=\"lastname\" id=\"lastname\"  placeholder=\"Enter your last name\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\" class=\"cols-sm-2 control-label\">Username</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" required name=\"username\" id=\"username\"  placeholder=\"Enter a username\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"address\" class=\"cols-sm-2 control-label\">Address</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" required name=\"address\" id=\"address\"  placeholder=\"Enter your address\"/>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"house\" class=\"cols-sm-2 control-label\">House or Apartment</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" required name=\"house\" id=\"house\"  placeholder=\"Enter your house or apartment number\"/>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"postalcode\" class=\"cols-sm-2 control-label\">Postal Code</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" required name=\"postalcode\" id=\"postalcode\"  placeholder=\"Enter your province\"/>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"province\" class=\"cols-sm-2 control-label\">Province</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                    <select name=\"province\" id=\"province\" maxlength=\"50\" class=\"textfield1\" required> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option> </option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"BC\">British Columbia</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"AB\">Alberta</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"SK\">Saskatchewan</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"MB\">Manitoba</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"ON\">Ontario</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"QC\">Quebec</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"NB\">New Brunswick</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"PE\">Prince Edward Island</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"NS\">Nova Scotia</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"NL\">Newfoundland and Labrador</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"NT\">Northwest Territories</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"NU\">Nunavut</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"YT\">Yukon</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t  </select>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"phone\" class=\"cols-sm-2 control-label\">Phone number</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                 <input type=\"text\" class=\"form-control\" required name=\"phone\" id=\"phone\"  placeholder=\"Enter your phone number\"/>           \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"email\" class=\"cols-sm-2 control-label\">Email</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" required name=\"email\" id=\"email\"  placeholder=\"Enter your email\"/>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group \">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" name=\"button\" id=\"button\" value=\"Pay On Delivery\" class=\"btnDis btn btn-primary btn-block\"/>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group \">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" name=\"button\" id=\"button\" value=\"Pay Online\" class=\"btn btn-primary btnDis btn-block\"/>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("            <form>\n");
      out.write("        <h1>Your Order</h1>\n");
      out.write("        ");


            
            ArrayList<Pizza> pizzas = (ArrayList<Pizza>)session.getAttribute("pizzas");
            if(pizzas != null){
            double TotalPrice = 0.0;
            int numberOfPizzas = 1;
            
            for(Pizza pi:pizzas){
                out.println("<h3>Pizza "+numberOfPizzas+"</h3>");
                
                    out.println("<div class=\"form-group\">");
                        out.println("<label for=\"crust\" class=\"cols-sm-2 control-label\">Crust chose</label>");
                        out.println("<div class=\"cols-sm-10\">");
                            out.println("<div class=\"input-group\">");
                            out.println(pi.getCrust());
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                        out.println("<label for=\"size\" class=\"cols-sm-2 control-label\">Size chose</label>");
                        out.println("<div class=\"cols-sm-10\">");
                            out.println("<div class=\"input-group\">");
                            out.println(pi.getSize());
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                        out.println("<label for=\"toppings\" class=\"cols-sm-2 control-label\">Toppings chose</label>");
                        out.println("<div class=\"cols-sm-10\">");
                            out.println("<div class=\"input-group\">");
                            ArrayList<String> tstd = pi.gettTest();
                            out.println("<ul>");
                            for(String t:tstd){
                                if(!t.contains("0")){
                                    out.println("<li>" + t + "</li>");
                                }
                            }
                            out.println("</ul>");
                            
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                        out.println("<label for=\"price\" class=\"cols-sm-2 control-label\">Price</label>");
                        out.println("<div class=\"cols-sm-10\">");
                            out.println("<div class=\"input-group\">");
                            double price = PizzaDL.CalculatePrice(pi, pi.getTopPrice());
                            double priceRound = Math.round(price * 100.0)/100.0;
                            String priceToDisplay = Double.toString(priceRound);
                            TotalPrice += priceRound;
                            out.println("$" + priceToDisplay);
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");                   
                numberOfPizzas++;
            }
            
            out.println("<h2>Total</h2>");
            out.println("<div class=\"form-group\">");
                        out.println("<label for=\"total\" class=\"cols-sm-2 control-label\">Total Including Tax ($15%)</label>");
                        out.println("<div class=\"cols-sm-10\">");
                            out.println("<div class=\"input-group\">");
                            double TotalPriceRound = Math.round((TotalPrice*1.15)*100.0)/100.0;                            
                            out.println("$"+TotalPriceRound);
                            out.println("</div>");
                        out.println("</div>");
            out.println("</div>");
          }else{
                out.println("<h3>There is nothing in your cart. Go to Order page to add some pizzas</h3>");
          }   
        
      out.write("\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <form action=\"addOrderPickup_proc\" id=\"pickupForm\">\n");
      out.write("                    <h1>Enter Pick Up Information</h1>\n");
      out.write("                                                 \n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"fname\" class=\"cols-sm-2 control-label\">First Name</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" required name=\"firstname\" id=\"firstname\"  placeholder=\"Enter your first name\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"lname\" class=\"cols-sm-2 control-label\">Last Name</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" required name=\"lastname\" id=\"lastname\"  placeholder=\"Enter your last name\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\" class=\"cols-sm-2 control-label\">Username</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" required name=\"username\" id=\"username\"  placeholder=\"Enter a username\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"address\" class=\"cols-sm-2 control-label\">Address</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" required name=\"address\" id=\"address\"  placeholder=\"Enter your address\"/>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"house\" class=\"cols-sm-2 control-label\">House or Apartment</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" required name=\"house\" id=\"house\"  placeholder=\"Enter your house or apartment number\"/>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"postalcode\" class=\"cols-sm-2 control-label\">Postal Code</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" required name=\"postalcode\" id=\"postalcode\"  placeholder=\"Enter your province\"/>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"province\" class=\"cols-sm-2 control-label\">Province</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                    <select name=\"province\" id=\"province\" maxlength=\"50\" class=\"textfield1\" required> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option> </option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"BC\">British Columbia</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"AB\">Alberta</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"SK\">Saskatchewan</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"MB\">Manitoba</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"ON\">Ontario</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"QC\">Quebec</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"NB\">New Brunswick</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"PE\">Prince Edward Island</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"NS\">Nova Scotia</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"NL\">Newfoundland and Labrador</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"NT\">Northwest Territories</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"NU\">Nunavut</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"YT\">Yukon</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t  </select>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"phone\" class=\"cols-sm-2 control-label\">Phone number</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                 <input type=\"text\" class=\"form-control\" required name=\"phone\" id=\"phone\"  placeholder=\"Enter your phone number\"/>           \n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"email\" class=\"cols-sm-2 control-label\">Email</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" required name=\"email\" id=\"email\"  placeholder=\"Enter your email\"/>\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group \">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" name=\"button\" id=\"button\" value=\"Pay In Store\" class=\"btn btn-primary btn-block btnDis\"/>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                                <div class=\"form-group \">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" name=\"button\" id=\"button\" value=\"Pay Online\" class=\"btn btn-primary btn-block btnDis\"/>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("            </div>\n");
      out.write("        \n");
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
