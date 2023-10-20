package com.example.restbackend.service;

import com.example.restbackend.model.Client;
import com.example.restbackend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client getUserByUsername(String username) {

        return clientRepository.findByUsername(username);
    }

    public boolean authenticateUser(String username, String password) {
        Client user = getUserByUsername(username);

        if (user != null && password.equals(user.getpassword())) {
            // Passwords match, user is authenticated
            return true;
        }

        // Authentication failed
        return false;
    }

    public List<Integer> getAllContactNo(String username){
        Client user = getUserByUsername(username);

        List<Integer> contactNo = List.of(
                user.getEmgContactNo1(),
                user.getEmgContactNo2());
        return contactNo;
    }

}