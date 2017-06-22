package com.cab.libmgmt.dao;

import com.cab.libmgmt.db.DBConnection;
import com.cab.libmgmt.dto.StudentDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentDAO {

    public boolean insert(StudentDTO student) {
        boolean isInserted = false;
        try {
            Statement stmt = DBConnection.conn.createStatement();
            String query = "insert into student_info (sid,name,address,phone_no,dob,gender,url)"
                    + " values ('" + student.getSid()
                    + "','" + student.getName()
                    + "','" + student.getAddress()
                    + "','" + student.getPhone()
                    + "','" + student.getDob()
                    + "','" + student.getGender()
                    + "','" + student.getUrl()
                    + "')";

            isInserted = stmt.executeUpdate(query) > 0;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isInserted;
    }

    

    public String[] selectUniqueIds() {

        List<String> ll = new ArrayList<>();

        try {
            String query = "select distinct sid from student_info";
            Statement stmt = DBConnection.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String tempid = rs.getString("sid");
                ll.add(tempid);

            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ll.toArray(new String[ll.size()]);
    }

    //This method is used to get the data from the database using SELECT stament with more than one column.
    

    /**
     *
     * @param id
     * @return
     */
    public String[] getDataById(String id) {
        String tempId = null, tempname = null, tempAddress = null, tempPhone = null, tempUrl = null;
        String tempDob = null,tempGender= null;
        List<String> recordList = new ArrayList<>();

        try {
            String query;
            
            query = "SELECT sid,name,address,phone_no,dob,gender,url FROM student_info WHERE sid='"+id+"'";
            Statement stmt = DBConnection.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                tempId = rs.getString(1);
                tempname = rs.getString(2);
                tempAddress = rs.getString(3);
                tempPhone = rs.getString(4);
                tempDob = rs.getString(5);
                tempGender = rs.getString(6);
                tempUrl = rs.getString(7);
                
                recordList.add(tempname);
                recordList.add(tempAddress);
                recordList.add(tempPhone);
                recordList.add(tempDob);
                recordList.add(tempGender);
                recordList.add(tempUrl);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return recordList.toArray(new String[recordList.size()]);

    }

    public boolean delete(String id) {
        boolean isDeleted = false;
        try {

            Statement stmt = DBConnection.conn.createStatement();
            String query = "delete from student_info where sid ='"+id+"'";
            isDeleted = stmt.executeUpdate(query) > 0;

        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isDeleted;
    }
    
    
    
    public boolean update(String id,StudentDTO student){
        boolean isUpdated = false;
        boolean isDeleted = false;
        try {
            Statement stmt = DBConnection.conn.createStatement();
            if(delete(id)){
                
            }
            
            
            String query = "insert into student_info (sid,name,address,phone_no,dob,gender,url)"
                    + " values ('" + student.getSid()
                    + "','" + student.getName()
                    + "','" + student.getAddress()
                    + "','" + student.getPhone()
                    + "','" + student.getDob()
                    + "','" + student.getGender()
                    + "','" + student.getUrl()
                    + "')";
            
            
            isUpdated = stmt.executeUpdate(query) > 0;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isUpdated;
        
    }

}
