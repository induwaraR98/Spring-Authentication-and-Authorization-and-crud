package com.example.test.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // Generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor // Generates a no-args constructor
@AllArgsConstructor // Generates an all-args constructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID using PostgreSQL sequence
    private int id;

    private String username;
    private String password;
}
