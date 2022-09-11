package com.example.SpringProjectArt.service.Impl;

import com.example.SpringProjectArt.model.Cart;
import com.example.SpringProjectArt.model.Status;
import com.example.SpringProjectArt.repository.CartRepository;
import com.example.SpringProjectArt.repository.ProductRepository;
import com.example.SpringProjectArt.service.CartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository) {

        this.cartRepository = cartRepository;
    }
    @Override
    public Cart add(Cart cart) {
        return cartRepository.save(cart);
    }
}
