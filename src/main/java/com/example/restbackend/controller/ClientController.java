package com.example.restbackend.controller;

import com.example.restbackend.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @GetMapping("/client")
    public List<Client> getAllClients() {
        List<Client> client = List.of(
                new Client("Jane","23/8/1956"),
                new Client("Mary","17/9/1945"),
                new Client("Henry", "9/2/1963")
        );
        return client;
    }

}
