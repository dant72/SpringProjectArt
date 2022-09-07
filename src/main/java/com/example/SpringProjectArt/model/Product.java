package com.example.SpringProjectArt.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="products")
@Data
public class Product extends BaseEntity{
    @Column(name = "name")
    private String name;
    @Column(name= "img_url")
    private String img_url;
    @Column(name="price")
    private int price;

    @ManyToMany(mappedBy = "products", fetch = FetchType.LAZY)
    private List<Cart> carts;
}
