/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DistributorRole;

import models.AppSystem;
import models.Receiver.Receiver;
import models.Person.Person;
import models.TaskQueue.TaskQueue;
import models.TaskQueue.Task;
import java.awt.CardLayout;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thomas
 */
public class DeliverToReceiverJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliverToReceiverJPanel
     */
    private JPanel userProcessContainer;
    private AppSystem business;
    private Person userAccount;
    Task workRequest;

    public DeliverToReceiverJPanel(JPanel userProcessContainer, Person account, AppSystem business, Task workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.workRequest = workRequest;
        popuateReceiverTable();
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
        tblReceiver = new javax.swing.JTable();
        btnDeliver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblReceiver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Receiver"
            }
        ));
        jScrollPane1.setViewportView(tblReceiver);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 580, 110));

        btnDeliver.setBackground(new java.awt.Color(67, 0, 163));
        btnDeliver.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnDeliver.setForeground(new java.awt.Color(255, 255, 255));
        btnDeliver.setText("Deliver");
        btnDeliver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliverActionPerformed(evt);
            }
        });
        add(btnDeliver, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 112, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setText("Assign To Receiver");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliverActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblReceiver.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Person receiver = (Person) tblReceiver.getValueAt(selectedRow, 0);
            workRequest.setStatus("Delivered to Receiver");
            workRequest.setReceiver(receiver);
            TaskQueue workQueue = new TaskQueue();
            workQueue.addWorkRequesttoQueue(workRequest);
            receiver.setWorkQueue(workQueue);
            
            JOptionPane.showMessageDialog(null, "Delivered to Receiver "+receiver);

            
//            String email="";
//            String phone="";
//            String carrier="";
//            for( Receiver rec : business.getReceiverDirectory().getReceiverList() ){
//                if( rec.getUserName().equals(userAccount.getUsername()) ){
//                email = rec.getEmail();
//                phone = rec.getPhone();
//                carrier = rec.getCarrier();
//                
//                }
//            }
//            
//            String toEmail = email;
//            String fromEmail = "dummyprojectuser@gmail.com";
//            String fromEmailPassword = "Testpassword";
//            String subject = "Registration Approved";
//
//            String textSms = phone;
//            if (carrier.equals("ATT")) {
//                textSms = textSms + "@txt.att.net";
//            } else if (carrier.equals("Verizon")) {
//                textSms = textSms + "@vmobl.com";
//            } else if (carrier.equals("Sprint")) {
//                textSms = textSms + "@messaging.sprintpcs.com";
//            } else if (carrier.equals("TMobile")) {
//                textSms = textSms + "@tmomail.net";
//            }
//
//            Properties properties = new Properties();
//            properties.put("mail.smtp.auth", "true");
//            properties.put("mail.smtp.starttls.enable", "true");
//            properties.put("mail.smtp.host", "smtp.gmail.com");
//            properties.put("mail.smtp.port", "587");
//
//            properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
//            properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
//
//            Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
//                protected PasswordAuthentication getPasswordAuthentication() {
//                    return new PasswordAuthentication("dummyprojectuser@gmail.com", "Testpassword");
//                }
//            });
//
//            try {
//                MimeMessage message = new MimeMessage(session);
//                message.setFrom(new InternetAddress(fromEmail));
//                message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
//                message.addRecipient(Message.RecipientType.TO, new InternetAddress(textSms));
//                message.setSubject(subject);
//                message.setText("Welome to the Team! Please log in to our portal and start making a difference :)");
//                Transport.send(message);
//
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, e);
//                System.out.println(e);
//            }

        }
    }//GEN-LAST:event_btnDeliverActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeliver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReceiver;
    // End of variables declaration//GEN-END:variables

    private void popuateReceiverTable() {
        DefaultTableModel model = (DefaultTableModel) tblReceiver.getModel();

        model.setRowCount(0);

        // Updating the contributorTable
        for (Person user : business.getUserAccountDirectory().getUserAccountList()) {

            if ("Business.Role.ReceiverRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[1];

                row[0] = user;

                model.addRow(row);
            }

        }
    }
}
