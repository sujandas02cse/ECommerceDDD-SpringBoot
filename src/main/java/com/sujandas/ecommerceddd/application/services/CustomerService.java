package com.sujandas.ecommerceddd.application.services;

import com.sujandas.ecommerceddd.application.dtos.CustomerDto;
import com.sujandas.ecommerceddd.application.mappings.CustomerMapper;
import com.sujandas.ecommerceddd.domain.entities.Customer;
import com.sujandas.ecommerceddd.domain.repositories.ICustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

   private  final ICustomerRepository customerRepository;

    public CustomerService(ICustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public List<CustomerDto> getAllCustomers() {

        List<Customer> customers=customerRepository.getAllCustomers();

        return customers.stream().map(CustomerMapper::toDto).toList();


    }
}
