/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.StoreAdminRole;

import models.Contribution.Contribution;
import models.AppSystem;
import models.Store.Store;
import models.Person.Person;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import com.toedter.calendar.JDateChooser;

/**
 *
 * @author naina
 */
public class AddContributionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddContributionJPanel
     */
    
    private JPanel userProcessContainer;
    private AppSystem system;
    Person account;
    Contribution contribution;
    JDateChooser jDateChooser = new JDateChooser();
    
    public AddContributionJPanel(JPanel userProcessContainer,Person account, AppSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        
        jLabel4.setText(account.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Item:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Quantity:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 212, -1, -1));

        txtqty.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(txtqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 143, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Expiry Date:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        btnAdd.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(67, 0, 163));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/plus.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 100, 40));

        btnReset.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/refresh-color.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Store Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 137, -1, -1));

        txtItem.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(txtItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 143, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 137, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/agree.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        btnBack1.setBackground(new java.awt.Color(255, 255, 255));
        btnBack1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/back.png"))); // NOI18N
        btnBack1.setText("Back");
        btnBack1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 110, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Add Contribution");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
       
        txtqty.setText("");
        txtItem.setText("");
        jDateChooser.setDateFormatString("");
        
       
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (txtItem.getText().trim().isEmpty() || txtqty.getText().trim().isEmpty() || jDateChooser==null){
            JOptionPane.showMessageDialog(null, "Please enter all fields");
        }
        
        String storeName = account.getName();
        jLabel4.setText(account.getName());
        String item = txtItem.getText();
        String qty = txtqty.getText();
        Date date = jDateChooser.getDate();
        String strDate = DateFormat.getDateInstance().format(date);
        
        try {
            if (item == null || item.isEmpty()) {
                throw new NullPointerException(" Item Name is Empty");

            } else if (Pattern.matches("^[A-Za-z]+$", item) == false) {
                throw new Exception("Please enter valid Item Name");

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, " Item Name is Empty");

            return;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "  Item Name is Empty");

            return;
        }
        
        if ( item.trim().isEmpty() || txtqty.getText().trim().isEmpty() || jDateChooser==null){
            JOptionPane.showMessageDialog(null, "Please enter all fields");
        }
        
        for(Store admin : system.getStoreDirectory().getStoreDirectory()){
           if(admin.getUserName().equals(account.getUsername())){
                system.getStoreDirectory().AddContribution(admin, storeName, item, qty, strDate, "New Request");
            }   
        }
        
        JOptionPane.showMessageDialog(null, "Item added");
        txtqty.setText("");
        txtItem.setText("");
        jDateChooser.setDateFormatString("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtqty;
    // End of variables declaration//GEN-END:variables
}
