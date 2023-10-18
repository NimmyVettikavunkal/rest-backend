package com.example.restbackend.controller;

import com.example.restbackend.model.Client;
import com.example.restbackend.repository.ClientRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/client")
    public List<Client> getAllClients() {

        return clientRepository.findAll();
    }

    @PostMapping("/client")
    public Client createClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }

}






