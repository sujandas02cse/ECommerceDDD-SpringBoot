package com.sujandas.ecommerceddd.application.services;

import com.sujandas.ecommerceddd.application.dtos.CreateCustomerDto;
import com.sujandas.ecommerceddd.application.dtos.CustomerDto;
import com.sujandas.ecommerceddd.application.dtos.UpdateCustomerDto;
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

    @Override
    public CustomerDto getCustomerById(Long id) {
        Customer customer=customerRepository.getCustomerById(id);
        return  CustomerMapper.toDto(customer);

    }

    @Override
    public CustomerDto createCustomer(CreateCustomerDto request) {
        Customer customer=new Customer(
                request.getFirstName(),
                request.getLastName(),
                request.getEmail(),
                request.getContactNumber());

          Customer savedCustomer=customerRepository.save(customer);

          return  CustomerMapper.toDto(savedCustomer);
    }

    @Override
    public CustomerDto updateCustomer(Long id, UpdateCustomerDto updateCustomerDto) {

       Customer existingCustomer=customerRepository.getCustomerById(id);

       existingCustomer.setFirstName(updateCustomerDto.getFirstName());
       existingCustomer.setLastName(updateCustomerDto.getLastName());
       existingCustomer.setEmail(updateCustomerDto.getEmail());
       existingCustomer.setContactNumber(updateCustomerDto.getContactNumber());

       Customer updatedCustomer=customerRepository.update(existingCustomer);

       return  CustomerMapper.toDto(updatedCustomer);

    }
}

