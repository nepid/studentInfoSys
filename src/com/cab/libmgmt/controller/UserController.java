/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.controller;

import com.cab.libmgmt.dao.UserDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Jack Sparrow
 */
public class UserController {
    public void controlusers(String username,String password, String type,String operation){
        
        if(operation.equalsIgnoreCase("insert")){
            insert(username,password,type);
        }
    }
    
    
    public void delteusers(String username,String operation){
        if(operation.equalsIgnoreCase("delete")){
            delete(username);
        }
    }
    
    private void insert(String username,String password, String type){
        
        //StudentDAO can be created for less memory uses
        UserDAO udao = new UserDAO();
        if(udao.insert(username, password, type)){
            JOptionPane.showMessageDialog(null, "Succesfully Inserted...");
        }
        
    }
    
    private void delete(String username){
        UserDAO udao = new UserDAO();
        if(udao.delete(username)){
            JOptionPane.showMessageDialog(null, "Succesfully Deleted...");
        }
    }
}
