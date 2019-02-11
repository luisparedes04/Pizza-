<%-- 
    Document   : order
    Created on : 9-Dec-2018, 11:47:23 PM
    Author     : luiss
--%>

<%@page import="pojos.Crust"%>
<%@page import="DLBeans.PizzaDL"%>
<%@page import="pojos.Size"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pojos.Topping"%>
<%@page import="DLBeans.ToppingDL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Luis' Pizza - Order</title>
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
        <div class="container contDisplay">
            <div class="col-md-3">
                <%
                
                String messageD = request.getParameter("msg");
                if(messageD != null){
                out.println("<h1>" + messageD + "</h1>");
                }
            %>
            </div>
        <div class="col-md-6 displayBG">
                                    <h2>Build Your Own Pizza!</h2>
					<form action="addToCart_proc">
						
						<div class="form-group">
							<label for="crust" class="cols-sm-2 control-label">Select Crust Type</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <select name="crust" id="crust" required>
                                                                        <option></option>
                                                                        <%
                                                                            ArrayList<Crust> crusts = PizzaDL.FecthCrustTypes();

                                                                            for(Crust c:crusts){
                                                                                    out.println("<option value='"+c.getName() + "|" + c.getId() + "'>"+ c.getName()+"</option>");
                                                                            }
                                                                        %>
                                                                    </select>
								
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="size" class="cols-sm-2 control-label">Select Size</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <select name="size" id="size" required>
                                                                        <option></option>
                                                                        <%
                                                                            ArrayList<Size> sizes = PizzaDL.FecthSizes();

                                                                            for(Size s:sizes){
                                                                                    out.println("<option value='"+s.getName() + "|" + s.getSizeID() + "'>"+ s.getName()+"</option>");
                                                                            }
                                                                        %>                                                                 
                                                                    </select>									
								</div>
							</div>
						</div>
                                                
                                                <div class="form-group">
							<label for="toppings" class="cols-sm-2 control-label">Select Toppings</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                            <%
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
                                                                            %>
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="quantity" class="cols-sm-2 control-label">How many do you want?</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <select name="quantity" id="quantity" required>
                                                                        <option></option>
                                                                        <%
                                                                            

                                                                            for(int it = 1; it<= 5; it++){
                                                                                    out.println("<option value='"+ it + "'>"+ it +"</option>");
                                                                            }
                                                                        %>                                                                 
                                                                    </select>									
								</div>
							</div>
						</div>
						
						<div class="form-group ">
							<input type="submit" name="button" id="button" value="Add To Cart" class=" btnDis btn btn-primary "/>
							
						</div>
						
					</form>
            </div>
        </div>
    </body>
</html>
