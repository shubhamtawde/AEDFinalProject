/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Model.system.DatabaseConnection;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author siddharthvaghela
 */
public class CreateExperiment extends javax.swing.JPanel {

    /**
     * Creates new form CreateExperiment
     */
    Connection dbConn = null;
    public Long id;
    PreparedStatement sqlStatement = null;
     PreparedStatement sqlStatement1 = null;
     Logger logger = LogManager.getLogger(CreateExperiment.class);
    public String photoLocation; 
    public CreateExperiment() {
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
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ExperimentName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pstatement = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Objective = new javax.swing.JTextPane();
        Hypothesis = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        hypo = new javax.swing.JTextPane();
        Hypothesis1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        observation = new javax.swing.JTextPane();
        Hypothesis2 = new javax.swing.JLabel();
        uploadImage = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        scientistname = new javax.swing.JTextField();

        jLabel1.setText("Create Experiment");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("Experiment Name:");

        jLabel3.setText("Objective:");

        jScrollPane1.setViewportView(pstatement);

        jLabel4.setText("Problem Statement:");

        jScrollPane2.setViewportView(Objective);

        Hypothesis.setText("Hypothesis:");

        jScrollPane3.setViewportView(hypo);

        Hypothesis1.setText("Observation:");

        jScrollPane4.setViewportView(observation);

        Hypothesis2.setText("Results:");

        uploadImage.setText("Upload");
        uploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadImageActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Scientist Name:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Hypothesis2)
                            .addComponent(Hypothesis1)
                            .addComponent(Hypothesis)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(uploadImage)
                            .addComponent(ExperimentName, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addComponent(scientistname, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(saveButton)))
                .addContainerGap(337, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ExperimentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(scientistname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hypothesis))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Hypothesis1)
                        .addGap(94, 94, 94)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Hypothesis2)
                            .addComponent(uploadImage)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(59, 59, 59))
        );

        jScrollPane5.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void uploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadImageActionPerformed

        //upload photo from file picker
        JFileChooser photoUpload = new JFileChooser();
        photoUpload.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter pngFilter = new FileNameExtensionFilter("PNG File", "png");
        FileNameExtensionFilter jpegFilter = new FileNameExtensionFilter("JPEG file",  "jpg", "jpeg");
        photoUpload.addChoosableFileFilter(pngFilter);
        photoUpload.addChoosableFileFilter(jpegFilter);
        int file = photoUpload.showDialog(this, "Select Photo"  );
        if(file == JFileChooser.APPROVE_OPTION) {
            File photo = photoUpload.getSelectedFile();
            uploadImage.setText(photo.getName());
            photoLocation = photo.getPath();
        }
        else {
            JOptionPane.showMessageDialog(this, "Operation Cancelled!");
        }
    }//GEN-LAST:event_uploadImageActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
          if(ExperimentName.getText().isEmpty() || observation.getText().isEmpty() || uploadImage.getText().equals("Upload")
                || pstatement.getText().isEmpty() || hypo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please fill Atleast all Attributes");
              return;
        }
        
         DatabaseConnection db = new DatabaseConnection();

        try {
            dbConn = db.getConnection();
            if (dbConn != null) {
                dbConn.setAutoCommit(false);
                sqlStatement = dbConn.prepareStatement("INSERT INTO Experiments" + " VALUES " + " (?,?,?,?,?,?,?,?,?); ");
               
                Long expid = (long) (Math.random() * (9999 - 1) + 1);
                sqlStatement.setLong(1, expid);
                sqlStatement.setLong(2, id);
                sqlStatement.setString(3, ExperimentName.getText());
                sqlStatement.setString(4, Objective.getText());
                sqlStatement.setString(5, pstatement.getText());
                sqlStatement.setString(6, hypo.getText());
                sqlStatement.setString(7, observation.getText());
                sqlStatement.setString(8, photoLocation);
                sqlStatement.setInt(9, 0);
                
                
                if (sqlStatement.executeUpdate() > 0 ) {
                    System.out.println("commited");
                    dbConn.commit();
                } else {
                    System.out.println("not commited");
                }
            } else {
                System.out.println("connection not done");
            }
        } catch (Exception e) {
            System.out.println(e);
            logger.error(e);
        } finally {
            if (sqlStatement != null ) {
                try {
                    if (!sqlStatement.isClosed()) {
                        sqlStatement.close();
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


  
          
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ExperimentName;
    private javax.swing.JLabel Hypothesis;
    private javax.swing.JLabel Hypothesis1;
    private javax.swing.JLabel Hypothesis2;
    private javax.swing.JTextPane Objective;
    private javax.swing.JTextPane hypo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextPane observation;
    private javax.swing.JTextPane pstatement;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField scientistname;
    private javax.swing.JButton uploadImage;
    // End of variables declaration//GEN-END:variables
}
