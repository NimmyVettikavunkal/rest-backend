package com.example.restbackend.repository;

import com.example.restbackend.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {


    }

