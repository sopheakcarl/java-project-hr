/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClass;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import teamkhyalhr.MainForm;

/**
 *
 * @author sopheakcarl
 */
public class login 
{

    /**
     * @return the name
     */
    
    private String username;
    private String password;
    private String name;
    private String position;

    /**
     * @return the username
     */
    public String getUsername() {return username;}
    /**
     * @param username the username to set
     */
    public void setUsername(String username) {this.username = username;}
    /**
     * @return the password
     */
    public String getPassword() {return password;}
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {this.password = password;}
    
    public String getName() {return name;}

    /**
     * @param name the name to set
     */
    public void setName(String name) {this.name = name;}

    /**
     * @return the position
     */
    public String getPosition() {return position;}

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }
    
    
    public String checkUser(String username,String password)
    {
        String message="";
        try
        {
            String sql="SELECT u.username,u.`password`,e.first_name,e.last_name,p.position_name\n" +
                        "FROM tbl_user u\n" +
                        "LEFT OUTER JOIN tbl_employees e\n" +
                        "ON u.empid=e.emp_id\n" +
                        "LEFT OUTER JOIN tbl_position p\n" +
                        "ON p.position_id=e.position_id\n" +"";
            Statement st = MainForm.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                if(username.equals(rs.getString(1)))
                {
                    if(password.equals(rs.getString(2)))
                    {
                        this.name=rs.getString(3)+" "+rs.getString(4);
                        this.position=rs.getString(5);
                        message="";
                        break;
                    }
                    else
                    {
                        message="Password Incorrect";
                        break;
                    }
                }
                message="Username Incorrect";
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return message;
    }
    
    
    
    
    
}
