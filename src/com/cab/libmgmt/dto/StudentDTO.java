package com.cab.libmgmt.dto;

public class StudentDTO {
    private String sid;
    private String name;
    private String dob;
   
    private String phone;
    private String address;
    private String gender;
    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
 public String getSid() {
        return sid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    
}
