/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClass;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author sopheakcarl
 */
public class customer {

    /**
     * @return the customerType
     */
    public String getCustomerType() {return customerType;}
    public void setCustomerType(String customerType) {this.customerType = customerType;}
    public String getDiscount() {return discount;}
    public void setDiscount(String discount) {this.discount = discount;}
    
    private String customerType;
    private String discount;
    
    public void setCusomerType(String type,String discount)
    {
        this.customerType=type;
        this.discount=discount;
    }
    
}
