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

/**
 *
 * @author sopheakcarl
 */
public class attendance 
{
    MyDateFormat _myDate = new MyDateFormat();
    public String getAttLastRecord()
    {
        String result="";
        try
        {
            String sql="SELECT sTime\n" +
                        "from tbl_attendance\n" +
                        "ORDER BY sTime DESC\n"+
                        "limit 1";
            Statement st= teamkhyalhr.MainForm.con.createStatement();
            ResultSet rs =st.executeQuery(sql);
            while(rs.next())
            {
                if(!rs.getString(1).equals(""))
                    result =_myDate.getSqlDateAmPmMyDate(rs.getString(1));              
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return result;
    }
    public void setAttendance(String id,String acno,String name,String sTime,String Machine,String type)
    {
        try
        {
            String sql="INSERT INTO `tbl_attendance` (`emp_id`, `Ac-No`, `Name`, `sTime`, `Machine`, `Verify_Mode`)"
                    + " VALUES ('"+id+"', '"+acno+"', '"+name+"', '"+sTime+"', '"+Machine+"', '"+type+"')";
            Statement st =teamkhyalhr.MainForm.con.createStatement();
            st.executeUpdate(sql);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
