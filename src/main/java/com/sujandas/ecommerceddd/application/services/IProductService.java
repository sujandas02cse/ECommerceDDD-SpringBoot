package com.sujandas.ecommerceddd.application.services;

import com.sujandas.ecommerceddd.application.dtos.CreateProductDto;
import com.sujandas.ecommerceddd.application.dtos.ProductDto;

import java.util.List;

public interface IProductService  {
    List<ProductDto> getAllProducts();

    ProductDto getProductById(Long id);

    ProductDto createProduct(CreateProductDto request);
}
