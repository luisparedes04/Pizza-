<%-- 
    Document   : Cart
    Created on : 9-Dec-2018, 11:50:31 PM
    Author     : luiss
--%>

<%@page import="DLBeans.PizzaDL"%>
<%@page import="java.io.IOException"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pojos.Pizza"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Luis' Pizza - Cart</title>
  <meta charset="utf-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1"/>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
  <link rel="stylesheet" href="PizzaLayout.css"/>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
      $(document).ready(function() {
		//hide the submit button on page load
                
		$("#pickupForm").hide();
		$("#deliveryForm").hide();		
	});
      function display(){
          $("#pickupForm").hide();
          if($("#option").val() == "2"){
             $("#deliveryForm").hide();
             $("#pickupForm").show();             
          }
          if($("#option").val() == "1"){
              $("#pickupFrom").hide();
              $("#deliveryForm").show();              
          }
          if($("#option").val() == "0"){
              $("#pickupForm").hide();
              $("#deliveryForm").hide();
          }
      }
      
  </script>
</head>

<nav class="navDisplay navbar navbar-default">
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
            <div class="col-md-4 displayBG">
                                                    
                <form action="addOrderDelivery_proc" id="deliveryForm">
                    <h1>Enter Delivery Address</h1>
                                                 
                                                <div class="form-group">
							<label for="fname" class="cols-sm-2 control-label">First Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <input type="text" class="form-control" required name="firstname" id="firstname"  placeholder="Enter your first name"/>
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="lname" class="cols-sm-2 control-label">Last Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <input type="text" class="form-control" required name="lastname" id="lastname"  placeholder="Enter your last name"/>
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="username" class="cols-sm-2 control-label">Username</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <input type="text" class="form-control" required name="username" id="username"  placeholder="Enter a username"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="address" class="cols-sm-2 control-label">Address</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <input type="text" class="form-control" required name="address" id="address"  placeholder="Enter your address"/>									
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="house" class="cols-sm-2 control-label">House or Apartment</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <input type="text" class="form-control" required name="house" id="house"  placeholder="Enter your house or apartment number"/>									
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="postalcode" class="cols-sm-2 control-label">Postal Code</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <input type="text" class="form-control" required name="postalcode" id="postalcode"  placeholder="Enter your province"/>									
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="province" class="cols-sm-2 control-label">Province</label>
							<div class="cols-sm-10">
								<div class="input-group">
									
                                                                    <select name="province" id="province" maxlength="50" class="textfield1" required> 
										<option> </option>
										<option value="BC">British Columbia</option>
										<option value="AB">Alberta</option>
										<option value="SK">Saskatchewan</option>
										<option value="MB">Manitoba</option>
										<option value="ON">Ontario</option>
										<option value="QC">Quebec</option>
										<option value="NB">New Brunswick</option>
										<option value="PE">Prince Edward Island</option>
										<option value="NS">Nova Scotia</option>
										<option value="NL">Newfoundland and Labrador</option>
										<option value="NT">Northwest Territories</option>
										<option value="NU">Nunavut</option>
										<option value="YT">Yukon</option>
									  </select>
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="phone" class="cols-sm-2 control-label">Phone number</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                 <input type="text" class="form-control" required name="phone" id="phone"  placeholder="Enter your phone number"/>           
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Email</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <input type="text" class="form-control" required name="email" id="email"  placeholder="Enter your email"/>									
								</div>
							</div>
						</div>
						
						<div class="form-group ">
							<input type="submit" name="button" id="button" value="Pay On Delivery" class="btnDis btn btn-primary btn-block"/>
							
						</div>
                                                <div class="form-group ">
							<input type="submit" name="button" id="button" value="Pay Online" class="btn btn-primary btnDis btn-block"/>
							
						</div>
						
					</form>
            </div>
        <div class="col-md-4 displayBG">
            <form>
        <h1>Your Order</h1>
        <%

            
            ArrayList<Pizza> pizzas = (ArrayList<Pizza>)session.getAttribute("pizzas");
            if(pizzas != null){
              
            double TotalPrice = 0.0;
            int numberOfPizzas = 1; %>
                                                    <div id="options">
							<label for="option" class="cols-sm-2 control-label">Select Delivery or Pick up</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <select name="option" id="option" required onchange="display()">
                                                                        <option value="0"></option>
                                                                        <option value="1">Delivery</option>
                                                                        <option value="2">Pick Up</option>
                                                                    </select>									
								</div>
							</div>
                                                    </div>
        <%                                            
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
                            pi.setPizzaPrice(priceRound);
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
                            session.setAttribute("OrderTotal", TotalPriceRound);
                            out.println("$"+TotalPriceRound);
                            out.println("</div>");
                        out.println("</div>");
            out.println("</div>");
          }else{
                out.println("<h3>There is nothing in your cart. Go to Order page to add some pizzas</h3>");
          }   
        %>
        </form>
        </div>
            <div class="col-md-4 displayBG">
                <form action="addOrderDelivery_proc" id="pickupForm">
                    <h1>Enter Pick Up Information</h1>
                                                 
                                                <div class="form-group">
							<label for="fname" class="cols-sm-2 control-label">First Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <input type="text" class="form-control" required name="firstname" id="firstname"  placeholder="Enter your first name"/>
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="lname" class="cols-sm-2 control-label">Last Name</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <input type="text" class="form-control" required name="lastname" id="lastname"  placeholder="Enter your last name"/>
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="username" class="cols-sm-2 control-label">Username</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <input type="text" class="form-control" required name="username" id="username"  placeholder="Enter a username"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label for="address" class="cols-sm-2 control-label">Address</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <input type="text" class="form-control" required name="address" id="address"  placeholder="Enter your address"/>									
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="house" class="cols-sm-2 control-label">House or Apartment</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <input type="text" class="form-control" required name="house" id="house"  placeholder="Enter your house or apartment number"/>									
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="postalcode" class="cols-sm-2 control-label">Postal Code</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <input type="text" class="form-control" required name="postalcode" id="postalcode"  placeholder="Enter your province"/>									
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="province" class="cols-sm-2 control-label">Province</label>
							<div class="cols-sm-10">
								<div class="input-group">
									
                                                                    <select name="province" id="province" maxlength="50" class="textfield1" required> 
										<option> </option>
										<option value="BC">British Columbia</option>
										<option value="AB">Alberta</option>
										<option value="SK">Saskatchewan</option>
										<option value="MB">Manitoba</option>
										<option value="ON">Ontario</option>
										<option value="QC">Quebec</option>
										<option value="NB">New Brunswick</option>
										<option value="PE">Prince Edward Island</option>
										<option value="NS">Nova Scotia</option>
										<option value="NL">Newfoundland and Labrador</option>
										<option value="NT">Northwest Territories</option>
										<option value="NU">Nunavut</option>
										<option value="YT">Yukon</option>
									  </select>
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="phone" class="cols-sm-2 control-label">Phone number</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                 <input type="text" class="form-control" required name="phone" id="phone"  placeholder="Enter your phone number"/>           
								</div>
							</div>
						</div>
                                                <div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Email</label>
							<div class="cols-sm-10">
								<div class="input-group">
                                                                    <input type="text" class="form-control" required name="email" id="email"  placeholder="Enter your email"/>									
								</div>
							</div>
						</div>
						
						<div class="form-group ">
							<input type="submit" name="button" id="button" value="Pay In Store" class="btn btn-primary btn-block btnDis"/>
							
						</div>
                                                <div class="form-group ">
							<input type="submit" name="button" id="button" value="Pay Online" class="btn btn-primary btn-block btnDis"/>
							
						</div>
						
					</form>
            </div>
        
        </div>
    </body>
</html>
