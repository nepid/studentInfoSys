/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.controller;

import com.cab.libmgmt.dao.PresentationDAO;
import com.cab.libmgmt.dto.PresentationDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Jack Sparrow
 */
public class PresentationController {
    public void controlTestScore(String operation,PresentationDTO atDTO){
        if(operation.equalsIgnoreCase("insert")){
            insert(atDTO);
        }
    }
    
    private void insert(PresentationDTO atDTO){
        PresentationDAO ts = new PresentationDAO();
        if(ts.insert(atDTO)){
        JOptionPane.showMessageDialog(null, "Succesfully Inserted...");    
        }
        
    }
}
