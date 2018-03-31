/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Heng Carl
 */
public class connectionAccessDB {
    private Connection connectionAccess;

    /**
     * @return the connection
     */
    public Connection getConnection() {return connectionAccess;}
    public void setConnection(Connection connection) {this.connectionAccess = connection;}
    
    public void connetionDB()
    {
        try
        {
            //setConnection(DriverManager.getConnection("jdbc:ucanaccess://C:/Program Files (x86)/ZKTeco/att2000.mdb"));
            setConnection(DriverManager.getConnection("jdbc:ucanaccess://C:/Users/sopheakcarl/Desktop/att2000.mdb"));
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    
}
