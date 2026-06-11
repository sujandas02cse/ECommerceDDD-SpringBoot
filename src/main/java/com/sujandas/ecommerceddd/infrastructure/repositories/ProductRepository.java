package com.sujandas.ecommerceddd.infrastructure.repositories;

import com.sujandas.ecommerceddd.domain.entities.Product;
import com.sujandas.ecommerceddd.domain.repositories.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductRepository implements IProductRepository {

private  final IProductJpaRepository productJpaRepository;

    public ProductRepository(IProductJpaRepository productJpaRepository) {
        this.productJpaRepository = productJpaRepository;
    }


    @Override
    public List<Product> getAllProducts() {
        return productJpaRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productJpaRepository.findById(id).orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        return productJpaRepository.save(product);
    }
}
