package com.sujandas.ecommerceddd.application.services;

import com.sujandas.ecommerceddd.domain.entities.Customer;
import com.sujandas.ecommerceddd.domain.repositories.ICustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private  final ICustomerRepository customerRepository;


    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers()
    {

        return  customerRepository.getAllCustomers();
    }

}
