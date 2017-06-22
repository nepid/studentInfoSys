/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.ui;

import com.cab.libmgmt.controller.Controller;
import com.cab.libmgmt.dao.Credential;
import com.cab.libmgmt.dao.StudentDAO;
import com.cab.libmgmt.dto.StudentDTO;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Jack Sparrow
 */
public class studentUpdateById extends javax.swing.JPanel {

    /**
     * Creates new form studentUpdateById
     */
    private String tempUrl;

    public String getTempUrl() {
        return tempUrl;
    }

    public void setTempUrl(String tempUrl) {
        String extraTempUrl = "";
        if (tempUrl != null && !tempUrl.isEmpty()) {
            for (char c : tempUrl.toCharArray()) {
                if (c != '\\') {
                    extraTempUrl += c;
                } else {
                    extraTempUrl += "\\\\";
                }
            }

        }
        
        this.tempUrl = extraTempUrl;
    }
    public studentUpdateById() {
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

        gender = new javax.swing.ButtonGroup();
        idtxt = new javax.swing.JLabel();
        getDataBtn = new javax.swing.JButton();
        idComboBox = new javax.swing.JComboBox();
        contentPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        nameLbl = new javax.swing.JLabel();
        phoneLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        saveBttn = new javax.swing.JButton();
        picChooserBtn = new javax.swing.JButton();
        purush = new javax.swing.JRadioButton();
        stri = new javax.swing.JRadioButton();
        genderLbl = new javax.swing.JLabel();
        dobLbl = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        profilePicLbl = new javax.swing.JLabel();
        pwdTxt1 = new javax.swing.JTextField();
        pwdLbl1 = new javax.swing.JLabel();

        idtxt.setText("SID:");

        getDataBtn.setText("Get Data");
        getDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataBtnActionPerformed(evt);
            }
        });

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

        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Info"));

        nameLbl.setText("Name");

        phoneLbl.setText("Phone");

        addressLbl.setText("Address:");

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });

        addressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTxtActionPerformed(evt);
            }
        });

        saveBttn.setText("Save");
        saveBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBttnActionPerformed(evt);
            }
        });

        picChooserBtn.setText("Choose Picture");
        picChooserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picChooserBtnActionPerformed(evt);
            }
        });

        gender.add(purush);
        purush.setSelected(true);
        purush.setText("Male");

        gender.add(stri);
        stri.setText("Female");

        genderLbl.setText("Gender:");

        dobLbl.setText("Date of Birth:");

        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        profilePicLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        profilePicLbl.setText("Profile Picture");

        pwdTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdTxt1ActionPerformed(evt);
            }
        });

        pwdLbl1.setText("Password");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLbl)
                    .addComponent(phoneLbl)
                    .addComponent(addressLbl)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dobLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(genderLbl))
                    .addComponent(pwdLbl1))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveBttn)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwdTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addressTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phoneTxt))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(purush)
                                .addGap(18, 18, 18)
                                .addComponent(stri))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(picChooserBtn))
                            .addComponent(profilePicLbl)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLbl)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressLbl)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneLbl)
                            .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dobLbl)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(purush)
                            .addComponent(stri)
                            .addComponent(genderLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pwdLbl1)
                            .addComponent(pwdTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(profilePicLbl)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(picChooserBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(saveBttn)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(idtxt)
                        .addGap(31, 31, 31)
                        .addComponent(idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(getDataBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idtxt)
                    .addComponent(getDataBtn)
                    .addComponent(idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataBtnActionPerformed
        contentPanel.setVisible(true);
        contentPanel.validate();
        
        String tempId = idComboBox.getSelectedItem().toString();
        
        
        
        StudentDAO stuDao;
        stuDao = new StudentDAO();
        String[] studentRecordById = stuDao.getDataById(tempId);
        
        
        //getting the password value
        
        String [] pwd = new Credential().viewPassword(tempId);
        pwdTxt1.setText(pwd[0]);
        
        
        //reassigning values for the fields
        nameTxt.setText(studentRecordById[0]);
        addressTxt.setText(studentRecordById[1]);
        phoneTxt.setText(studentRecordById[2]);
        
        // setting date in JDateChooser
        String dateValue = studentRecordById[3];
        try {
            java.util.Date date = new SimpleDateFormat("MMM d, yyyy").parse(dateValue);
            jDateChooser1.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(studentUpdateById.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // setting gender value
        String genderValue = studentRecordById[4];
        
        
        
        // setting profile picture
        String tempUrl = studentRecordById[5];
        setTempUrl(tempUrl);
        File imageFile = new File(tempUrl);
        
            ImageIcon ii;
        try {
            ii = new ImageIcon(new ScaleImage().scaleImage(180, 135, ImageIO.read(imageFile)));
            jLabel1.setIcon(ii);
        } catch (Exception ex) {
            Logger.getLogger(studentUpdateById.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }//GEN-LAST:event_getDataBtnActionPerformed

    private void idComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idComboBoxActionPerformed

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtActionPerformed

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed

    private void addressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTxtActionPerformed

    private void saveBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBttnActionPerformed
        String sid = idComboBox.getSelectedItem().toString();
        String name = nameTxt.getText();
        String phone = phoneTxt.getText();
        String address = addressTxt.getText();

        Date date = jDateChooser1.getDate();
        String strDate = DateFormat.getDateInstance().format(date);

        String genderName = getSelectedButtonText(gender);

        StudentDTO st = new StudentDTO();
        st.setSid(sid);
        st.setName(name);
        st.setPhone(phone);
        st.setAddress(address);
        st.setDob(strDate);
        st.setGender(genderName);

        //setting URL
        st.setUrl(getTempUrl());
        
        //inserting new password
        String password = pwdTxt1.getText();
        
        
        
        Controller controller = new Controller();
        controller.controlUpdateStudent(sid, "update", st);
    }//GEN-LAST:event_saveBttnActionPerformed

    public String getSelectedButtonText(ButtonGroup gender) {
        for (Enumeration<AbstractButton> buttons = gender.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    private void picChooserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picChooserBtnActionPerformed
        uploadFileChooser = new JFileChooser();
        if (uploadFileChooser.showOpenDialog(this) == 0) {
            try {
                File selectedFile = uploadFileChooser.getSelectedFile();
                ImageIcon ii = new ImageIcon(new ScaleImage().scaleImage(180, 135, ImageIO.read(selectedFile)));
                setTempUrl(selectedFile.getAbsolutePath());
                jLabel1.setIcon(ii);
            } catch (IOException ex) {
                Logger.getLogger(studentUpdateById.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(studentUpdateById.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_picChooserBtnActionPerformed

    private void pwdTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdTxt1ActionPerformed


    private javax.swing.JFileChooser uploadFileChooser;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLbl;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel dobLbl;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JButton getDataBtn;
    private javax.swing.JComboBox idComboBox;
    private javax.swing.JLabel idtxt;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton picChooserBtn;
    private javax.swing.JLabel profilePicLbl;
    private javax.swing.JRadioButton purush;
    private javax.swing.JLabel pwdLbl1;
    private javax.swing.JTextField pwdTxt1;
    private javax.swing.JButton saveBttn;
    private javax.swing.JRadioButton stri;
    // End of variables declaration//GEN-END:variables
}
