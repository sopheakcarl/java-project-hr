/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamkhyalhr;

import java.awt.Color;
import java.sql.Connection;
import myClass.connectionAccessDB;
import mySubForm.frm_attendance;
import mySubForm.frm_customer;
import mySubForm.frm_dashboard;
import mySubForm.frm_inventory;

import mySubForm.frm_setting;
import mySubForm.frm_sale;
import mySubForm.frm_employees;
import mySubForm.frm_supplier;

/**
 *
 * @author sopheakcarl
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public static  Connection con ;
    public static Connection fpConnection;
    
    connectionAccessDB connection = new connectionAccessDB();
    
    
    frm_dashboard f_dashboard;
    frm_sale f_sale;
    frm_inventory f_inventory;
    frm_setting f_setting;
    frm_supplier f_supplier;
    frm_employees f_staff;
    frm_customer f_customer;
    frm_attendance f_attendance;
    
    public MainForm() {
        initComponents();
        
        f_dashboard=new frm_dashboard();
        f_sale=  new frm_sale();
        f_inventory = new frm_inventory();
        f_setting = new frm_setting();
        f_supplier = new frm_supplier();
        f_staff = new frm_employees();
        f_customer = new frm_customer();
        f_attendance=new frm_attendance();
        
        panel_subform.add(f_dashboard);
        panel_subform.add(f_sale);
        panel_subform.add(f_inventory);
        panel_subform.add(f_setting);
        panel_subform.add(f_supplier);
        panel_subform.add(f_staff);
        panel_subform.add(f_customer);
        panel_subform.add(f_attendance);
        
        f_dashboard.setVisible(true);
        f_sale.setVisible(false);
        f_inventory.setVisible(false);
        f_setting.setVisible(false);
        f_supplier.setVisible(false);
        f_staff.setVisible(false);
        f_customer.setVisible(false);
        f_attendance.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_navbar = new javax.swing.JPanel();
        btn_dashboard = new javax.swing.JLabel();
        btn_sale = new javax.swing.JLabel();
        btn_inventory = new javax.swing.JLabel();
        btn_supplier = new javax.swing.JLabel();
        btn_customer = new javax.swing.JLabel();
        btn_staff = new javax.swing.JLabel();
        btn_report = new javax.swing.JLabel();
        btn_setting = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();
        btnAttencance = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_user_log = new javax.swing.JLabel();
        lb_position_log = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panel_subform = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel_navbar.setBackground(new java.awt.Color(0, 153, 153));

        btn_dashboard.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        btn_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon_dashboard_32.png"))); // NOI18N
        btn_dashboard.setText("Dashboard |");
        btn_dashboard.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_dashboard.setAlignmentY(0.0F);
        btn_dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseExited(evt);
            }
        });

        btn_sale.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_sale.setForeground(new java.awt.Color(255, 255, 255));
        btn_sale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon_sale_32.png"))); // NOI18N
        btn_sale.setText("Sale |");
        btn_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_saleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_saleMouseExited(evt);
            }
        });

        btn_inventory.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_inventory.setForeground(new java.awt.Color(255, 255, 255));
        btn_inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon_inventory_32.png"))); // NOI18N
        btn_inventory.setText("Inventory |");
        btn_inventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inventoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inventoryMouseExited(evt);
            }
        });

        btn_supplier.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_supplier.setForeground(new java.awt.Color(255, 255, 255));
        btn_supplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon_supplier_32.png"))); // NOI18N
        btn_supplier.setText("Supplier |");
        btn_supplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_supplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_supplierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_supplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_supplierMouseExited(evt);
            }
        });

        btn_customer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_customer.setForeground(new java.awt.Color(255, 255, 255));
        btn_customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon_customer_32.png"))); // NOI18N
        btn_customer.setText("Customer |");
        btn_customer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_customerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_customerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_customerMouseExited(evt);
            }
        });

        btn_staff.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_staff.setForeground(new java.awt.Color(255, 255, 255));
        btn_staff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon_staff_32.png"))); // NOI18N
        btn_staff.setText("Employees |");
        btn_staff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_staffMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_staffMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_staffMouseExited(evt);
            }
        });

        btn_report.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_report.setForeground(new java.awt.Color(255, 255, 255));
        btn_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon_report_32.png"))); // NOI18N
        btn_report.setText("Report |");
        btn_report.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reportMouseExited(evt);
            }
        });

        btn_setting.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_setting.setForeground(new java.awt.Color(255, 255, 255));
        btn_setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon_setting_32.png"))); // NOI18N
        btn_setting.setText("Setting");
        btn_setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_settingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_settingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_settingMouseExited(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icons8_Exit_32px_1.png"))); // NOI18N
        btnLogout.setText("LogOut");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });

        btnAttencance.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAttencance.setForeground(new java.awt.Color(255, 255, 255));
        btnAttencance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/icon_setting_32.png"))); // NOI18N
        btnAttencance.setText("Attendance |");
        btnAttencance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAttencance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAttencanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAttencanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAttencanceMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_navbarLayout = new javax.swing.GroupLayout(panel_navbar);
        panel_navbar.setLayout(panel_navbarLayout);
        panel_navbarLayout.setHorizontalGroup(
            panel_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_navbarLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btn_dashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_inventory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_supplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_customer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_staff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAttencance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_report)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_setting)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(36, 36, 36))
        );
        panel_navbarLayout.setVerticalGroup(
            panel_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_navbarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(panel_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dashboard)
                    .addComponent(btn_sale)
                    .addComponent(btn_inventory)
                    .addComponent(btn_supplier)
                    .addComponent(btn_customer)
                    .addComponent(btn_staff)
                    .addComponent(btn_report)
                    .addComponent(btn_setting)
                    .addComponent(btnLogout)
                    .addComponent(btnAttencance))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("User      :");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Position :");

        lb_user_log.setBackground(new java.awt.Color(51, 51, 51));
        lb_user_log.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lb_user_log.setForeground(new java.awt.Color(0, 153, 153));
        lb_user_log.setText("Developer");

        lb_position_log.setBackground(new java.awt.Color(51, 51, 51));
        lb_position_log.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lb_position_log.setForeground(new java.awt.Color(0, 153, 153));
        lb_position_log.setText("Admin");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Facebook : sopheakcarl | Phone : 0968590557");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Developed by : Nhor sopheak | SN8");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/utility/logo30.png"))); // NOI18N
        jLabel5.setText("TEAM-KHYAL-HR");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        panel_subform.setBackground(new java.awt.Color(204, 204, 204));
        panel_subform.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_user_log, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_position_log, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_subform, javax.swing.GroupLayout.PREFERRED_SIZE, 1253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lb_user_log)
                            .addGap(25, 25, 25))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(lb_position_log)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_subform, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAttencanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttencanceMouseExited
        // TODO add your handling code here:
        btnAttencance.setForeground(Color.white);
    }//GEN-LAST:event_btnAttencanceMouseExited

    private void btnAttencanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttencanceMouseEntered
        // TODO add your handling code here:
        btnAttencance.setForeground(Color.black);
    }//GEN-LAST:event_btnAttencanceMouseEntered

    private void btnAttencanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttencanceMouseClicked
        f_dashboard.setVisible(false);
        f_sale.setVisible(false);
        f_inventory.setVisible(false);
        f_setting.setVisible(false);
        f_supplier.setVisible(false);
        f_staff.setVisible(false);
        f_customer.setVisible(false);
        f_attendance.setVisible(true);
    }//GEN-LAST:event_btnAttencanceMouseClicked

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        // TODO add your handling code here:
        btnLogout.setForeground(Color.white);
    }//GEN-LAST:event_btnLogoutMouseExited

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        // TODO add your handling code here:
        btnLogout.setForeground(Color.black);
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        new frm_login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btn_settingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_settingMouseExited
        btn_setting.setForeground(Color.white);
    }//GEN-LAST:event_btn_settingMouseExited

    private void btn_settingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_settingMouseEntered
        btn_setting.setForeground(Color.black);
    }//GEN-LAST:event_btn_settingMouseEntered

    private void btn_settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_settingMouseClicked
        f_dashboard.setVisible(false);
        f_sale.setVisible(false);
        f_inventory.setVisible(false);
        f_setting.setVisible(true);
        f_supplier.setVisible(false);
        f_staff.setVisible(false);
        f_attendance.setVisible(false);
    }//GEN-LAST:event_btn_settingMouseClicked

    private void btn_reportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportMouseExited
        btn_report.setForeground(Color.white);
    }//GEN-LAST:event_btn_reportMouseExited

    private void btn_reportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportMouseEntered
        btn_report.setForeground(Color.black);
    }//GEN-LAST:event_btn_reportMouseEntered

    private void btn_staffMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_staffMouseExited
        btn_staff.setForeground(Color.white);
    }//GEN-LAST:event_btn_staffMouseExited

    private void btn_staffMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_staffMouseEntered
        btn_staff.setForeground(Color.black);
    }//GEN-LAST:event_btn_staffMouseEntered

    private void btn_staffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_staffMouseClicked

        f_dashboard.setVisible(false);
        f_sale.setVisible(false);
        f_inventory.setVisible(false);
        f_setting.setVisible(false);
        f_supplier.setVisible(false);
        f_staff.setVisible(true);
        f_customer.setVisible(false);
        f_attendance.setVisible(false);
    }//GEN-LAST:event_btn_staffMouseClicked

    private void btn_customerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customerMouseExited
        btn_customer.setForeground(Color.white);
    }//GEN-LAST:event_btn_customerMouseExited

    private void btn_customerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customerMouseEntered
        btn_customer.setForeground(Color.black);
    }//GEN-LAST:event_btn_customerMouseEntered

    private void btn_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_customerMouseClicked

        f_dashboard.setVisible(false);
        f_sale.setVisible(false);
        f_inventory.setVisible(false);
        f_setting.setVisible(false);
        f_supplier.setVisible(false);
        f_staff.setVisible(false);
        f_customer.setVisible(true);
        f_attendance.setVisible(false);
    }//GEN-LAST:event_btn_customerMouseClicked

    private void btn_supplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_supplierMouseExited
        btn_supplier.setForeground(Color.white);
    }//GEN-LAST:event_btn_supplierMouseExited

    private void btn_supplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_supplierMouseEntered
        btn_supplier.setForeground(Color.black);
    }//GEN-LAST:event_btn_supplierMouseEntered

    private void btn_supplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_supplierMouseClicked

        f_dashboard.setVisible(false);
        f_sale.setVisible(false);
        f_inventory.setVisible(false);
        f_setting.setVisible(false);
        f_supplier.setVisible(true);
        f_staff.setVisible(false);
        f_customer.setVisible(false);
        f_attendance.setVisible(false);
    }//GEN-LAST:event_btn_supplierMouseClicked

    private void btn_inventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inventoryMouseExited
        btn_inventory.setForeground(Color.white);
    }//GEN-LAST:event_btn_inventoryMouseExited

    private void btn_inventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inventoryMouseEntered
        btn_inventory.setForeground(Color.black);
    }//GEN-LAST:event_btn_inventoryMouseEntered

    private void btn_inventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inventoryMouseClicked

        f_dashboard.setVisible(false);
        f_sale.setVisible(false);
        f_inventory.setVisible(true);
        f_setting.setVisible(false);
        f_supplier.setVisible(false);
        f_staff.setVisible(false);
        f_customer.setVisible(false);
        f_attendance.setVisible(false);
    }//GEN-LAST:event_btn_inventoryMouseClicked

    private void btn_saleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saleMouseExited
        btn_sale.setForeground(Color.white);
    }//GEN-LAST:event_btn_saleMouseExited

    private void btn_saleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saleMouseEntered
        btn_sale.setForeground(Color.black);
    }//GEN-LAST:event_btn_saleMouseEntered

    private void btn_saleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saleMouseClicked
        f_dashboard.setVisible(false);
        f_sale.setVisible(true);
        f_inventory.setVisible(false);
        f_setting.setVisible(false);
        f_supplier.setVisible(false);
        f_staff.setVisible(false);
        f_customer.setVisible(false);
        f_attendance.setVisible(false);
    }//GEN-LAST:event_btn_saleMouseClicked

    private void btn_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseExited
        btn_dashboard.setForeground(Color.white);
    }//GEN-LAST:event_btn_dashboardMouseExited

    private void btn_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseEntered
        btn_dashboard.setForeground(Color.black);
    }//GEN-LAST:event_btn_dashboardMouseEntered

    private void btn_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseClicked

        f_dashboard.setVisible(true);
        f_sale.setVisible(false);
        f_inventory.setVisible(false);
        f_setting.setVisible(false);
        f_supplier.setVisible(false);
        f_staff.setVisible(false);
        f_customer.setVisible(false);
        f_attendance.setVisible(false);
    }//GEN-LAST:event_btn_dashboardMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        connection.connetionDB();                       // connect to finger print database
        fpConnection =connection.getConnection();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAttencance;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btn_customer;
    private javax.swing.JLabel btn_dashboard;
    private javax.swing.JLabel btn_inventory;
    private javax.swing.JLabel btn_report;
    private javax.swing.JLabel btn_sale;
    private javax.swing.JLabel btn_setting;
    private javax.swing.JLabel btn_staff;
    private javax.swing.JLabel btn_supplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lb_position_log;
    public static javax.swing.JLabel lb_user_log;
    private javax.swing.JPanel panel_navbar;
    private javax.swing.JPanel panel_subform;
    // End of variables declaration//GEN-END:variables


}

