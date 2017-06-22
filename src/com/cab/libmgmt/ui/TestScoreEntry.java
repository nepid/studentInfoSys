/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.ui;

import com.cab.libmgmt.controller.TestScoreController;
import com.cab.libmgmt.dao.GetSubjectList;
import com.cab.libmgmt.dao.StudentDAO;
import com.cab.libmgmt.dto.TestScoreDTO;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Jack Sparrow
 */
public class TestScoreEntry extends javax.swing.JPanel {

    /**
     * Creates new form TestScoreEntry
     */
    public TestScoreEntry() {
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
        testLbl = new javax.swing.JLabel();
        testNoComboBox = new javax.swing.JComboBox();
        subjectLbl = new javax.swing.JLabel();
        subjectComboBox = new javax.swing.JComboBox();
        marksLbl = new javax.swing.JLabel();
        marksComboBox = new javax.swing.JComboBox();
        insertRecordBtn = new javax.swing.JButton();

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

        testLbl.setText("Test No. :");

        testNoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        subjectLbl.setText("Subject:");

        subjectComboBox.setModel(new javax.swing.DefaultComboBoxModel(subjectsGiver()));
        subjectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectComboBoxActionPerformed(evt);
            }
        });

        marksLbl.setText("Marks :");

        marksComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        insertRecordBtn.setText("Insert Record");
        insertRecordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertRecordBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marksLbl)
                            .addComponent(testLbl)
                            .addComponent(sidLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marksComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testNoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subjectLbl)
                            .addComponent(semesterLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(semesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(insertRecordBtn))
                .addContainerGap(189, Short.MAX_VALUE))
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
                    .addComponent(subjectLbl)
                    .addComponent(subjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testLbl)
                    .addComponent(testNoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marksLbl)
                    .addComponent(marksComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(insertRecordBtn)
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idComboBoxActionPerformed

    private void subjectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectComboBoxActionPerformed

    private void semesterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semesterComboBoxActionPerformed
        subjectComboBox.setEnabled(true);
    }//GEN-LAST:event_semesterComboBoxActionPerformed

    private void insertRecordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertRecordBtnActionPerformed
        
        // TODO add your handling code here:
        String tempSid,subject;
        
        tempSid = idComboBox.getSelectedItem().toString();
        subject = subjectComboBox.getSelectedItem().toString();
         
        int mark = Integer.parseInt(marksComboBox.getSelectedItem().toString());
        int test_no = Integer.parseInt(testNoComboBox.getSelectedItem().toString());
        int sem = Integer.parseInt(semesterComboBox.getSelectedItem().toString());
      
        //transfering data to Data Transfer Object
        
        TestScoreDTO tsDTO = new TestScoreDTO();
        tsDTO.setSid(tempSid);
        tsDTO.setSubject(subject);
        tsDTO.setMark(mark);
        tsDTO.setSemester(sem);
        tsDTO.setTest(test_no);
        
        
        TestScoreController ts = new TestScoreController();
        ts.controlTestScore("insert", tsDTO);
    }//GEN-LAST:event_insertRecordBtnActionPerformed

    private void semesterComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_semesterComboBoxItemStateChanged
        subjectComboBox.setModel(new DefaultComboBoxModel(subjectsGiver()));
    }//GEN-LAST:event_semesterComboBoxItemStateChanged


    public String[] subjectsGiver(){
        String tempSem = semesterComboBox.getSelectedItem().toString();
        String tempFaculty = idComboBox.getSelectedItem().toString().substring(0, 3);
        
        String subjectList[] = new GetSubjectList().subjectList(tempFaculty, tempSem);
        return subjectList;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox idComboBox;
    private javax.swing.JButton insertRecordBtn;
    private javax.swing.JComboBox marksComboBox;
    private javax.swing.JLabel marksLbl;
    private javax.swing.JComboBox semesterComboBox;
    private javax.swing.JLabel semesterLbl;
    private javax.swing.JLabel sidLbl;
    private javax.swing.JComboBox subjectComboBox;
    private javax.swing.JLabel subjectLbl;
    private javax.swing.JLabel testLbl;
    private javax.swing.JComboBox testNoComboBox;
    // End of variables declaration//GEN-END:variables
}
