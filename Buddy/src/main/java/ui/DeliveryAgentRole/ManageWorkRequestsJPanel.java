/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DeliveryAgentRole;

import models.DeliveryAgency.Clerk;
import models.DeliveryAgency.Driver;
import ui.SystemAdminWorkArea.*;
import models.DeliveryAgent.DeliveryAgent;
import models.AppSystem;
import models.Role.ClerkRole;
import models.Role.DeliveryAgentRole;
import models.Role.DriverRole;
import models.Person.Person;
import models.Volunteer.Volunteer;
import models.TaskQueue.TaskQueue;
import models.TaskQueue.Task;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author naina
 */
public class ManageWorkRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryAgentJPanel
     */
    private JPanel userProcessContainer;
    private AppSystem system;
    Person user;
    TaskQueue workQueue;
    Task workRequest;

    public ManageWorkRequestsJPanel(JPanel userProcessContainer, AppSystem system, Person user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.user = user;
        populateWorkRequests();
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
        tblWorkRequests = new javax.swing.JTable();
        btnAssignDriver = new javax.swing.JButton();
        btnAssignClerk = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(243, 244, 246));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Work Request ID", "pickUp Location", "dropOff Location", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 640, 190));

        btnAssignDriver.setText("ASSIGN A DRIVER");
        btnAssignDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDriverActionPerformed(evt);
            }
        });
        add(btnAssignDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        btnAssignClerk.setText("ASSIGN A CLERK");
        btnAssignClerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignClerkActionPerformed(evt);
            }
        });
        add(btnAssignClerk, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

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
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 110, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Work Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        btnRefresh.setBackground(new java.awt.Color(51, 102, 0));
        btnRefresh.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDriverActionPerformed
        // TODO add your handling code here:

//        int selectedRow = tblWorkRequests.getSelectedRow();
        int selectedRow = tblWorkRequests.getSelectedRow();

        Task workreq = (Task) tblWorkRequests.getValueAt(selectedRow, 0);

        if (workreq.getStatus().equals("Assigned to Driver")) {
            JOptionPane.showMessageDialog(null, "Already Assigned Work", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            AssignDriverJPanel AssignDriver = new AssignDriverJPanel(userProcessContainer, user, workreq, system);
            userProcessContainer.add("Assign Driver", AssignDriver);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            workreq.setStatus("Req to Driver sent");
            populateWorkRequests();

        }


    }//GEN-LAST:event_btnAssignDriverActionPerformed

    private void btnAssignClerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignClerkActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblWorkRequests.getSelectedRow();
        Task workreq = (Task) tblWorkRequests.getValueAt(selectedRow, 0);

        if (workreq.getStatus().equals("Assigned to Clerk")) {
            JOptionPane.showMessageDialog(null, "Already Assigned Work", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            //System.out.println("Reached else in assign driver button managing workreqs");
            AssignClerkJPanel AssignClerk = new AssignClerkJPanel(userProcessContainer, user, workreq, system);
            userProcessContainer.add("Assign Driver", AssignClerk);

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            workreq.setStatus("Request to Clerk sent");
            populateWorkRequests();
        }
    }//GEN-LAST:event_btnAssignClerkActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
         populateWorkRequests();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignClerk;
    private javax.swing.JButton btnAssignDriver;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables

    private void populateWorkRequests() {
        Task workreq = new Task();

        workreq.setDeliveryAgencyAdminName("pavan");
        workreq.setDropOffLocation("curry center");
        workreq.setPickUpLocation("stop and shop");
        workreq.setPickUptime(null);
        workreq.setDropOfftime(null);

        if (user.getUsername().equals("pavan")) {
            user.getWorkQueue().addWorkRequesttoQueue(workreq);
        }

        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();

        for (Person admin : system.getUserAccountDirectory().getUserAccountList()) {
               
           if(admin.getUsername().equals(user.getUsername())) {
          
             for(Task wr : user.getWorkQueue().getWorkQueue())
             {
                Object[] row = new Object[4];

                row[0] = wr;
                row[1] = wr.getPickUpLocation();
                row[2] = wr.getDropOffLocation();
                row[3] = wr.getStatus();

                model.addRow(row);
            
              }
        }       
       } 
//        int i = 0;
//        for (WorkRequest admin : system.getWorkQueue().getWorkQueue()) {
//            Object[] row = new Object[7];
//
//            row[0] = admin;
//            row[1] = admin.getProductList().getProductList().get(i).getProductName();
//            row[2] = admin.getProductList().getProductList().get(i).getExpiryDate();
//            row[3] = admin.getPickUpLocation();
//            row[4] = admin.getDropOffLocation();
//            row[5] = admin.getReceiver();
//            row[6] = admin.getStatus();
//
//            model.addRow(row);
//            //i++;
//        }
    }
}
