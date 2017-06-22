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
public class UserDAO {
    public boolean insert(String username,String password,String type) {
        boolean isInserted = false;
        try {
            Statement stmt = DBConnection.conn.createStatement();
            String query = "insert into user_credential (username,password,type)"
                    + " values ('" + username
                    + "','" + password
                    + "','" + type
                    + "')";

            isInserted = stmt.executeUpdate(query) > 0;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isInserted;
    }
    
    public boolean delete(String username) {
        boolean isDeleted = false;
        try {

            Statement stmt = DBConnection.conn.createStatement();
            String query = "delete from user_credential where username ='"+username+"'";
            isDeleted = stmt.executeUpdate(query) > 0;

        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isDeleted;
    }
    
    
    public ResultSet loadDbData() {
        ResultSet rs = null;
        try {
            
            
            Statement stmt = new DBConnection().conn.createStatement();
            rs = stmt.executeQuery("select * from user_credential");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    
}
