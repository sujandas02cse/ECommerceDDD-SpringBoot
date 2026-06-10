package com.sujandas.ecommerceddd.application.mappings;

import com.sujandas.ecommerceddd.application.dtos.ProductDto;
import com.sujandas.ecommerceddd.domain.entities.Product;

public class ProductMapper {


    public static ProductDto toDto(Product product) {

        return new ProductDto(
          product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getStockQuantity()
        );
    }
}
