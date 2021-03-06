/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cab.libmgmt.ui;

import com.cab.libmgmt.dao.LoginDao;
import com.cab.libmgmt.validate.StringUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author Jack Sparrow
 */
public class LoginDialog extends javax.swing.JDialog {

    /**
     * Creates new form LoginDialog
     */
    public LoginDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        usernameLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        cancelBttn = new javax.swing.JButton();
        loginBttn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        usernameLbl.setText("Username");

        passwordLbl.setText("Password");

        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });

        cancelBttn.setText("Cancel");
        cancelBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBttnActionPerformed(evt);
            }
        });

        loginBttn.setText("Login");
        loginBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBttnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("*");

        jLabel2.setForeground(new java.awt.Color(255, 0, 102));
        jLabel2.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLbl)
                    .addComponent(passwordLbl)
                    .addComponent(cancelBttn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginBttn)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(passwordTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLbl)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLbl)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBttn)
                    .addComponent(loginBttn))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {passwordTxt, usernameTxt});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBttnActionPerformed

        login();

    }//GEN-LAST:event_loginBttnActionPerformed

    private void cancelBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBttnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBttnActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
           login();
// TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void login(){
        if(!StringUtil.isBlank(usernameTxt.getText())){
            
       
        
        LoginDao login = new LoginDao();
        String username = usernameTxt.getText();
        
        if (login.checkUser(username, new String(passwordTxt.getPassword()))) {
            
            String userType = new LoginDao().userType(username);
            
            //for admin LogIn
            if(userType.equalsIgnoreCase("admin")){
                this.dispose();
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    StudentRecord sr = new StudentRecord();
                    sr.setLocationRelativeTo(null);
                    sr.setVisible(true);
                    
                    
                    
                }
            });
            }
            
            //for CRUD operation LogIn
            if(userType.equalsIgnoreCase("CRUD Operation User")){
                this.dispose();
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                        CRUDAuthenticateUsers cau = new CRUDAuthenticateUsers();
                       cau.setLocationRelativeTo(null);
                       cau.setVisible(true);
                    
                }
            });
            }
            
            //for view operation LogIn
            if(userType.equalsIgnoreCase("view only")){
                this.dispose();
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                        ViewAuthenticateUsers vau = new ViewAuthenticateUsers();
                        vau.setLocationRelativeTo(null);
                        vau.setVisible(true);
                    
                }
            });
            }
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Oops you are penetrating.....");
        }
        }else{
            JOptionPane.showMessageDialog(null, "That's ridiculous, at least username is mandatory");
        }
    }
    

    
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginBttn;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
