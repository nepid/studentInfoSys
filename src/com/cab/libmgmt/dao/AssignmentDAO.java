/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.dao;

import com.cab.libmgmt.db.DBConnection;
import com.cab.libmgmt.dto.AssignmentDTO;
import com.cab.libmgmt.dto.TestScoreDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jack Sparrow
 */
public class AssignmentDAO {
    public boolean insert(AssignmentDTO tsDTO){
        
        boolean isInserted = false;
        
        try {
            Statement stmt = DBConnection.conn.createStatement();
            String query = "insert into assignment (sid,semester,assignment_no,subjects,marks)"
                    + " values ('" + tsDTO.getSid()
                    + "'," + tsDTO.getSemester()
                    + "," + tsDTO.getTest()
                    + ",'" + tsDTO.getSubject()
                    + "'," + tsDTO.getMark()
                    + ")";

            isInserted = stmt.executeUpdate(query) > 0;
          } catch (SQLException ex) {
            Logger.getLogger(AssignmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isInserted;
    }
    
    /**
     *
     * @param query
     * @return
     */
    public ResultSet loadDbData(String query) {
        
        ResultSet rs = null;
        try {
            Statement stmt = DBConnection.conn.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(AssignmentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
