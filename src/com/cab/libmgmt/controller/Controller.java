
package com.cab.libmgmt.controller;

import com.cab.libmgmt.dao.StudentDAO;
import com.cab.libmgmt.dto.StudentDTO;
import javax.swing.JOptionPane;

public class Controller {
    
    public void controlStudents(String operation, StudentDTO student){
        
        // is it necessary to create an object of StudentDAO here it can be created on the insert method below
        
        StudentDAO stDao = new StudentDAO();                    
        
        if(operation.equalsIgnoreCase("insert")){
            insert(stDao, student);
        }
        if(operation.equalsIgnoreCase("delete")){
            //delete operation
        }
        
    }
    
    public void controlDeleteStudent(String operation, String field){
        if(operation.equalsIgnoreCase("delete")){
            delete(field);
        }
    }
    
    
    public void controlUpdateStudent(String id, String operation, StudentDTO student){
        if(operation.equalsIgnoreCase("update")){
            updateStudent(id,student);
        }
    }
    
    private void insert(StudentDAO stDao, StudentDTO student){
        
        //StudentDAO can be created for less memory uses
        
        if(stDao.insert(student)){
            JOptionPane.showMessageDialog(null, "Succesfully Inserted...");
        }
        
    }
    
    private void delete(String id){
        StudentDAO stDao = new StudentDAO();
        if(stDao.delete(id)){
            JOptionPane.showMessageDialog(null, "Succesfully Deleted...");
        }
    }
    
    
    private void updateStudent(String id,StudentDTO student){
        StudentDAO stDao = new StudentDAO();
        if(stDao.update(id,student)){
            JOptionPane.showMessageDialog(null,"Sucessfully Updated...");
        }
    
}
    
}