/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.ui;

import com.cab.libmgmt.controller.AttendanceController;
import com.cab.libmgmt.dao.StudentDAO;
import com.cab.libmgmt.dto.AttendanceDTO;

/**
 *
 * @author Jack Sparrow
 */
public class AttendanceEntry extends javax.swing.JPanel {

    /**
     * Creates new form TestScoreEntry
     */
    public AttendanceEntry() {
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

        idComboBox = new javax.swing.JComboBox();
        sidLbl = new javax.swing.JLabel();
        semesterComboBox = new javax.swing.JComboBox();
        semesterLbl = new javax.swing.JLabel();
        monthLbl = new javax.swing.JLabel();
        montthCombo = new javax.swing.JComboBox();
        percentLbl = new javax.swing.JLabel();
        insertRecordBtn = new javax.swing.JButton();
        percentageComboBox1 = new javax.swing.JComboBox();

        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Insert Test Score"));

        idComboBox.setModel(new javax.swing.DefaultComboBoxModel(new StudentDAO().selectUniqueIds()));
        idComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idComboBoxActionPerformed(evt);
            }
        });
        idComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idComboBoxActionPerformed(evt);
            }
        });

        sidLbl.setText("SID :");

        semesterComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        semesterComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                semesterComboBoxItemStateChanged(evt);
            }
        });
        semesterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semesterComboBoxActionPerformed(evt);
            }
        });

        semesterLbl.setText("Semester:");

        monthLbl.setText("Month:");

        montthCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        percentLbl.setText("Percentage:");

        insertRecordBtn.setText("Insert Record");
        insertRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertRecordBtnActionPerformed(evt);
            }
        });

        percentageComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monthLbl)
                            .addComponent(sidLbl))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(montthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(percentLbl)
                            .addComponent(semesterLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(percentageComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(insertRecordBtn))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sidLbl)
                    .addComponent(idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semesterLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percentLbl)
                    .addComponent(monthLbl)
                    .addComponent(montthCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentageComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(insertRecordBtn)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idComboBoxActionPerformed

    private void semesterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterComboBoxActionPerformed
        
    }//GEN-LAST:event_semesterComboBoxActionPerformed

    private void insertRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertRecordBtnActionPerformed
        
        // TODO add your handling code here:
        String tempSid;
        
        tempSid = idComboBox.getSelectedItem().toString();
        
         
       
        int month = Integer.parseInt(montthCombo.getSelectedItem().toString());
        int sem = Integer.parseInt(semesterComboBox.getSelectedItem().toString());
        
        
        int percentage = Integer.parseInt(percentageComboBox1.getSelectedObjects().toString());
        
        


        //transfering data to Data Transfer Object
        AttendanceDTO tsDTO = new AttendanceDTO();
        
        //TestScoreDTO tsDTO = new TestScoreDTO();
        tsDTO.setMonth(month);
        tsDTO.setPercentage(percentage);
        tsDTO.setSemester(sem);
        tsDTO.setSid(tempSid);
        
        
        AttendanceController ts = new AttendanceController();
        ts.controlTestScore("insert", tsDTO);
    }//GEN-LAST:event_insertRecordBtnActionPerformed

    private void semesterComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_semesterComboBoxItemStateChanged
       
    }//GEN-LAST:event_semesterComboBoxItemStateChanged


    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox idComboBox;
    private javax.swing.JButton insertRecordBtn;
    private javax.swing.JLabel monthLbl;
    private javax.swing.JComboBox montthCombo;
    private javax.swing.JLabel percentLbl;
    private javax.swing.JComboBox percentageComboBox1;
    private javax.swing.JComboBox semesterComboBox;
    private javax.swing.JLabel semesterLbl;
    private javax.swing.JLabel sidLbl;
    // End of variables declaration//GEN-END:variables
}
