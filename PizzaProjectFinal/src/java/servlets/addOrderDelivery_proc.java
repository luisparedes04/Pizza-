/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DLBeans.CustomerDL;
import DLBeans.OrderDL;
import DLBeans.PizzaDL;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pojos.Customer;
import pojos.Order;
import pojos.Pizza;

/**
 *
 * @author luiss
 */
@WebServlet(name = "addOrderDelivery_proc", urlPatterns = {"/addOrderDelivery_proc"})
public class addOrderDelivery_proc extends HttpServlet {

    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet addOrderDelivery_proc</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addOrderDelivery_proc at " + request.getContextPath() + "</h1>");
            
            // Get All the parameters past from the form
            String firstName = request.getParameter("firstname");
            String lastName = request.getParameter("lastname");
            String username = request.getParameter("username");
            String address = request.getParameter("address");
            String h = request.getParameter("house");
            
            int house = Integer.parseInt(h);
            
            String postalcode = request.getParameter("postalcode");
            String province = request.getParameter("province");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            // End of parameters
            
            // Create a Customer Object
            Customer c = new Customer(firstName, lastName, username, address, house, postalcode, province, phone, email);
            
            // get customer by username to see if it exists already
            int cust = CustomerDL.FetchCustomerByUserName(username);
            
            // Check if the customer already exists if it does send back and ask for another username
            if(cust > 0){
                response.sendRedirect("Checkout.jsp?msgUserName=Sorry!. Username already exists, try another one");
            }
            
            // Insert the customer to the Data Base
            boolean add = CustomerDL.InsertCustomer(c);
            
            // if the customer is inserted
            if(add){
                
                HttpSession session = request.getSession();
                // Prepare Order Object
                double OrderTotal = (double)session.getAttribute("OrderTotal");
                LocalDateTime placedDate = LocalDateTime.now();
                String date = placedDate.toString();
                LocalDateTime deliveryTime = placedDate.plusMinutes(45);
                String delivery = deliveryTime.toString();
                int custID = CustomerDL.FetchCustomerByUserName(username);
                String orderStatus = "pending";
                
                // Create Order Object
                Order o = new Order(OrderTotal, date, delivery, custID, orderStatus);
                
                // Get Order ID that comes back from data base
                int orderAdd = OrderDL.InsertOrder(o);
                
                // if order was inserted
                if(orderAdd > 0){
                    // Get Array List with all the pizzas in the session
                    ArrayList<Pizza> pizzas = (ArrayList<Pizza>)session.getAttribute("pizzas");
                    int numPizzas = pizzas.size();
                    
                    System.out.println(numPizzas + "FIND THIS");
                    
                    for(Pizza pi:pizzas){
                       // Prepare Pizza object 
                       double price = PizzaDL.CalculatePrice(pi, pi.getTopPrice());
                       double priceRound = Math.round(price * 100.0)/100.0; 
                       pi.setPizzaPrice(priceRound);
                       
                       // Insert Pizza
                       int pizzaID = PizzaDL.InsertPizzas(pi, orderAdd);
                       
                       // Insert Pizza toppings
                       if(pizzaID>0){
                           ArrayList<String> toppings = pi.getToID();
                           boolean toppingsAdded = PizzaDL.InsertPizzaToppings(toppings, pizzaID);
                           if(toppingsAdded){
                               
                           }
                       }
                       
                    }
                   response.sendRedirect("Checkout.jsp?order=" + orderAdd + "");                                        
                }else{
                    // If it gets here there was an error inserting the order
                }
                
            }
            out.println("</body>");
            out.println("</html>");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addOrderDelivery_proc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addOrderDelivery_proc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
