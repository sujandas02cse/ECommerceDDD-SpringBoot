package com.sujandas.ecommerceddd.application.services;
import com.sujandas.ecommerceddd.application.dtos.CreateProductDto;
import com.sujandas.ecommerceddd.application.dtos.ProductDto;
import com.sujandas.ecommerceddd.application.mappings.ProductMapper;
import com.sujandas.ecommerceddd.domain.entities.Product;
import com.sujandas.ecommerceddd.domain.repositories.IProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProductService implements IProductService {

    private  final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<ProductDto> getAllProducts() {

        List<Product> products=productRepository.getAllProducts();
        return products.stream().map(ProductMapper::toDto).toList();

    }

    @Override
    public ProductDto getProductById(Long id) {
        Product product=productRepository.getProductById(id);
        return ProductMapper.toDto(product);
    }

    @Override
    public ProductDto createProduct(CreateProductDto request) {

        Product product=new Product(
                request.getName(),
                request.getDescription(),
                request.getPrice(),
                request.getStockQuantity()
        );

        Product savedProduct=productRepository.createProduct(product);

        return  ProductMapper.toDto(savedProduct);
    }
}
