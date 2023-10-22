package com.example.restbackend.service;

import com.example.restbackend.model.Client;
import com.example.restbackend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    ClientRepository clientRepository;

    public Client createClient(Client client) {
        // You can add validation and business logic here
        return clientRepository.save(client);
    }
}
