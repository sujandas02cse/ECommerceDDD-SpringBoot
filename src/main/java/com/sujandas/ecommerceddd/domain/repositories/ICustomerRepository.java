package com.sujandas.ecommerceddd.domain.repositories;

import com.sujandas.ecommerceddd.domain.entities.Customer;

import java.util.List;

public interface ICustomerRepository {

List<Customer> getAllCustomers();

}
