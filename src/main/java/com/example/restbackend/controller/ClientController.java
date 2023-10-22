package com.example.restbackend.controller;

import com.example.restbackend.model.Client;
import com.example.restbackend.repository.ClientRepository;
import com.example.restbackend.service.RegisterService;
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
/*    @PostMapping("/client")
    public Client createClient(@RequestBody Client client) {
        // Save the new client in the database using clientRepository
        // You might want to validate and perform error handling here

        System.out.println("inside client controller");
        return clientRepository.save(client);
    }*/
    @Autowired
    RegisterService clientService;


/*    public ClientController(RegisterService clientService) {
        this.clientService = clientService;
    }*/

    @PostMapping("/client")
    public Client createClient(@RequestBody Client client) {
        System.out.println("inside client controller");
        return clientService.createClient(client);
    }

}
