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

}
