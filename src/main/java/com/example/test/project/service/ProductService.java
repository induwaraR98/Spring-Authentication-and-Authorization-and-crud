package com.example.test.project.service;

import com.example.test.project.model.Product;
import com.example.test.project.repo.ProductRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    // Get all products
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    // Get a product by ID
    public Optional<Product> getProductById(int id) {
        return productRepo.findById(id);
    }

    // Create a new product
    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    // Update a product by ID
    public Optional<Product> updateProduct(int id, Product updatedProduct) {
        return productRepo.findById(id).map(product -> {
            product.setName(updatedProduct.getName());
            product.setDescription(updatedProduct.getDescription());
            product.setPrice(updatedProduct.getPrice());
            return productRepo.save(product);
        });
    }

    // Delete a product by ID
    public boolean deleteProduct(int id) {
        return productRepo.findById(id).map(product -> {
            productRepo.delete(product);
            return true;
        }).orElse(false);
    }

    // Get product by name
    public Optional<Product> getProductByName(String name) {
        return productRepo.findByName(name);
    }

    // Get paginated products
    public Page<Product> getPaginatedProducts(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);  // Correct Pageable usage from Spring Data
        return productRepo.findAll(pageable);
    }
}
