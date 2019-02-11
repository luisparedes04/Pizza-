/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLBeans;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ejb.Stateless;
import pojos.Console;
import pojos.Customer;

/**
 *
 * @author luiss
 */
@Stateless
public class CustomerDL {

    public CustomerDL() {
    }
    
    public static boolean InsertCustomer(Customer c) throws ClassNotFoundException{

        String sql = "insert into customer(firstName, lastName, memberName, phoneNumber, email, houseNumber, street, province, postalCode)"+
                " values(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement statement;
        ResultSet rs = null;
        
        try {
            
            statement = Console.GetConnection().prepareStatement(sql);
            statement.setString(1, c.getFirstName());
            statement.setString(2, c.getLastName());           
            statement.setString(3, c.getUsername());
            statement.setString(4, c.getPhoneNumber());
            statement.setString(5, c.getEmail());
            statement.setInt(6, c.getHouse());
            statement.setString(7, c.getAddress());
            statement.setString(8, c.getProvince());
            statement.setString(9, c.getPostalCode());
            
            int x = statement.executeUpdate();
            
            if(x>0){
              return true;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
                
        return false;
    }
    public static int FetchCustomerByUserName(String username){
        String sql = "select customerid from customer where memberName = ?;";
        PreparedStatement statement;
        ResultSet rs = null;
        int CustomerId = 0;
        try{
            
            statement = Console.GetConnection().prepareStatement(sql);
            statement.setString(1, username);
            rs = statement.executeQuery();
            
            rs.first();
            
            CustomerId = rs.getInt(1);
            
        }catch(Exception es){
            System.out.println(es.getMessage());
        }
        return CustomerId;
    }
}
