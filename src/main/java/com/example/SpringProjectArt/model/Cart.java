package com.example.SpringProjectArt.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="carts")
@Data
public class Cart extends BaseEntity{
    @Column(name = "user_id")
    private Long userId = 0L;

    public Cart()
    {
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "cart_products",
            joinColumns = {@JoinColumn(name = "cart_id", referencedColumnName = "id")},
           inverseJoinColumns = {@JoinColumn(name="product_id", referencedColumnName = "id")})
    private List<Product> products;

    @OneToOne(mappedBy = "cart", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;
}
