/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rental_System;

import java.awt.CardLayout;

/**
 *
 * @author Simmigon Flagg
 */
public class AppHome extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    CardLayout showCardView = null;
    private String CredentialsLevel = "";

    public AppHome() {
        initComponents();
        // Set when login

        Credentials(CredentialsLevel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelButton = new javax.swing.JPanel();
        btnTenants = new javax.swing.JButton();
        btnApplicants = new javax.swing.JButton();
        btnAdmins = new javax.swing.JButton();
        btnEmployees = new javax.swing.JButton();
        btnMaintenance = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnLoginCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblLoginName = new javax.swing.JLabel();
        PanelCard = new javax.swing.JPanel();
        cardPanels = new javax.swing.JPanel();
        loginView1 = new Rental_System.LoginView();
        adminView1 = new Rental_System.AdminView();
        tenantsView1 = new Rental_System.TenantsView();
        maintenanceView1 = new Rental_System.MaintenanceView();
        applicantsView1 = new Rental_System.ApplicantsView();
        clientView1 = new Rental_System.ClientView();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(958, 538));
        setName("Application"); // NOI18N
        setPreferredSize(new java.awt.Dimension(958, 538));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelButton.setBackground(new java.awt.Color(255, 255, 153));
        panelButton.setOpaque(false);

        btnTenants.setText("Tenants");
        btnTenants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTenantsActionPerformed(evt);
            }
        });

        btnApplicants.setText("Applicants");
        btnApplicants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplicantsActionPerformed(evt);
            }
        });

        btnAdmins.setText("Admin");

        btnEmployees.setText("Employee");

        btnMaintenance.setText("Maintenance");
        btnMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintenanceActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLoginCancel.setText("Cancel");
        btnLoginCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonLayout = new javax.swing.GroupLayout(panelButton);
        panelButton.setLayout(panelButtonLayout);
        panelButtonLayout.setHorizontalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTenants)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApplicants)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoginCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdmins, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmployees)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        panelButtonLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdmins, btnApplicants, btnEmployees, btnTenants});

        panelButtonLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLogin, btnLoginCancel});

        panelButtonLayout.setVerticalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTenants)
                    .addComponent(btnApplicants)
                    .addComponent(btnEmployees)
                    .addComponent(btnMaintenance)
                    .addComponent(btnAdmins)
                    .addComponent(btnLogin)
                    .addComponent(btnLoginCancel))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelButtonLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdmins, btnApplicants, btnEmployees, btnMaintenance, btnTenants});

        getContentPane().add(panelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 935, -1));

        jPanel1.setPreferredSize(new java.awt.Dimension(958, 48));

        lblLoginName.setText("Welcome, ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoginName)
                .addContainerGap(898, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLoginName)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelCard.setBackground(new java.awt.Color(255, 153, 153));
        PanelCard.setOpaque(false);
        PanelCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardPanels.setBackground(new java.awt.Color(0, 0, 153));
        cardPanels.setMaximumSize(new java.awt.Dimension(0, 0));
        cardPanels.setPreferredSize(new java.awt.Dimension(700, 300));
        cardPanels.setLayout(new java.awt.CardLayout());

        loginView1.setOpaque(true);
        cardPanels.add(loginView1, "Login View");
        cardPanels.add(adminView1, "Admins");
        cardPanels.add(tenantsView1, "Tenants");
        cardPanels.add(maintenanceView1, "Maintenance");
        cardPanels.add(applicantsView1, "Applicants");
        cardPanels.add(clientView1, "card7");

        PanelCard.add(cardPanels, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        getContentPane().add(PanelCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, 935, 330));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rental_System/LoginBackground.JPG"))); // NOI18N
        Background.setPreferredSize(new java.awt.Dimension(955, 537));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnApplicantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplicantsActionPerformed
        // TODO add your handling code here:
showCardView.show(cardPanels, "Applicants");
    }//GEN-LAST:event_btnApplicantsActionPerformed

    private void btnMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintenanceActionPerformed
        // TODO add your handling code here:
        showCardView.show(cardPanels, "Maintenance");
    }//GEN-LAST:event_btnMaintenanceActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String Credentials = "Admins";
        Credentials(Credentials);


    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginCancelActionPerformed

    private void btnTenantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTenantsActionPerformed
        // TODO add your handling code here:
        showCardView.show(cardPanels, "Tenants");
    }//GEN-LAST:event_btnTenantsActionPerformed
    public final void Credentials(String CredentialsLevel) {

        String name = null;

        switch (CredentialsLevel) {
            case "Admins":
                lblLoginName.setText(name + "Admin");//get user Name if admin;
                showCardView.show(cardPanels, CredentialsLevel);
                btnLogin.setVisible(false);
                btnLoginCancel.setVisible(false);
                btnAdmins.setVisible(true);
                btnApplicants.setVisible(true);
                btnEmployees.setVisible(true);
                btnMaintenance.setVisible(true);
                btnTenants.setVisible(true);
                break;
            case "Client":

                lblLoginName.setText(name + "");//
                showCardView.show(cardPanels, CredentialsLevel);
                btnMaintenance.setVisible(true);
                btnTenants.setVisible(true);
                btnApplicants.setVisible(true);
                btnAdmins.setVisible(false);
                btnEmployees.setVisible(false);
                break;

            case "Maintenance":

                lblLoginName.setText(name + "");//
                showCardView.show(cardPanels, CredentialsLevel);
                btnLogin.setVisible(false);
                btnLoginCancel.setVisible(false);
                btnApplicants.setVisible(true);
                btnMaintenance.setVisible(true);
                btnTenants.setVisible(true);
                btnAdmins.setVisible(false);
                btnEmployees.setVisible(false);
                break;

            case "Applicants":

                lblLoginName.setText(name + "");//
                showCardView.show(cardPanels, CredentialsLevel);
                btnLogin.setVisible(false);
                btnLoginCancel.setVisible(false);
                btnApplicants.setVisible(true);
                btnMaintenance.setVisible(true);
                btnTenants.setVisible(true);
                btnAdmins.setVisible(false);
                btnEmployees.setVisible(false);
                break;
            default:

                lblLoginName.setText("");
                showCardView = (CardLayout) cardPanels.getLayout();
                btnApplicants.setVisible(false);
                btnMaintenance.setVisible(false);
                btnTenants.setVisible(false);
                btnAdmins.setVisible(false);
                btnEmployees.setVisible(false);
                break;
        }

    }

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
            java.util.logging.Logger.getLogger(AppHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel PanelCard;
    private Rental_System.AdminView adminView1;
    private Rental_System.ApplicantsView applicantsView1;
    private javax.swing.JButton btnAdmins;
    private javax.swing.JButton btnApplicants;
    private javax.swing.JButton btnEmployees;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginCancel;
    private javax.swing.JButton btnMaintenance;
    private javax.swing.JButton btnTenants;
    public javax.swing.JPanel cardPanels;
    private Rental_System.ClientView clientView1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLoginName;
    private Rental_System.LoginView loginView1;
    private Rental_System.MaintenanceView maintenanceView1;
    public javax.swing.JPanel panelButton;
    private Rental_System.TenantsView tenantsView1;
    // End of variables declaration//GEN-END:variables
}
