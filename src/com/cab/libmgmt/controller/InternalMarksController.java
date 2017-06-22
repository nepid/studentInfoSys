/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.controller;

import com.cab.libmgmt.dao.InternalMarksDAO;
import com.cab.libmgmt.dao.TestScoreDAO;
import com.cab.libmgmt.dto.InternalMarksDTO;
import com.cab.libmgmt.dto.TestScoreDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Jack Sparrow
 */
public class InternalMarksController {
    public void controlTestScore(String operation,InternalMarksDTO tsDTO){
        if(operation.equalsIgnoreCase("insert")){
            insert(tsDTO);
        }
    }
    
    private void insert(InternalMarksDTO tsDTO){
        InternalMarksDAO tsDAO = new InternalMarksDAO();
        
        if(tsDAO.insert(tsDTO)){
        JOptionPane.showMessageDialog(null, "Succesfully Inserted...");    
        }
        
    }
}
