package com.example.restbackend.controller;
import com.example.restbackend.model.Client;
import com.example.restbackend.repository.ClientRepository;
import com.example.restbackend.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {


    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ClientService clientService;

    @GetMapping("/login")
    public List<Client> getAllClients() {

        return clientRepository.findAll();
    }

//    @PostMapping("/login")
//    public String loginSubmit(@RequestParam String username, @RequestParam String password, Model model) {
//        // Implement server-side validation and user authentication here
//        // You can check the provided username and password against your database
//        if (isValidLogin(username, password)) {
//            // Redirect to a success page
//            return "redirect:/welcome";
//        } else {
//            // Redirect to a login error page or display a login error message
//            return "redirect:/login?error=true";
//        }
//    }
//
//    private boolean isValidLogin(String username, String password) {
//        // Implement your authentication logic here, e.g., check against a database
//        // Return true if the login is valid, otherwise false
//
//        return username.equals("exampleUser") && password.equals("examplePassword");
//    }


    @PostMapping("/login")
    public ResponseEntity<Client> login(@RequestParam String username, @RequestParam String password) {
        Client user = clientService.getUserByUsername(username);

        if (clientService.authenticateUser(username, password)) {
            // Handle authentication failure, return an error response
            System.out.println(ResponseEntity.ok(user.getDob()));
            return ResponseEntity.ok(user);

        }

        // Authentication succeeded, return the user object
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}

