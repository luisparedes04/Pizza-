/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLBeans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.ejb.Stateless;
import pojos.Console;
import pojos.Customer;
import pojos.Order;
import pojos.OrderDetails;
import pojos.Pizza;


/**
 *
 * @author luiss
 */
@Stateless
public class OrderDL {

    public OrderDL() {
    }

    public static int InsertOrder(Order o) throws ClassNotFoundException{

        String sql = "insert into orders(totalPrice, deliveryDateTime, placedDateTime, customerId, orderStatus)"+
                " values(?, ?, ?, ?, ?);";
        PreparedStatement statement;
        ResultSet rs = null;
        
        try {
            
            statement = Console.GetConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setDouble(1, o.getTotalPrice());
            statement.setString(2, o.getPlacedDateTime());           
            statement.setString(3, o.getDeliveryDateTime());
            statement.setInt(4, o.getCustomerID());
            statement.setString(5, o.getOrderStatus());

            
            int x = statement.executeUpdate();
            
            if(x>0){
                rs = statement.getGeneratedKeys();
                rs.next();
                
              return rs.getInt(1);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
                
        return 0;
    }
    public static OrderDetails FetchOrderDetails(int OrderID) throws ClassNotFoundException{
        Connection con = Console.GetConnection();
         String sql = "select c.firstName, c.lastName, o.orderId, o.totalPrice, o.deliveryDateTime, " +
                        "o.placedDateTime, o.customerid, p.pizzaId, p.price, " +
                        "(select name from sizes where sizeid = p.sizeId) as size, " +
                        "(select name from crusttypes where crustTypeId = p.crustTypeId) as crust " +
                        "from customer c " +
                        "inner join orders o " +
                        "on o.customerId = c.customerid " +
                        "inner join pizza p " +
                        "on o.orderId = p.orderId " +
                        "where o.orderId = ?;";
         
        PreparedStatement statement;
        ResultSet rs = null;
        
        ArrayList<OrderDetails> orders = new ArrayList<>();
        OrderDetails orderDetails = new OrderDetails();
        try{
            
            statement = con.prepareStatement(sql);
            statement.setInt(1, OrderID);
            rs = statement.executeQuery();
            rs.first();
            
            int first = 1;
            
            Customer c = new Customer();
            Order o = new Order();
            
            ArrayList<Pizza> pizzas = new ArrayList<>();
            
            do{
                if(first == 1){
                    
                    c.setFirstName(rs.getString(1));
                    c.setLastName(rs.getString(2));
                    int x = rs.getInt(3);
                    double y = rs.getDouble(4);
                    o.setTotalPrice(rs.getDouble(4));
                    
                    orderDetails.setCustomer(c);
                    
                }
                   Pizza p = new Pizza();
                   p.setCrust(rs.getString(11));
                   p.setSize(rs.getString(10));
                   p.setPizzaPrice(rs.getDouble(9));
                   
                   String sql2 = "select t.name from toppings t " +
                    "inner join pizza_toppings_map pm " +
                    "on t.toppingId = pm.toppingId " +
                    "inner join pizza p " +
                    "on pm.pizzaId = p.pizzaId " +
                    "where p.pizzaId = ?;";
                   
                   PreparedStatement st;
                   ResultSet res = null;
                   st = con.prepareStatement(sql2);
                   st.setInt(1, rs.getInt(8));
                   res = st.executeQuery();
                   res.first();
                   String tops = "";
                   do{
                       tops += res.getString(1) + " | ";
                   }while(res.next());
                   
                   p.setToppings(tops);
                   
                   pizzas.add(p);
                   
                first++;
            }while(rs.next());
            
            o.setPizzas(pizzas);
            
            orderDetails.setOrder(o);
            
            
            
            return orderDetails;
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return orderDetails;
    }
    public static ArrayList<Integer> FetchOrders() throws ClassNotFoundException, SQLException{
        ArrayList<Integer> orderIDs = new ArrayList<>();
        
        String sql = "select orderId from orders where orderStatus = ?;";
        PreparedStatement s;
        ResultSet rs = null;
        s = Console.GetConnection().prepareStatement(sql);
        s.setString(1, "pending");
        rs = s.executeQuery();
        rs.first();
        
        do{
            orderIDs.add(rs.getInt(1));
        }while(rs.next());
        
        return orderIDs;
    }
    public static void UpdateOrderStatus(int orderID) throws ClassNotFoundException{
        String sql = "update orders set orderStatus = 'filled' where orderId = ?; ";
        PreparedStatement statement;
        ResultSet rs = null;
        
        try {
            
            statement = Console.GetConnection().prepareStatement(sql);
            statement.setInt(1, orderID);
            
            int x = statement.executeUpdate();
            
            if(x>0){
                System.out.println("Updated");
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
                
        System.out.println("Error");
    }
}
