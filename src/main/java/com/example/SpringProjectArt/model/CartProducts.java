package com.example.SpringProjectArt.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


//@Table(name="cart_products")
@Data
public class CartProducts {

    @Column(name = "cart_id")
    private Long cartId;
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "count")
    private int count;

}
