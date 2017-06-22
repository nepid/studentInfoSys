/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.dao;

import com.cab.libmgmt.db.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jack Sparrow
 */
public class ImageOperation {
    public boolean insertImageUrl(String sid, String url) {
        boolean isInserted = false;
        try {
            
            
            String query = "insert into student_info(sid,url) values(?,?)";
            PreparedStatement stmt = new DBConnection().conn
                    .prepareStatement(query);
            stmt.setString(1, sid);
            stmt.setString(2, url);
            isInserted = stmt.executeUpdate() > 0;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ImageOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isInserted;
    }

    public String getImageURL(String sid) {
        ResultSet rs = null;
        String imageUrl = "";
        try {
            String query = "select url from student_info where sid=?";
            PreparedStatement stmt = new DBConnection().conn
                    .prepareStatement(query);
            stmt.setString(1, sid);
            rs = stmt.executeQuery();
            if (rs.next()) {
                imageUrl = rs.getString(1);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ImageOperation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return imageUrl;
    }
    
}
