/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Clerks;

import ui.Driver.*;
import models.AppSystem;
import models.Volunteer.Volunteer;
import models.TaskQueue.Task;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author naina
 */
public class ProcessWorkRequestJPanel1 extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Task workrequest;
    AppSystem system;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel1(JPanel userProcessContainer, Task workrequest, AppSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.workrequest = workrequest;
        this.system = system;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setBackground(new java.awt.Color(67, 0, 163));
        submitJButton.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit Status");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 160, 40));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Result");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        txtResult.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });
        add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 130, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Delivery Status");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        btnBack1.setBackground(new java.awt.Color(255, 255, 255));
        btnBack1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnBack1.setText("Back");
        btnBack1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 110, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/images/approve.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        String status = txtResult.getText();

        try {
            if (status == null || status.isEmpty()) {
                throw new Exception(" Please enter Inspection status");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Please enter Inspection status");
            return;
        }

        workrequest.setStatus(status);
//        for (Volunteer cust : system.getVolunteerDirectory().getVolunteerList()) {
//            if (workrequest.getVolunteerUName().equals(cust.getUserName())) {
//                for (WorkRequest wr : cust.getWorkqueue().getWorkQueue()) {
//                    wr.setStatus(status);
//                }
//            }
//        }
        txtResult.setText("");
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ClerkWorkAreaJPanel1 dwjp = (ClerkWorkAreaJPanel1) component;
        //dwjp.populateTable();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
