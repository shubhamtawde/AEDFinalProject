/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ManufacturerAdmin;

import ui.HospitalAdmin.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Credentials.Credentials;
import Model.Manufacturer.Manufacturer;
import Model.Doctor.Doctor;
import Model.Hospital.Hospital;
import Model.Manufacturer.Manufacturer;
import Model.System.DatabaseConnection;

/**
 *
 * @author shubham
 */
public class ManageManufacturerPanel extends javax.swing.JPanel {

    DatabaseConnection db = new DatabaseConnection();

    /**
     * Creates new form ManageHospitalPanel
     */
    public ManageManufacturerPanel() {
        initComponents();
        populateTable();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        manufId = new javax.swing.JTextField();
        manufName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        manufacturerTable = new javax.swing.JTable();
        viewManufacturerBtn = new javax.swing.JButton();
        updManufBtn = new javax.swing.JButton();
        deleteManufBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 118, 211));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Manufacturer Panel");

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 118, 211));
        jLabel2.setText("Manufacturer ID : ");

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 118, 211));
        jLabel3.setText("Manufacturer Name :");

        manufId.setEditable(false);
        manufId.setBackground(java.awt.Color.white);

        manufacturerTable.setBackground(new java.awt.Color(25, 118, 211));
        manufacturerTable.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        manufacturerTable.setForeground(new java.awt.Color(255, 255, 255));
        manufacturerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Manufacturer Name", "Manufacturer ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manufacturerTable);

        viewManufacturerBtn.setBackground(new java.awt.Color(25, 118, 211));
        viewManufacturerBtn.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        viewManufacturerBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewManufacturerBtn.setText("View");
        viewManufacturerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewManufacturerBtnActionPerformed(evt);
            }
        });

        updManufBtn.setBackground(new java.awt.Color(25, 118, 211));
        updManufBtn.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        updManufBtn.setForeground(new java.awt.Color(255, 255, 255));
        updManufBtn.setText("Update Manufacturer");
        updManufBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updManufBtnActionPerformed(evt);
            }
        });

        deleteManufBtn.setBackground(new java.awt.Color(25, 118, 211));
        deleteManufBtn.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        deleteManufBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteManufBtn.setText("Delete Manufacturer");
        deleteManufBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteManufBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(updManufBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(deleteManufBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(viewManufacturerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(325, 325, 325))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manufName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manufId, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(223, 223, 223))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {manufId, manufName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteManufBtn, updManufBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewManufacturerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(manufName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteManufBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updManufBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {manufId, manufName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {deleteManufBtn, updManufBtn});

    }// </editor-fold>//GEN-END:initComponents

    private void viewManufacturerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewManufacturerBtnActionPerformed
        // TODO add your handling code here:
        int rowIndex = manufacturerTable.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select an employee to update!");
            return;
        }

        if (manufacturerTable.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(this, "Please select only 1 employee to update!");
            return;
        }

        DefaultTableModel tableModel = (DefaultTableModel) manufacturerTable.getModel();
        Manufacturer toUpdManufacturer = (Manufacturer) tableModel.getValueAt(rowIndex, 0);

        showManufacturer(toUpdManufacturer);
    }//GEN-LAST:event_viewManufacturerBtnActionPerformed

    private void updManufBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updManufBtnActionPerformed
        // TODO add your handling code here:
        if (manufName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Enter valid input!");
            return;
        }

        if (Pattern.matches("^[0-9]*$", manufName.getText())) {
            JOptionPane.showMessageDialog(this, "Name cannot contain numbers!");
            return;
        }

        Connection dbConn = null;
        PreparedStatement manufStatement = null;
        String updQuery = "UPDATE project.manufacturer SET manufacturerName = ? WHERE manufacturerId = ?;";
        
        Manufacturer manuf = new Manufacturer();
        manuf.setManufacturerId(Long.valueOf(manufId.getText()));
        manuf.setManufacturerName(manufName.getText());
        try {
            dbConn = db.getConnection();
            if (dbConn != null) {

                dbConn.setAutoCommit(false);
                manufStatement = dbConn.prepareStatement(updQuery);
                manufStatement.setString(1, manuf.getManufacturerName());
                manufStatement.setLong(2, manuf.getManufacturerId());

                if (manufStatement.executeUpdate() > 0) {
                    System.out.println("Updated Manufacturer Successfully!");
                    JOptionPane.showMessageDialog(this, "Update Manufacturer Successfully!");
                    dbConn.commit();
                } else {
                    System.out.println("Failed to update Hospital");
                    JOptionPane.showMessageDialog(this, "Failed to update Manufacturer!");
                    dbConn.rollback();
                }
            } else {
                System.out.println("DB connection not connected");
            }
        } catch (SQLException sqlExp) {
            //rollback the connection
            sqlExp.printStackTrace();
        } catch (Exception exp) {
            exp.printStackTrace();

        } finally {
            if (manufStatement != null) {
                try {
                    if (!manufStatement.isClosed()) {
                        manufStatement.close();
                    }
                } catch (SQLException err) {
                    err.printStackTrace();

                }
            }
            if (dbConn != null) {
                try {
                    if (!dbConn.isClosed()) {
                        db.closeConnection(dbConn);
                    }
                } catch (SQLException err) {
                    err.printStackTrace();
                }
            }
        }
        clearFields();
        populateTable();
    }//GEN-LAST:event_updManufBtnActionPerformed

    private void deleteManufBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteManufBtnActionPerformed
        // TODO add your handling code here:
        int rowIndex = manufacturerTable.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Manufacturer to delete!");
            return;
        }

        if (manufacturerTable.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(this, "Please select only 1 Manufacturer to delete!");
            return;
        }

        DefaultTableModel tableModel = (DefaultTableModel) manufacturerTable.getModel();
        Manufacturer toDelManufacturer = (Manufacturer) tableModel.getValueAt(rowIndex, 0);

        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this Manufacturer?", "Delete Hospital Confirmation", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            //delete employee
            deleteManufacturer(toDelManufacturer);

            JOptionPane.showMessageDialog(this, "Manufacturer Deleted Successfully!");
            //populate table to refresh the deleted record
            populateTable();
        }

    }//GEN-LAST:event_deleteManufBtnActionPerformed

    private void populateTable() {
        Connection dbConn = null;
        ResultSet dbResult = null;
        PreparedStatement sqlStatement = null;
        Long hospitalId = (long) (Math.random() * (9999 - 1) + 1);
        String sqlQuery = "SELECT * FROM project.manufacturer;";
        try {
            dbConn = db.getConnection();
            if (dbConn != null) {
                sqlStatement = dbConn.prepareStatement(sqlQuery);
                dbResult = sqlStatement.executeQuery();
                System.out.println(dbResult);
                if (!dbResult.next()) {
                    System.out.println("Result set is null!");
                } else {
                    fillTable(dbResult);
                }
            } else {
                System.out.println("DB connection not connected");
            }
        } catch (SQLException sqlExp) {
            //rollback the connection
            sqlExp.printStackTrace();
        } catch (Exception exp) {
            exp.printStackTrace();

        } finally {
            if (sqlStatement != null) {
                try {
                    if (!sqlStatement.isClosed()) {
                        sqlStatement.close();
                    }
                } catch (SQLException err) {
                    err.printStackTrace();

                }
            }
            if (dbConn != null) {
                try {
                    if (!dbConn.isClosed()) {
                        db.closeConnection(dbConn);
                    }
                } catch (SQLException err) {
                    err.printStackTrace();

                }
            }
        }
    }

    private void fillTable(ResultSet dbResult) throws SQLException {
        DefaultTableModel tableModel = (DefaultTableModel) manufacturerTable.getModel();

        tableModel.setRowCount(0);

        do {
            Manufacturer manu = new Manufacturer();
            manu.setManufacturerId(dbResult.getLong(1));
            manu.setManufacturerName(dbResult.getString(2));
            
            Object[] tblRow = new Object[3];
            tblRow[0] = manu;
            tblRow[1] = manu.getManufacturerId();
            tableModel.addRow(tblRow);
        } while (dbResult.next());
    }

    private void showManufacturer(Manufacturer toUpdManufacturer) {
        manufId.setText(String.valueOf(toUpdManufacturer.getManufacturerId()));
        manufName.setText(toUpdManufacturer.getManufacturerName());
    }

    private void clearFields() {
        manufId.setText("");
        manufName.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteManufBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField manufId;
    private javax.swing.JTextField manufName;
    private javax.swing.JTable manufacturerTable;
    private javax.swing.JButton updManufBtn;
    private javax.swing.JButton viewManufacturerBtn;
    // End of variables declaration//GEN-END:variables

    private void deleteManufacturer(Manufacturer toDelManufacturer) {

        Connection dbConn = null;
        PreparedStatement delStatement = null;

        String delQuery = "DELETE FROM project.manufacturer WHERE manufacturerId =  ?;";

        Manufacturer manuf = new Manufacturer();
        manuf.setManufacturerId(toDelManufacturer.getManufacturerId());
        manuf.setManufacturerName(toDelManufacturer.getManufacturerName());

        try {
            dbConn = db.getConnection();
            if (dbConn != null) {
                dbConn.setAutoCommit(false);
                delStatement = dbConn.prepareStatement(delQuery);
                delStatement.setLong(1, manuf.getManufacturerId());

                if (delStatement.executeUpdate() > 0) {
                    System.out.println("Deleted Manufacturer Successfully!");
                    JOptionPane.showMessageDialog(this, "Deleted Manufacturer Successfully!");
                    dbConn.commit();
                } else {
                    System.out.println("Failed to delete Manufacturer");
                    JOptionPane.showMessageDialog(this, "Failed to delete Manufacturer!");
                    dbConn.rollback();
                }
            } else {
                System.out.println("DB connection not connected");
            }
        } catch (SQLException sqlExp) {
            //rollback the connection
            sqlExp.printStackTrace();
        } catch (Exception exp) {
            exp.printStackTrace();

        } finally {
            if (delStatement != null) {
                try {
                    if (!delStatement.isClosed()) {
                        delStatement.close();
                    }
                } catch (SQLException err) {
                    err.printStackTrace();

                }
            }
            if (dbConn != null) {
                try {
                    if (!dbConn.isClosed()) {
                        db.closeConnection(dbConn);
                    }
                } catch (SQLException err) {
                    err.printStackTrace();

                }
            }
        }
        populateTable();
    }
}
