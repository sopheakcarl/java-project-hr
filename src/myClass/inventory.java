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
public class inventory
{

    /**
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * @return the proPriceIn
     */
    public String getProPriceIn() {
        return proPriceIn;
    }

    /**
     * @param proPriceIn the proPriceIn to set
     */
    public void setProPriceIn(String proPriceIn) {
        this.proPriceIn = proPriceIn;
    }
    private String proCode;
    private String proName;
    private String proPrice;
    private String proPriceIn;
    private String cateName;
    private String brandName;
    private String qty;
    private String imgPath;
    private String cateId;
    private String brandId;
    private String fullPath;
    
    
    

    public String getProCode() {return proCode;}
    public void setProCode(String proCode) {this.proCode = proCode;}
    public String getProName() {return proName;}
    public void setProName(String proName) {this.proName = proName;}
    public String getProPrice() {return proPrice;}
    public void setProPrice(String proPrice) {this.proPrice = proPrice;}
    public String getCateName() {return cateName;}
    public void setCateName(String cateName) {this.cateName = cateName;}
    public String getBrandName() {return brandName;}
    public void setBrandName(String brandName) {this.brandName = brandName;}
    public String getImgPath(){return imgPath;}
    public void setImgPath(String imgPath){this.imgPath=imgPath;}
    public void setCateId(String cateName){this.cateId=cateName;}
    public void setBrandId(String brandName){this.brandId=brandName;}
    public String getFullPath(){return fullPath;}
    public void setFullPath(String path){this.fullPath=path;}
    
    public void setUpProduct(String code,String name,String price,String cateName,String brandName,String imgPath)
    {
        this.proCode=code;
        this.proName =name;
        this.proPrice=price;
        this.cateName=cateName;
        this.brandName=brandName;
        this.imgPath=imgPath;
    }
    
    public void setImportPro(String proid,String proname,String qty,String price)
    {
        this.proCode=proid;
        this.proName=proname;
        this.qty=qty;
        this.proPriceIn=price;
    }
    public float getAmount()
    { 
        return Float.valueOf(getQty())*Float.valueOf(getProPriceIn());
    }
    
        
    public int getBrandId()
    {
        int result=0;
        try
        {
            String sql="SELECT `brand_id` FROM `tbl_brand` WHERE `brand_name`='"+this.brandId+"' ";
            Statement st = teamkhyalhr.MainForm.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
                result=Integer.valueOf(rs.getString(1)) ;        
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return result;
    }
    public int getCateId()
    {
        int result=0;
        try
        {
            String sql="SELECT `cate_id` FROM `tbl_category` WHERE `cate_name`='"+this.cateId+"' ";
            Statement st = teamkhyalhr.MainForm.con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
                result=Integer.valueOf(rs.getString(1)); 
        }
        catch(NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return result;
    }
    public String getImgPathById(String id)
    {
        String result="";
        try
        {
            String sql="SELECT pro_img\n" +
                        "from tbl_inventory\n" +
                        "where pro_id='"+id+"'";
            Statement st =teamkhyalhr.MainForm.con.createStatement();
            ResultSet rs =st.executeQuery(sql);
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
    public String getSupId(String name)
    {
        String result="";
        try
        {
            String sql="select sup_id\n" +
                        "from tbl_supplier\n" +
                        "where sup_name='"+name+"'";
            Statement st =teamkhyalhr.MainForm.con.createStatement();
            ResultSet rs =st.executeQuery(sql);
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
     public String getStaffId(String name)
    {
        String result="";
        try
        {
            String sql="select staff_id\n" +
                        "from tbl_staff\n" +
                        "where staff_name='"+name+"'";
            Statement st =teamkhyalhr.MainForm.con.createStatement();
            ResultSet rs =st.executeQuery(sql);
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
    public void imp_product(String date,String inv,String total,String ap,String sup_id,String staff_id)
    {
        try
        {
            String sql="INSERT INTO `tbl_import` (`imp_date`, `imp_invoice`, `total`, `acc_pay`, `sup_id`, `staff_id`) "
                    + "VALUES ('"+date+"', '"+inv+"', '"+total+"', '"+ap+"', '"+sup_id+"', '"+staff_id+"')";
            Statement st =teamkhyalhr.MainForm.con.createStatement();
            st.executeUpdate(sql);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public String getLastInv()
    {
        String result="";
        try
        {
            String sql="select imp_id\n" +
                    "from tbl_import\n" +
                    "ORDER BY imp_id\n" +
                    "desc\n" +
                    "limit 1";
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
    public void imp_detail(String pro_id,String price,String qty,String subtotal)
    {
        try
        {
            String sql="INSERT INTO `tbl_import_detail` (`pro_id`, `imp_id`, `imp_priceIn`, `qty`, `subtotal`) "
                    + "VALUES ('"+pro_id+"', '"+getLastInv()+"', '"+price+"', '"+qty+"', '"+subtotal+"')";
            Statement st =teamkhyalhr.MainForm.con.createStatement();
            st.executeUpdate(sql);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public void updateStock(String pro_id,String qty,String price)
    {
        try
        {
            String sql="UPDATE `tbl_inventory` SET `stock`=`stock`+'"+qty+"', `price_in`='"+price+"' "
                    + "WHERE (`pro_id`='"+pro_id+"')";
            Statement st =teamkhyalhr.MainForm.con.createStatement();
            st.executeUpdate(sql);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
}
