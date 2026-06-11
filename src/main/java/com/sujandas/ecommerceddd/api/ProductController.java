package com.sujandas.ecommerceddd.api;


import com.sujandas.ecommerceddd.application.dtos.CreateProductDto;
import com.sujandas.ecommerceddd.application.dtos.ProductDto;
import com.sujandas.ecommerceddd.application.services.IProductService;
import com.sujandas.ecommerceddd.application.services.ProductService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public  ProductDto getProductById(@PathVariable("id") Long id)
    {
        return productService.getProductById(id);

    }

    @PostMapping
    public ProductDto createProduct(@RequestBody CreateProductDto request)
    {
        return productService.createProduct(request);

    }






}
