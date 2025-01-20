package com.example.test.project.service;

import com.example.test.project.model.Users;
import com.example.test.project.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);

    public Users register(Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }
    // Get all users
    public List<Users> getAllUsers() {
        return repo.findAll();
    }

    // Get user by ID
    public Optional<Users> getUserById(int id) {
        return repo.findById(id);
    }

    // Delete user by ID
    public boolean deleteUser(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}
