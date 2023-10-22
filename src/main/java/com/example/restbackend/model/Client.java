package com.example.restbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    private String name;
    private String dob;
    private String ppsn;
    private String gender;
    private String clientAddress;
    private Long clientContactNo;


    private Long emgContactNo1;
    private Long emgContactNo2;

    private Long ambulanceNo;
    private String doctorName;
    private String doctorAddress;

    private String username;
    private String password;


    public Client() {
    }

    public Client(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPpsn() {
        return ppsn;
    }

    public void setPpsn(String ppsn) {
        this.ppsn = ppsn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public Long getClientContactNo() {
        return clientContactNo;
    }

    public void setClientContactNo(Long clientContactNo) {
        this.clientContactNo = clientContactNo;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public Long getEmgContactNo1() {
        return emgContactNo1;
    }

    public void setEmgContactNo1(Long emgContactNo1) {
        this.emgContactNo1 = emgContactNo1;
    }

    public Long getEmgContactNo2() {
        return emgContactNo2;
    }

    public void setEmgContactNo2(Long emgContactNo2) {
        this.emgContactNo2 = emgContactNo2;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }
}
