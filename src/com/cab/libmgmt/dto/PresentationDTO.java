/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cab.libmgmt.dto;

/**
 *
 * @author Jack Sparrow
 */
public class PresentationDTO {
    private String sid;
    private int score, presentationNum, semester;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPresentationNum() {
        return presentationNum;
    }

    public void setPresentationNum(int presentationNum) {
        this.presentationNum = presentationNum;
    }

    
    
    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
}
