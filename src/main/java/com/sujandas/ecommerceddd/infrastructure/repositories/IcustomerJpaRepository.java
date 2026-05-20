package com.sujandas.ecommerceddd.infrastructure.repositories;

import com.sujandas.ecommerceddd.domain.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IcustomerJpaRepository extends JpaRepository<Customer,Integer> {
}
