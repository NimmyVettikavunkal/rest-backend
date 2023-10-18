package com.example.restbackend.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ClientControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    void getAllClients() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/client"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testCreateClient() throws Exception {
        String clientJson = "{\"name\": \"John Doe\", \"dob\": \"1990-01-01\"}";

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/client")
                        .content(clientJson)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}