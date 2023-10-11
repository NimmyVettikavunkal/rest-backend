package com.example.restbackend.model;

public class Client {

    private Long clientId;

    private String name;
    private String dob;
    private String ppsn;
    private String gender;
    private String clientAddress;
    private int clientContactNo;
    private String doctorName;
    private String doctorAddress;

    private int contactNo1;
    private int contactNo2;

    public Client() {
    }

    public Client(Long clientId, String name, String dob) {
        this.clientId = clientId;
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

    public int getClientContactNo() {
        return clientContactNo;
    }

    public void setClientContactNo(int clientContactNo) {
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

    public int getContactNo1() {
        return contactNo1;
    }

    public void setContactNo1(int contactNo1) {
        this.contactNo1 = contactNo1;
    }

    public int getContactNo2() {
        return contactNo2;
    }

    public void setContactNo2(int contactNo2) {
        this.contactNo2 = contactNo2;
    }
}
