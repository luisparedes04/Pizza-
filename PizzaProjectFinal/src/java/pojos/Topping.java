/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author luiss
 */
public class Topping {
    private String toppingID;
    private String toppingName;
    private String toppingPrice;

    public Topping(String toppingID, String toppingName, String toppingPrice) {
        this.toppingID = toppingID;
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }

    public String getToppingID() {
        return toppingID;
    }

    public void setToppingID(String toppingID) {
        this.toppingID = toppingID;
    }

    public String getToppingName() {
        return toppingName;
    }

    @Override
    public String toString() {
        return  toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public String getToppingPrice() {
        return toppingPrice;
    }

    public void setToppingPrice(String toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    public Topping() {
    }

    
    
}
