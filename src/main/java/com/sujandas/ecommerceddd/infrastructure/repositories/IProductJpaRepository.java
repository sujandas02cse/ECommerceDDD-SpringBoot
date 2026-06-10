package com.sujandas.ecommerceddd.infrastructure.repositories;

import com.sujandas.ecommerceddd.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductJpaRepository  extends JpaRepository<Product,Long> {
}
