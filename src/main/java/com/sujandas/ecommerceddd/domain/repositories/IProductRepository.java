package com.sujandas.ecommerceddd.domain.repositories;

import com.sujandas.ecommerceddd.domain.entities.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAllProducts();

    Product getProductById(Long id);

    Product createProduct(Product product);
}
