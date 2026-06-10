package com.sujandas.ecommerceddd.api;


import com.sujandas.ecommerceddd.application.dtos.ProductDto;
import com.sujandas.ecommerceddd.application.services.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private  final IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDto> getAllProducts()
    {
        return  productService.getAllProducts();

    }


}
