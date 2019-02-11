<%-- 
    Document   : Checkout
    Created on : 9-Dec-2018, 10:01:29 PM
    Author     : luiss
--%>

<%@page import="pojos.Customer"%>
<%@page import="pojos.Pizza"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pojos.OrderDetails"%>
<%@page import="DLBeans.OrderDL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Luis' Pizza - Checkout</title>
  <meta charset="utf-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1"/>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
  <link rel="stylesheet" href="PizzaLayout.css"/>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<nav class="navbar navbar-default navDisplay">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="order.jsp">Luis' Pizzas</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="order.jsp">Order</a></li>
      <li><a href="Elogin.xhtml">Employee</a></li>
      <li><a href="Cart.jsp">Cart</a></li>
    </ul>
  </div>
</nav>
    <body>
        <div class="container">
            <div class="col-md-3"></div>
            <div class="col-md-6 displayBG">
        
        <form>
        <%
            
            int orderid = Integer.parseInt(request.getParameter("order"));
            
            OrderDetails od = OrderDL.FetchOrderDetails(orderid);
                
                out.println("<h1>Thanks for choosing us! " + od.getCustomer().getFirstName() + "</h1>");
                
                    out.println("<div class=\"form-group\">");
                        out.println("<label for=\"order\" class=\"cols-sm-2 control-label\">Order Total</label>");
                        out.println("<div class=\"cols-sm-10\">");
                            out.println("<div class=\"input-group\">");
                            out.println("$"+od.getOrder().getTotalPrice());
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                        out.println("<label for=\"timeDelivey\" class=\"cols-sm-2 control-label\">Your order is going to be ready in</label>");
                        out.println("<div class=\"cols-sm-10\">");
                            out.println("<div class=\"input-group\">");
                            out.println("45 minutes");
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");
                    out.println("<div class=\"form-group\">");
                        out.println("<label for=\"details\" class=\"cols-sm-2 control-label\">Order Details</label>");
                        out.println("<div class=\"cols-sm-10\">");
                            out.println("<div class=\"input-group\">");
                            ArrayList<Pizza> pizzas = od.getOrder().getPizzas();
                            int numpi = pizzas.size();
                            int piz = 1; 
                            
                            out.println("<ul>");
                            for(Pizza p:pizzas){
                                    out.println("<li>Pizza " + piz + "</li>");
                                    out.println("<li> Size: " + p.getSize() + "</li>");
                                    out.println("<li> Crust:" + p.getCrust() + "</li>");
                                    out.println("<li> Toppings: " + p.getToppings() + "</li>");
                                    out.println("<li> Price: $" + p.getPizzaPrice() + "</li>");
                                    piz++;
                            }
                            out.println("</ul>");
                            out.println("</div>");
                        out.println("</div>");
                    out.println("</div>");                   
                
        %>
        </form>
            </div>
        </div>
    </body>
</html>
