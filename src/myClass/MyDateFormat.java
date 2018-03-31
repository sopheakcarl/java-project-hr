/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myClass;

//import java.sql.Date;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author sopheakcarl
 */
public class MyDateFormat 
{
    SimpleDateFormat formatMyDate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    SimpleDateFormat formatSqlDate= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    SimpleDateFormat formatSqlShorDate = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat formatMyShortDate = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat formatAccessShortDate = new SimpleDateFormat("M/d/yyyy"); // not use
    
    SimpleDateFormat sqlDAte= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.0");
    SimpleDateFormat sqlDateAmPm= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
    SimpleDateFormat sqlMyDateAmPm = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
    public String getSqlDateAmPm(String sqlDate)
    {
        String result="";
        try
        {
            Date d = sqlDAte.parse(sqlDate);
            result=sqlDateAmPm.format(d);
        }
        catch(ParseException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return result;
    }
    public String getSqlDateAmPmMyDate(String sqlDate)
    {
        String result="";
        try
        {
            Date d = sqlMyDateAmPm.parse(sqlDate);
            result=sqlDateAmPm.format(d);
        }
        catch(ParseException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return result;
    }
    public String getSqlMyDateAmPm(String sqlDate)
    {
        String result="";
        try
        {
            Date d = sqlDAte.parse(sqlDate);
            result=sqlMyDateAmPm.format(d);
        }
        catch(ParseException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return result;
    }
    public String getMyDate(String sqlDate)
    {
        String result="";
        try
        {
            Date d = formatSqlDate.parse(sqlDate);
            result=formatMyDate.format(d);
        }
        catch(ParseException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return result;
    }
    public String getMyShortDate(String sqlDate)
    {
        String result="";
        try
        {
            Date d = formatSqlDate.parse(sqlDate);
            result=formatMyShortDate.format(d);
        }
        catch(ParseException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return result;
    }
    public String getSqlDate(String myDate)
    {
        String result="";
        try
        {
            Date d = formatMyDate.parse(myDate);
            result=formatSqlDate.format(d);
        }
        catch(ParseException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return result;
    }
    public String getMyShortSqlDate(String sqlDate)
    {
        String result="";
        try
        {
            Date d = formatSqlShorDate.parse(sqlDate);
            result=formatMyShortDate.format(d);
        }
        catch(ParseException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return result;
    }
    public String getMySqlShortDate(String myDate)
    {
        String result="";
        try
        {
            Date d = formatMyShortDate.parse(myDate);
            result=formatSqlShorDate.format(d);
        }
        catch(ParseException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return result;
    }
    public String getMyDateFromDate(Date date)
    {
        String result="";
        try
        {
            result = formatMyShortDate.format(date);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return result;
    }
    public Date getDateFromMyDate(String myDate)
    {
        Date d=null;
        try
        {
            d = formatMyShortDate.parse(myDate);
        }
        catch(ParseException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return d;
    }

   
    
}
