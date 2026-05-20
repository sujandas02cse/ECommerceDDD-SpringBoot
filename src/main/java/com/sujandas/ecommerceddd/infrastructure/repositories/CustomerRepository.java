package com.sujandas.ecommerceddd.infrastructure.repositories;


import com.sujandas.ecommerceddd.domain.entities.Customer;
import com.sujandas.ecommerceddd.domain.repositories.ICustomerRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository {

    private  final IcustomerJpaRepository icustomerJpaRepository;

    public CustomerRepository(IcustomerJpaRepository icustomerJpaRepository) {
        this.icustomerJpaRepository = icustomerJpaRepository;
    }

    @Override
    public List<Customer> getAllCustomers() {
       return  icustomerJpaRepository.findAll();
    }
}
