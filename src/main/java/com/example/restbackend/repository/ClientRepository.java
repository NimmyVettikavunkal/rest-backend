package com.example.restbackend.repository;

import com.example.restbackend.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends JpaRepository<Client,Long> {

    Client findByUsername(String username);

//    @Query("SELECT u.password FROM User u WHERE u.username = :username")
//    String findPasswordByUsername(@Param("username") String username);
    }

// ClientRepository is using the methods in JpaRepository