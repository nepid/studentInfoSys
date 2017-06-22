/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.dao;

import com.cab.libmgmt.db.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jack Sparrow
 */
public class Credential {
    public void inputCredential(String username, String password){
        
        try {
            Statement stmt = DBConnection.conn.createStatement();
            String query = "insert into studentcredential (sid,pw)"
                    + " values ('" + username+ "','" + password+ "')";
            
            if (stmt.executeUpdate(query) > 0) {
                System.out.println("Successfully Inserted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Credential.class.getName()).log(Level.SEVERE, null, ex);
        }

            
        
    }
    
    public void updateCredential (String username, String password){
        try {
            Statement stmt = DBConnection.conn.createStatement();
            String query = "delete from studentcredential where sid='"+username+"'";
        } catch (SQLException ex) {
            Logger.getLogger(Credential.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        inputCredential(username,password);
    }
    
    public void deleteCredential (String username){
        try {
            Statement stmt = DBConnection.conn.createStatement();
            String query = "delete from studentcredential where sid='"+username+"'";
        } catch (SQLException ex) {
            Logger.getLogger(Credential.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String [] viewPassword (String username){
        String query,pw;
            List<String> recordList = new ArrayList<>();
        try {
            query = "SELECT pw FROM studentcredential WHERE sid='"+username+"'";
            Statement stmt = DBConnection.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                pw = rs.getString(1);
                
                recordList.add(pw);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Credential.class.getName()).log(Level.SEVERE, null, ex);
        }
        return recordList.toArray(new String[recordList.size()]);
    }
            
}
