/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.controller;

import com.cab.libmgmt.dao.AttendanceDAO;
import com.cab.libmgmt.dto.AttendanceDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Jack Sparrow
 */
public class AttendanceController {
    public void controlTestScore(String operation,AttendanceDTO atDTO){
        if(operation.equalsIgnoreCase("insert")){
            insert(atDTO);
        }
    }
    
    private void insert(AttendanceDTO atDTO){
        AttendanceDAO ts = new AttendanceDAO();
        if(ts.insert(atDTO)){
        JOptionPane.showMessageDialog(null, "Succesfully Inserted...");    
        }
        
    }
}
