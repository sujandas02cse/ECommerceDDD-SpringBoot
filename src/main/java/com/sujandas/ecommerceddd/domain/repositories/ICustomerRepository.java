package com.sujandas.ecommerceddd.domain.repositories;

import com.sujandas.ecommerceddd.domain.entities.Customer;

import java.util.List;

public interface ICustomerRepository {

List<Customer> getAllCustomers();

Customer getCustomerById(Long id);

Customer save(Customer customer);


Customer update(Customer existingCustomer);
}
