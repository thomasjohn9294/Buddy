/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.VolunteerRole;

import models.Contribution.Contribution;
import models.AppSystem;
import models.Store.Store;
import models.StoreAdmin.StoreAdmin;
import models.Person.Person;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author naina
 */
public class ApproveRejectStoreContributionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ApproveRejectStoreContributionJPanel
     */
    private JPanel userProcessContainer;
    private AppSystem system;
    private Person user;

    public ApproveRejectStoreContributionJPanel(JPanel userProcessContainer, Person user, AppSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.user = user;

        populateStoreContribution();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStoreContribution = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(243, 244, 246));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblStoreContribution.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Store Name", "Item", "Quantity", "Expiry Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblStoreContribution);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 618, 160));

        btnApprove.setBackground(new java.awt.Color(51, 102, 0));
        btnApprove.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        btnReject.setBackground(new java.awt.Color(51, 102, 0));
        btnReject.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 150, 40));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Manage Store Contribution");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        btnBack1.setBackground(new java.awt.Color(51, 102, 0));
        btnBack1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(255, 255, 255));
        btnBack1.setText("Back");
        btnBack1.setBorder(null);
        btnBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectRow = tblStoreContribution.getSelectedRow();
        Contribution contribution = (Contribution) tblStoreContribution.getValueAt(selectRow, 0);
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            if (contribution.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Order already rejected", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                contribution.setStatus("Rejected");
            }
        }
        populateStoreContribution();
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectRow = tblStoreContribution.getSelectedRow();
        Contribution contribution = (Contribution) tblStoreContribution.getValueAt(selectRow, 0);
        if (selectRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            if (contribution.getStatus().equals("Approved")) {
                JOptionPane.showMessageDialog(null, "Order already approved", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                contribution.setStatus("Approved");
            }
        }
        populateStoreContribution();
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStoreContribution;
    // End of variables declaration//GEN-END:variables

    private void populateStoreContribution() {

        DefaultTableModel model = (DefaultTableModel) tblStoreContribution.getModel();

        model.setRowCount(0);

        for (Store admin : system.getStoreDirectory().getStoreDirectory()) {

            if ("models.Role.VolunteerRole".equals(user.getRole().getClass().getName())) {
                for (Contribution contribution : admin.getContribution()) {
                    Object[] row = new Object[5];
                    row[0] = contribution;
                    row[1] = contribution.getItem();
                    row[2] = contribution.getQuantity();
                    row[3] = contribution.getExpiryDate();
                    row[4] = contribution.getStatus();
                    model.addRow(row);
                }

            }
        }
    }
}
