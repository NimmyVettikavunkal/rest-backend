package com.example.restbackend.service;

import com.example.restbackend.model.Client;
import com.example.restbackend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client getUserByUsername(String username) {

        return clientRepository.findByUsername(username);
    }

    public List<Long> getAllContactNo(String username){
        Client user = getUserByUsername(username);

        List<Long> contactNo = List.of(
                user.getEmgContactNo1(),
                user.getEmgContactNo2(),
                user.getAmbulanceNo());
        return contactNo;
    }
}
