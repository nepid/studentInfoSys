/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.dao;

/**
 *
 * @author Jack Sparrow
 */
public class GetSubjectList {
    
    public String[] subjectList(String faculty,String semester){
        
        String[] tempSubjectList1 = null;
        int sem = Integer.valueOf(semester);
        if(faculty.equals("BIM")){
            switch(sem)
            {
                case 1:
                    String[] tempSubjectList2 = {"Computer Information System","Digital Logic",
                                                    "Basic Math","Principle Of Management","English Composition"};
                    tempSubjectList1 = tempSubjectList2;
                    break;
                case 2:
                    String[] tempSubjectList3 = {"Structured Programming in C","Data Communication and Computer Network","Business Communication",
                                                    "Sociology","Discrete Mathematics"};
                    tempSubjectList1 = tempSubjectList3;
                    break;
                case 3:
                    String [] tempSubjectList4 = {"Statistics","Psychology","Data Structure and Algorithm","Object Oriented Programming","Microprocessor Programming"};
                    tempSubjectList1 = tempSubjectList4;
                    break;
                case 4:
                    String [] tsl5 = {"Financial Accounting","Micro Economics","Database Management System","Web Technology","Computer Organization"};
                    tempSubjectList1 = tsl5;
                    break;
                case 5:
                    String[] tsl6 = {"Cost and Management Accounting","Macro Economies","Computer Graphics","JAVA Programming","Artificial Intelligence"};
                    tempSubjectList1 = tsl6;
                    break;
                case 6:
                    String [] tsl7 = {"Business Finance","Operation Management","Principle of Marketing","Client Server Computing","Software Engineering"};
                    tempSubjectList1 = tsl7;
                    break;
                case 7:
                    String [] tsl8 = {"Critical Thinking and Decision Making","Organization Relations","Human Resource Management",
                        "Management Information System","IT Entrepreneurship & Supply Chain Management","High Speed Network & Multimedia Networking"};
                    
                    tempSubjectList1 = tsl8;
                    break;
                case 8:
                       String [] tsl9 = {"Computer Security and Cyber Law","Economics of Information and Communication",
                           "Object Oriented Analysis and Design","System Administration: WiN Nt","Software Project Management"};
                           tempSubjectList1 = tsl9;
                default:
                    System.out.println("hey Ho");
            }
                        
        }
        if(faculty.equals("BBA")){
        
            switch(sem)
            {
                case 1:
                    String[] tempSubjectList2 = {"Computer Information System","Digital Logic",
                                                    "Basic Math","Principle Of Management","English Composition"};
                    tempSubjectList1 = tempSubjectList2;
                    break;
                case 2:
                    String[] tempSubjectList3 = {"Structured Programming in C","Data Communication and Computer Network","Business Communication",
                                                    "Sociology","Discrete Mathematics"};
                    tempSubjectList1 = tempSubjectList3;
                    break;
                case 3:
                    String [] tempSubjectList4 = {"Statistics","Psychology","Data Structure and Algorithm","Object Oriented Programming","Microprocessor Programming"};
                    tempSubjectList1 = tempSubjectList4;
                    break;
                case 4:
                    String [] tsl5 = {"Financial Accounting","Micro Economics","Database Management System","Web Technology","Computer Organization"};
                    tempSubjectList1 = tsl5;
                    break;
                case 5:
                    String[] tsl6 = {"Cost and Management Accounting","Macro Economies","Computer Graphics","JAVA Programming","Artificial Intelligence"};
                    tempSubjectList1 = tsl6;
                    break;
                case 6:
                    String [] tsl7 = {"Business Finance","Operation Management","Principle of Marketing","Client Server Computing","Software Engineering"};
                    tempSubjectList1 = tsl7;
                    break;
                case 7:
                    String [] tsl8 = {"Critical Thinking and Decision Making","Organization Relations","Human Resource Management",
                        "Management Information System","IT Entrepreneurship & Supply Chain Management","High Speed Network & Multimedia Networking"};
                    
                    tempSubjectList1 = tsl8;
                    break;
                case 8:
                       String [] tsl9 = {"Computer Security and Cyber Law","Economics of Information and Communication",
                           "Object Oriented Analysis and Design","System Administration: WiN Nt","Software Project Management"};
                           tempSubjectList1 = tsl9;
                default:
                    System.out.println("hey Ho");
            }
    }
        if(faculty.equals("BSCCSIT")){
            switch(sem)
            {
                case 1:
                    String[] tempSubjectList2 = {"English-I","Principles of Management","Micro Economics ","Basic Mathematics",""};
                    tempSubjectList1 = tempSubjectList2;
                    break;
                case 2:
                    String[] tempSubjectList3 = {"English-II ","Human Resource Management","Macro Economics ","Statistics","Computer Programming-I  "};
                    tempSubjectList1 = tempSubjectList3;
                    break;
                case 3:
                    String [] tempSubjectList4 = {"English-II ","Human Resource Management","Macro Economics ","Statistics","Computer Programming-I  "};
                    tempSubjectList1 = tempSubjectList4;
                    break;
                case 4:
                    String [] tsl5 = {"Business Communication","Operations Management","Financial Accounting","Business Finance","Computer Programming-II "};
                    tempSubjectList1 = tsl5;
                    break;
                case 5:
                    String[] tsl6 = {"Business Law ","Business Environment in Nepal ","Cost and Management Accounting ","Psychology","Introduction to Database"};
                    tempSubjectList1 = tsl6;
                    break;
                case 6:
                    String [] tsl7 = {"International Business ","Basic Financial Management  ","Principles of Marketing ","Sociology","Management Information System"};
                    tempSubjectList1 = tsl7;
                    break;
                case 7:
                    String [] tsl8 = {"Organizational Relations","Business Strategy","Marketing Communication ","Critical Thinking and Decision Making","E- Commerce"};
                    
                    tempSubjectList1 = tsl8;
                    break;
                case 8:
                       String [] tsl9 = {"Computer Security and Cyber Law","Economics of Information and Communication",
                           "Object Oriented Analysis and Design","System Administration: WiN Nt","Software Project Management"};
                           tempSubjectList1 = tsl9;
                default:
                    System.out.println("hey Ho");
            }
        }
        return tempSubjectList1;
    }
}
    

