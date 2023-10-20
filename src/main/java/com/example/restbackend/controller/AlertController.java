package com.example.restbackend.controller;

import com.example.restbackend.model.Client;
import com.example.restbackend.repository.ClientRepository;
import com.example.restbackend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlertController {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ClientService clientService;

    @GetMapping("/alert")
    public List<Integer> getAllContact(@RequestParam(defaultValue = "admin") String username){

        Client user = clientService.getUserByUsername(username);
        List<Integer> allContactNo = clientService.getAllContactNo(username);
        for (int no:allContactNo) {
            System.out.println(no);
        }
        return allContactNo;
    }

//    @GetMapping("/diet")
//    public String getDietPlan(@RequestParam(defaultValue = "admin") String username){
//        return "Welcome to Diet Char Page ";
//    }
//
//    @GetMapping("/medical")
//    public String getMedicalPrecipitation(@RequestParam(defaultValue = "admin") String username){
//        return "Welcome to Medical Precipitation ";
//    }
//
//    @GetMapping("/appointment")
//    public String getBookingAppointment(@RequestParam(defaultValue = "admin") String username){
//        return "Booking Appointment";
//    }


}
