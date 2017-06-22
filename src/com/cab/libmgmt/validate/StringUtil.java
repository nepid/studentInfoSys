/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.validate;

/**
 *
 * @author Jack Sparrow
 */
public class StringUtil {
    public static String getTrimmedInput(String userInput){
        return userInput.trim();
    }
    
    public static boolean isBlank(String userInput){
        if("".equalsIgnoreCase(userInput.trim())){
            return true;
        }else{
            return false;
        }
    }
}
