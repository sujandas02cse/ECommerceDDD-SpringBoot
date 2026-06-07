package com.sujandas.ecommerceddd.domain.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false,length = 255)
    private String name;

    @Column(length = 100)
    private String description;

    @Column(nullable = false,length = 10)
    private  float price;

    @Column(nullable = false,length = 10)
    private  int stockQuantity;


}
