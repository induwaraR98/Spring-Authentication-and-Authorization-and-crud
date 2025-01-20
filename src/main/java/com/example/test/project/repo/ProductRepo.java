package com.example.test.project.repo;

import com.example.test.project.model.Product;
import org.springframework.data.domain.Page;            // Correct import
import org.springframework.data.domain.Pageable;    // Correct import
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    Optional<Product> findByName(String name);  // Custom method to find by name

    Page<Product> findAll(Pageable pageable);   // Correct method with the correct Pageable
}
