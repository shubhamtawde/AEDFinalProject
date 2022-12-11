/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Laboratories;

import Model.System.DatabaseConnection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.regex.Pattern;
/**
 *
 * @author vidhisejpal
 */
public class CreateTester extends javax.swing.JPanel {

    /**
     * Creates new form CreateTester
     */
    Connection dbConn = null;
    PreparedStatement sqlStatement = null;
    PreparedStatement sqlStatement1 = null;
    public CreateTester() {
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

        jLabel2 = new javax.swing.JLabel();
        emailId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel2.setText("Email : ");

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel3.setText("Username : ");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel4.setText("Password : ");

        title.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        title.setText("Create Tester");

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        jLabel1.setText("Name : ");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(title)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(saveButton)))
                .addContainerGap(264, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {emailId, name, password, userName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(title)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(emailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(saveButton)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {emailId, name, password, userName});

    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        
        if(name.getText().isEmpty() || emailId.getText().isEmpty() || password.getText().isEmpty()
                || userName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please fill all the attributes", "Error", JOptionPane.ERROR_MESSAGE);
              return;
        }
        
        else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", emailId.getText()))){
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            return ;
        }
        
        
        
        
                DatabaseConnection db = new DatabaseConnection();

        try {
            dbConn = db.getConnection();
            if (dbConn != null) {
                dbConn.setAutoCommit(false);
                sqlStatement = dbConn.prepareStatement("INSERT INTO Tester" + " VALUES " + " (?,?,?,?,?,?,?); ");
                sqlStatement1 = dbConn.prepareStatement("INSERT INTO Credentials" + " VALUES " + " (?,?,?,?,?);");
                Long id = (long) (Math.random() * (9999 - 1) + 1);
                sqlStatement.setLong(1, id);
                sqlStatement.setLong(2, id);
                sqlStatement.setString(3, name.getText());
                sqlStatement.setString(4, emailId.getText());
                sqlStatement.setString(5, userName.getText());
                sqlStatement.setString(6, String.valueOf(password.getPassword()));
                sqlStatement.setString(7, "license date"); // license date dummy value
                
                
                sqlStatement1.setLong(1, id);
                sqlStatement1.setString(2, userName.getText());
                sqlStatement1.setString(3, String.valueOf(password.getPassword()));
            
                sqlStatement1.setString(4, "Tester");
                sqlStatement1.setString(5, "License Date"); // license date dummy value
                
                if (sqlStatement.executeUpdate() > 0 && sqlStatement1.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(this,"New Tester Added Successfully");
                    System.out.println("commited");
                    dbConn.commit();
                    name.setText("");
                    emailId.setText("");
                    userName.setText("");
                    password.setText("");
                } else {
                    System.out.println("not commited");
                }
            } else {
                System.out.println("connection not done");
            }
        } catch (Exception e) {
            System.out.println(e);
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
    }//GEN-LAST:event_saveButtonActionPerformed

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
