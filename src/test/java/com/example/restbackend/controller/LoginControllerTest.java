package com.example.restbackend.controller;

import com.example.restbackend.model.Client;
import com.example.restbackend.repository.ClientRepository;
import com.example.restbackend.service.LoginClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc

class LoginControllerTest {
@Autowired
private MockMvc mockMvc;
    @MockBean
    private ClientRepository clientRepository;

    @MockBean
    private LoginClientService loginClientService;

    @Test
    void getAllClients() throws Exception {
        mockMvc.perform((MockMvcRequestBuilders.get("/login")))
                .andExpect(status().isOk());
    }

    @Test
    void login() throws Exception {
        Client user = new Client();
        user.setusername("exampleUser");
        user.setpassword("examplePassword");

        // Mock the behavior of your service to return the user when getUserByUsername is called
        when(loginClientService.getUserByUsername("exampleUser")).thenReturn(user);

        mockMvc.perform(MockMvcRequestBuilders.post("/login")
                        .param("username", "exampleUser")
                        .param("password", "examplePassword"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    }
}
