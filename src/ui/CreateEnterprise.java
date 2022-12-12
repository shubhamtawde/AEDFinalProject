/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Model.system.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author siddharthvaghela
 */
public class CreateEnterprise extends javax.swing.JPanel {

    /**
     * Creates new form createEnterprise
     */
    Connection dbConn = null;
    PreparedStatement sqlStatement = null;
     PreparedStatement sqlStatement1 = null;
      Logger logger = LogManager.getLogger(CreateEnterprise.class);
    public CreateEnterprise() {
        initComponents();
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
        jLabel4 = new javax.swing.JLabel();
        enterpriseName = new javax.swing.JTextField();
        usernameEnterprise = new javax.swing.JTextField();
        passwordEnterprise = new javax.swing.JTextField();
        saveEnterpriseButton = new javax.swing.JButton();
        enterpriseCategory = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        licenseDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        enterpriseEmail = new javax.swing.JTextField();

        jLabel1.setText("Name:");

        jLabel2.setText("Category:");

        jLabel3.setText("Username:");

        jLabel4.setText("Password:");

        usernameEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameEnterpriseActionPerformed(evt);
            }
        });

        passwordEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordEnterpriseActionPerformed(evt);
            }
        });

        saveEnterpriseButton.setText("Save");
        saveEnterpriseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEnterpriseButtonActionPerformed(evt);
            }
        });

        enterpriseCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Independent Researcher", "University", "Health Care", "Pharmaceutical Companies", "Research Publisher" }));

        jLabel5.setText("License:");

        jLabel6.setText("Email Id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordEnterprise)
                            .addComponent(licenseDate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel6)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saveEnterpriseButton)
                            .addComponent(enterpriseName)
                            .addComponent(usernameEnterprise)
                            .addComponent(enterpriseCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(enterpriseEmail))))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(enterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(enterpriseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usernameEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(enterpriseEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passwordEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(licenseDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveEnterpriseButton)
                .addGap(99, 99, 99))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usernameEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameEnterpriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameEnterpriseActionPerformed

    private void passwordEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordEnterpriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordEnterpriseActionPerformed

    private void saveEnterpriseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEnterpriseButtonActionPerformed
        // TODO add your handling code here:
        
        if(enterpriseName.getText().isEmpty() || usernameEnterprise.getText().isEmpty() || passwordEnterprise.getText().isEmpty()
                || enterpriseEmail.getText().isEmpty() || licenseDate.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please fill Atleast all Attributes");
              return;
        }
        
       String reg="[a-zA-Z]+";
       String regex = "^(.+)@(.+)$";
       String dateRegex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
       String emailRegex =        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
       
       if(!licenseDate.getText().matches(dateRegex))
       {
            //validating date format
                  JOptionPane.showMessageDialog(this, "Please Enter data in proper format MM/dd/yyyy");
                  return;
       }
      /* if(enterpriseEmail.getText().matches(emailRegex))
       {
           JOptionPane.showMessageDialog(this, "Please Enter Email in proper format");
                  return;
       }*/
       
       
        DatabaseConnection db = new DatabaseConnection();

        try {
            dbConn = db.getConnection();
            if (dbConn != null) {
                dbConn.setAutoCommit(false);
                sqlStatement = dbConn.prepareStatement("INSERT INTO EnterpriseList" + " VALUES " + " (?,?,?,?,?,?,?); ");
                sqlStatement1 = dbConn.prepareStatement("INSERT INTO Credentials" + " VALUES " + " (?,?,?,?,?);");
                Long id = (long) (Math.random() * (9999 - 1) + 1);
                sqlStatement.setLong(1, id);
                sqlStatement.setString(2, enterpriseName.getText());
                sqlStatement.setString(3, usernameEnterprise.getText());
                sqlStatement.setString(4, enterpriseCategory.getSelectedItem().toString());
                sqlStatement.setString(5, passwordEnterprise.getText());
                sqlStatement.setString(6, enterpriseEmail.getText());
                sqlStatement.setString(7, licenseDate.getText());
                
                sqlStatement1.setLong(1, id);
                sqlStatement1.setString(2, usernameEnterprise.getText());
                sqlStatement1.setString(3, passwordEnterprise.getText());
                if(enterpriseCategory.getSelectedItem().toString().equals("University"))
                 sqlStatement1.setString(4, "University Admin");
                else if(enterpriseCategory.getSelectedItem().toString().equals("Health Care"))
                    sqlStatement1.setString(4, "Health Care Admin");
                else if(enterpriseCategory.getSelectedItem().toString().equals("Pharmaceutical Companies"))
                    sqlStatement1.setString(4, "Pharma Admin");
                else
                    sqlStatement1.setString(4, enterpriseCategory.getSelectedItem().toString());
                
                sqlStatement1.setString(5, licenseDate.getText());
                
                if (sqlStatement.executeUpdate() > 0 && sqlStatement1.executeUpdate() > 0) {
                    System.out.println("commited");
                    dbConn.commit();
                } else {
                    System.out.println("not commited");
                }
            } else {
                System.out.println("connection not done");
            }
        } catch (Exception e) {
           logger.error(e);
        } finally {
            if (sqlStatement != null && sqlStatement1 != null ) {
                try {
                    if (!sqlStatement.isClosed()) {
                        sqlStatement.close();
                    }
                    if (!sqlStatement1.isClosed()) {
                        sqlStatement1.close();
                    }
                } catch (SQLException err) {
                    err.printStackTrace();
                     logger.error(err);
                    
                }
            }
            if (dbConn != null) {
                try {
                    if (!dbConn.isClosed()) {
                        db.closeConnection(dbConn);
                    }
                } catch (SQLException err) {
                    err.printStackTrace();
                     logger.error(err);
                   
                }
            }
        }


    }//GEN-LAST:event_saveEnterpriseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> enterpriseCategory;
    private javax.swing.JTextField enterpriseEmail;
    private javax.swing.JTextField enterpriseName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField licenseDate;
    private javax.swing.JTextField passwordEnterprise;
    private javax.swing.JButton saveEnterpriseButton;
    private javax.swing.JTextField usernameEnterprise;
    // End of variables declaration//GEN-END:variables
}
