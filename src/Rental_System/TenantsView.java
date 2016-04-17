/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rental_System;

import java.util.ArrayList;
import java.util.Date;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Simmigon Flagg
 */
public class TenantsView extends javax.swing.JPanel {

    /**
     * Creates new form TenantsView
     */
    Database tenants = new Database();

    public TenantsView() {
        initComponents();
        btnBackToTenantTable.setVisible(false);
        //  System.out.println("tenants.setTenantsTable();");
        tblTenants.setModel(DbUtils.resultSetToTableModel(tenants.setTenantsTable()));
        //   System.out.println("tenants.closeDatabase();");
        tenants.closeDatabase();

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
        btnBackToTenantTable = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tabTenant = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTenants = new javax.swing.JTable();
        spTenant = new javax.swing.JScrollPane();
        panPayRent = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenantFirst = new javax.swing.JTextField();
        txtTenantLast = new javax.swing.JTextField();
        txtTenantPhone = new javax.swing.JTextField();
        txtTenantLocation = new javax.swing.JTextField();
        txtTenantApartment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTenantRent = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTenantEnterBal = new javax.swing.JTextField();
        btnUpdateTenant = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 308));

        btnBackToTenantTable.setText("BACK");
        btnBackToTenantTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToTenantTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackToTenantTable, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(btnBackToTenantTable)
                .addContainerGap())
        );

        jLabel1.setText("jLabel1");

        jPanel2.setLayout(new java.awt.CardLayout());

        tabTenant.setMaximumSize(new java.awt.Dimension(0, 0));
        tabTenant.setMinimumSize(new java.awt.Dimension(0, 0));

        tblTenants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTenants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTenantsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTenants);

        tabTenant.addTab("Tenants", jScrollPane1);

        jPanel2.add(tabTenant, "card2");

        panPayRent.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Phone Number:");

        jLabel5.setText("Lux Location:");

        jLabel6.setText("Apartment Number:");

        txtTenantLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenantLocationActionPerformed(evt);
            }
        });

        txtTenantApartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenantApartmentActionPerformed(evt);
            }
        });

        jLabel7.setText("Rent");

        txtTenantRent.setEnabled(false);
        txtTenantRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenantRentActionPerformed(evt);
            }
        });

        jLabel8.setText("Move-In Date:");

        jLabel9.setText("Move-Out Date:");

        jLabel10.setText("Enter Rent Amount:");

        txtTenantEnterBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenantEnterBalActionPerformed(evt);
            }
        });

        btnUpdateTenant.setText("Update");
        btnUpdateTenant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTenantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPayRentLayout = new javax.swing.GroupLayout(panPayRent);
        panPayRent.setLayout(panPayRentLayout);
        panPayRentLayout.setHorizontalGroup(
            panPayRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPayRentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPayRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(panPayRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panPayRentLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(panPayRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panPayRentLayout.createSequentialGroup()
                                .addComponent(txtTenantLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addGroup(panPayRentLayout.createSequentialGroup()
                                .addComponent(txtTenantPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panPayRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panPayRentLayout.createSequentialGroup()
                                    .addComponent(txtTenantLast, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTenantEnterBal, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panPayRentLayout.createSequentialGroup()
                                    .addComponent(txtTenantFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTenantRent, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panPayRentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenantApartment, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        panPayRentLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        panPayRentLayout.setVerticalGroup(
            panPayRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPayRentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPayRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenantFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenantRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPayRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenantLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtTenantEnterBal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateTenant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPayRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenantPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPayRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTenantLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPayRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTenantApartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        spTenant.setViewportView(panPayRent);
        panPayRent.getAccessibleContext().setAccessibleParent(jScrollPane1);

        jPanel2.add(spTenant, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackToTenantTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToTenantTableActionPerformed
        tblTenants.setModel(DbUtils.resultSetToTableModel(tenants.setTenantsTable()));
       
        tenants.closeDatabase();
        btnBackToTenantTable.setVisible(false);
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();

        jPanel2.add(tabTenant);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btnBackToTenantTableActionPerformed

    private void txtTenantEnterBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenantEnterBalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenantEnterBalActionPerformed

    private void txtTenantRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenantRentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenantRentActionPerformed

    private void txtTenantApartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenantApartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenantApartmentActionPerformed

    private void txtTenantLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenantLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenantLocationActionPerformed

    private void tblTenantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTenantsMouseClicked
        btnBackToTenantTable.setVisible(true);
        int row = tblTenants.getSelectedRow();
        int col = 8;

        ArrayList<String> tenantList = new ArrayList<>();

        for (int i = 0; i < col; i++) {
            tenantList.add(tblTenants.getModel().getValueAt(row, i).toString());

        }

        txtTenantFirst.setText(tenantList.get(0));
        txtTenantLast.setText(tenantList.get(1));
        txtTenantPhone.setText(tenantList.get(2));
        txtTenantRent.setText(tenantList.get(7));

        txtTenantLocation.setText(tenantList.get(3));
        txtTenantApartment.setText(tenantList.get(4));

        tenants.closeDatabase();
        // this will be good for paid.
        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();

        jPanel2.add(spTenant);
        jPanel2.repaint();
        jPanel2.revalidate();
        txtTenantEnterBal.setText("");

    }//GEN-LAST:event_tblTenantsMouseClicked

    private void btnUpdateTenantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTenantActionPerformed

  
        
    
        
        tenants.updateTenantRent(txtTenantFirst.getText(),  txtTenantLast.getText(), txtTenantPhone.getText(), txtTenantLocation.getText(), txtTenantApartment.getText(), txtTenantEnterBal.getText());

        jPanel2.removeAll();
        jPanel2.repaint();
        jPanel2.revalidate();

        jPanel2.add(tabTenant);
        jPanel2.repaint();
        jPanel2.revalidate();
        btnBackToTenantTable.setVisible(false);
    }//GEN-LAST:event_btnUpdateTenantActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToTenantTable;
    private javax.swing.JButton btnUpdateTenant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panPayRent;
    private javax.swing.JScrollPane spTenant;
    private javax.swing.JTabbedPane tabTenant;
    private javax.swing.JTable tblTenants;
    private javax.swing.JTextField txtTenantApartment;
    private javax.swing.JTextField txtTenantEnterBal;
    private javax.swing.JTextField txtTenantFirst;
    private javax.swing.JTextField txtTenantLast;
    private javax.swing.JTextField txtTenantLocation;
    private javax.swing.JTextField txtTenantPhone;
    private javax.swing.JTextField txtTenantRent;
    // End of variables declaration//GEN-END:variables
}
