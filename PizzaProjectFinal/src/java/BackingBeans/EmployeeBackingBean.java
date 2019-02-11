/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBeans;

import DLBeans.EmployeeDL;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author luiss
 */
@Named(value = "eBB")
@ViewScoped
public class EmployeeBackingBean implements Serializable{

    /**
     * Creates a new instance of EmployeeBackingBean
     */
    @EJB
    private EmployeeDL e;
    private String username;
    private String password;
    
    
    public EmployeeBackingBean() {
    }

    
    public String Login(){
        int login = e.LoginEmployee(username, password);
        if(login>0){
            
            return "EmpManager.jsp";
        }else{
            return "Elogin.xhtml";
        }
        
    }

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public EmployeeDL getE() {
        return e;
    }

    public void setE(EmployeeDL e) {
        this.e = e;
    }
}
