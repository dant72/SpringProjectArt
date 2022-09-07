package com.example.SpringProjectArt.service;

import com.example.SpringProjectArt.model.Product;

import java.util.List;

public interface ProductService {
    Product register(Product product);
    List<Product> getAll();
    Product findByName(String name);
    Product findById(Long id);
    void delete(Long id);
}
