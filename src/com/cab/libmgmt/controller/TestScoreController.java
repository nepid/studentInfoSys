/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.controller;

import com.cab.libmgmt.dao.TestScoreDAO;
import com.cab.libmgmt.dto.TestScoreDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Jack Sparrow
 */
public class TestScoreController {
    public void controlTestScore(String operation,TestScoreDTO tsDTO){
        if(operation.equalsIgnoreCase("insert")){
            insert(tsDTO);
        }
    }
    
    private void insert(TestScoreDTO tsDTO){
        TestScoreDAO tsDAO = new TestScoreDAO();
        
        if(tsDAO.insert(tsDTO)){
        JOptionPane.showMessageDialog(null, "Succesfully Inserted...");    
        }
        
    }
}
