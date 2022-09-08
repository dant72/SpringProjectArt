package com.example.SpringProjectArt.controller;

import com.example.SpringProjectArt.model.Product;
import com.example.SpringProjectArt.service.ProductService;
import com.example.SpringProjectArt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ProductController {

    private final ProductService productService;


    @Autowired
    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    @PostMapping("/product")
    public String registerProduct(HttpServletRequest request) {

        try {
            Product product = new Product();
            product.setName(request.getParameter("name"));
            product.setPrice(Integer.parseInt(request.getParameter("price")));

            productService.register(product);

            return "Register product successful!";
        }
        catch (Exception ex)
        {
            return ex.getMessage();
        }
    }
}
