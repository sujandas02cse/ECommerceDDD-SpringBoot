package com.sujandas.ecommerceddd.infrastructure.repositories;

import com.sujandas.ecommerceddd.domain.entities.Customer;
import com.sujandas.ecommerceddd.domain.repositories.ICustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class CustomerRepository implements ICustomerRepository {


    private  final ICustomerJpaRepository customerJpaRepository;

    public CustomerRepository(ICustomerJpaRepository customerJpaRepository) {
        this.customerJpaRepository = customerJpaRepository;
    }


    @Override
    public List<Customer> getAllCustomers() {
        return customerJpaRepository.findAll();

    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerJpaRepository.findById(id).orElse(null);
    }

    @Override
    public Customer save(Customer customer) {
        return customerJpaRepository.save(customer);
    }

    @Override
    public Customer update(Customer existingCustomer) {
        return customerJpaRepository.save(existingCustomer);
    }

    @Override
    public void delete(Customer existingCustomer) {
        customerJpaRepository.delete(existingCustomer);
    }


}
