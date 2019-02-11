/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DLBeans;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.ejb.Stateless;
import pojos.Console;

/**
 *
 * @author luiss
 */
@Stateless
public class EmployeeDL {

    public int LoginEmployee(String username, String password){
        try {
            
            String sql = "select employeeid, username, password from employee where username = '" + username + "' and password = '" + password +"';" ;
            Statement s = Console.GetConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = s.executeQuery(sql);

            rs.first();
            
            int EmpId = rs.getInt(1);
            String UserBack = rs.getString(2);
            String passwordBack = rs.getString(3);
            if(UserBack.contains(username) && passwordBack.contains(password)){
                
                return EmpId;
            }else{
                return 0;
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return 0;
    }
}
