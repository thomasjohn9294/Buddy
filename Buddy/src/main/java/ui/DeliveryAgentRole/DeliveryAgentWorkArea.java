/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DeliveryAgentRole;

import models.AppSystem;
import models.Person.Person;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.SystemAdminWorkArea.ManageDeliveryAgentJPanel;

/**
 *
 * @author naina
 */
public class DeliveryAgentWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryAgentWorkArea
     */
    private JPanel userProcessContainer;
    private AppSystem ecosystem;
    private Person userAccount;

    public DeliveryAgentWorkArea(JPanel userProcessContainer, Person account, AppSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        
        jLabel1.setText("Welcome "+account.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDrivers = new javax.swing.JButton();
        btnWorkRequests = new javax.swing.JButton();
        btnClerks = new javax.swing.JButton();

        setBackground(new java.awt.Color(243, 244, 246));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Delivery Agency");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 278, 32));

        btnDrivers.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnDrivers.setText("Manage Drivers");
        btnDrivers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDrivers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriversActionPerformed(evt);
            }
        });
        add(btnDrivers, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 178, 33));

        btnWorkRequests.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnWorkRequests.setText("Manage Work Requests");
        btnWorkRequests.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnWorkRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkRequestsActionPerformed(evt);
            }
        });
        add(btnWorkRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 180, 37));

        btnClerks.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        btnClerks.setText("Manage Clerks");
        btnClerks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnClerks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClerksActionPerformed(evt);
            }
        });
        add(btnClerks, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 178, 37));
    }// </editor-fold>//GEN-END:initComponents

    private void btnWorkRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkRequestsActionPerformed
        // TODO add your handling code here:
        ManageWorkRequestsJPanel aDjp = new ManageWorkRequestsJPanel(userProcessContainer, ecosystem, userAccount);
        userProcessContainer.add("Manage Work Requests", aDjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnWorkRequestsActionPerformed

    private void btnDriversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriversActionPerformed
        // TODO add your handling code here:
        ManageDriverJPanel aDjp = new ManageDriverJPanel(userProcessContainer, ecosystem,userAccount);
        userProcessContainer.add("Manage Drivers", aDjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDriversActionPerformed

    private void btnClerksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClerksActionPerformed
        // TODO add your handling code here:
        ManageClerkJPanel aDjp = new ManageClerkJPanel(userProcessContainer, ecosystem,userAccount);
        userProcessContainer.add("Manage Clerks", aDjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnClerksActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClerks;
    private javax.swing.JButton btnDrivers;
    private javax.swing.JButton btnWorkRequests;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
