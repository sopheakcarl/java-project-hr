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
import sun.net.www.content.image.jpeg;

/**
 *
 * @author sopheakcarl
 */

public class employees {

    MyDateFormat _myDateFormat = new MyDateFormat();

    public String getDateSql() {return dateSql;}
    public void setDateSql(String dateSql) {this.dateSql = dateSql;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}
    public String getMail() {return mail;}
    public void setMail(String mail) {this.mail = mail;}
    public String getPosition() {return position;}
    public void setPosition(String position) {this.position = position;}
    public String getSalary() {return salary;}
    public void setSalary(String salary) {this.salary = salary;}
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getDob() { return dob;}
    public void setDob(String dob) {this.dob = dob; }
    
    private String name;
    private String address;
    private String phone;
    private String mail;
    private String position;
    private String salary;
    private String username;
    private String password;
    private String dob;
    private String dateSql;
    
    public void setStaff(String name,String add,String phone,String mail,String position,String salary,String username,String pass,String dob)
    {
        this.name=name;
        this.address=add;
        this.phone=phone;
        this.mail=mail;
        this.position=position;
        this.salary=salary;
        this.username=username;
        this.password=pass;
        this.dob=dob;
        
    }
    public void downloadEmployees(String id,String firstName,String lastName,String gender,String Add,String phone,String dob,String hiredate,String privilige)
    {
        try
        {
            if(dob.equals("null"))
                dob="null";
            else
                dob=_myDateFormat.getMySqlShortDate(dob);
            if(hiredate.equals("null"))
                hiredate="null";
            else
                hiredate=_myDateFormat.getMySqlShortDate(hiredate);
                        
            String sql="INSERT INTO `tbl_employees` (`emp_id`, `first_name`, `last_name`, `gender`, `address`, `contact`, `dob`, `hire_date`, `privilige`) "
                    + "VALUES ('"+id+"','"+firstName+"','"+lastName+"', '"+gender+"', '"+Add+"', '"+phone+"', '"+dob+"', '"+hiredate+"', '"+getPriviligeId(privilige)+"')";
                    //+ "VALUES ('id','firstName','lastname', "+gender+"', '"+Add+"', '"+phone+"', '"+dob+"', '"+hiredate+"', '"+getPriviligeId(privilige)+"')";
            Statement st = teamkhyalhr.MainForm.con.createStatement();
            st.executeUpdate(sql);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public void uploadEmployees(String id,String name,String gender,String add,String phone,String dob,String hiredate,String privilige)
    {
        try
        {
            //INSERT INTO USERINFO(Badgenumber,Name,Gender,PAGER,BIRTHDAY,HIREDDAY,street,privilege)VALUES('16','Name','M','0968590557','3/15/1995','3/15/2018','btb','2');
            dob = _myDateFormat.getMySqlShortDate(dob);
            hiredate=_myDateFormat.getMySqlShortDate(hiredate);
            String sql="INSERT INTO USERINFO(Badgenumber,Name,Gender,PAGER,BIRTHDAY,HIREDDAY,street,privilege)\n" +
                        "VALUES('"+id+"','"+name+"','"+gender+"','"+phone+"','"+dob+" 00:00:00','"+hiredate+" 00:00:00','"+add+"','"+privilige+"');";
           
            Statement st =teamkhyalhr.MainForm.fpConnection.createStatement();
            st.executeUpdate(sql); 
            JOptionPane.showMessageDialog(null, "Employees Upload Successful");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public String getPriviligeId(String name)
    {
        String result="";
        try
        {
            String sql="SELECT id\n" +
                        "FROM tbl_privilige\n" +
                        "WHERE `name`='"+name+"'";
            Statement st = teamkhyalhr.MainForm.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                result=rs.getString(1);
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return result;
    }
    public void addEmpToDb(String id,String firstname,String lastname,String gender,String address,String phone,String dob,String hiredate,String privilige)
    {
        try
        {
            dob=_myDateFormat.getMySqlShortDate(dob);
            hiredate=_myDateFormat.getMySqlShortDate(hiredate);
            if(gender.equals("Male")) gender="M";
            else gender="F";
            String sql="INSERT INTO `tbl_employees` (`emp_id`, `first_name`, `last_name`, `gender`, `address`, `contact`, `dob`, `hire_date`, `privilige`) "
                    + "VALUES ('"+id+"', '"+firstname+"', '"+lastname+"', '"+gender+"', '"+address+"', '"+phone+"', '"+dob+"', '"+hiredate+"', '"+privilige+"')";
            Statement st = teamkhyalhr.MainForm.con.createStatement();
            st.executeUpdate(sql);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public void updateEmpToDb(String id ,String firstname,String lastname,String gender,String address,String phone,String dob,String hiredate,String privilige)
    {
        try
        {
            dob=_myDateFormat.getMySqlShortDate(dob);
            hiredate=_myDateFormat.getMySqlShortDate(hiredate);
            if(gender.equals("Male")) gender="M";
            else gender="F";
            String sql="UPDATE `tbl_employees` SET `first_name`='"+firstname+"', `last_name`='"+lastname+"', `gender`='"+gender+"', `address`='"+address+"', `contact`='"+phone+"', `dob`='"+dob+"', `hire_date`='"+hiredate+"', `privilige`='"+privilige+"' "
                    + "WHERE (`emp_id`='"+id+"')";
            Statement st =teamkhyalhr.MainForm.con.createStatement();
            st.executeUpdate(sql);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    public void updateEmpToFpDb(String id ,String firstname,String lastname,String gender,String address,String phone,String dob,String hiredate,String privilige)
    {
        try
        {
            dob=_myDateFormat.getMySqlShortDate(dob);
            hiredate=_myDateFormat.getMySqlShortDate(hiredate);
            if(gender.equals("Male")) gender="M";
            else gender="F";
            String sql="UPDATE USERINFO SET USERINFO.Name = '"+firstname +" "+lastname+"', USERINFO.Gender = '"+gender+"', USERINFO.PAGER = '"+phone+"', USERINFO.BIRTHDAY = '"+dob+" 00:00:00', USERINFO.HIREDDAY = '"+hiredate+" 00:00:00', USERINFO.street = '"+address+"', USERINFO.privilege = '"+privilige+"'\n" +
                        "WHERE (((USERINFO.Badgenumber)='"+id+"'));";
            Statement st =teamkhyalhr.MainForm.fpConnection.createStatement();
            st.executeUpdate(sql);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
}
