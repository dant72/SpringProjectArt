package com.example.SpringProjectArt.repository;

import com.example.SpringProjectArt.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
}
