/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.controller;

import com.cab.libmgmt.dao.AssignmentDAO;
import com.cab.libmgmt.dto.AssignmentDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Jack Sparrow
 */
public class AssignmentController {
    public void controlTestScore(String operation,AssignmentDTO tsDTO){
        if(operation.equalsIgnoreCase("insert")){
            insert(tsDTO);
        }
    }
    
    private void insert(AssignmentDTO tsDTO){
        AssignmentDAO tsDAO = new AssignmentDAO();
        
        if(tsDAO.insert(tsDTO)){
        JOptionPane.showMessageDialog(null, "Succesfully Inserted...");    
        }
        
    }
}
