package com.example.SpringProjectArt.service.Impl;

import com.example.SpringProjectArt.model.Product;
import com.example.SpringProjectArt.model.Status;
import com.example.SpringProjectArt.repository.ProductRepository;
import com.example.SpringProjectArt.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }
    @Override
    public Product register(Product product) {

        product.setStatus(Status.ACTIVE);
        product.setCreated(new Date());
        product.setUpdate(new Date());

        productRepository.save(product);

        return product;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findByName(String name) {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
