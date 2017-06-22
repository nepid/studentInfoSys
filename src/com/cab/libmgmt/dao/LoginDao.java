
package com.cab.libmgmt.dao;

import com.cab.libmgmt.db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jack Sparrow
 */
public class LoginDao {
    public boolean checkUser(String username, String password){
        boolean isValidUser = false;
        
        //writing this 3 line codes to skip the authentication process with the database, because database is not created yet.
        if(username.equals("admin")){
            isValidUser = true;
            return isValidUser;
        }
        
        
        
        
//            String query = "select username,password from users where username=? and "                       
//                    + "password = ?";
//                                                             //statement by me String query = "select username,password from users where username=? and password = ?";
//            PreparedStatement stmt = DBConnection.conn.prepareStatement(query);
//            
//            stmt.setString(1, username);
//            stmt.setString(2, password);

            try {
            Statement stmt = DBConnection.conn.createStatement();
            String query = "select username,password from user_credential where username='"+username+"' and password='"+password+"'";
                     
            
            
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                isValidUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isValidUser;
    }
    
    public String userType(String username)
    {
        String usertype = null;
        
        //writing this 3 line codes to skip the authentication process with the database, because database is not created yet.
        if(username.equals("admin")){
            usertype = "admin";
            return usertype;
        }
        
        
        try {
            
            Statement stmt = DBConnection.conn.createStatement();
            String query = "select type from user_credential where username='"+username+"'";
            
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                usertype = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usertype;
    }
}
