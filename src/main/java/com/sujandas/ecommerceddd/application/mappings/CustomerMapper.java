package com.sujandas.ecommerceddd.application.mappings;

import com.sujandas.ecommerceddd.application.dtos.CustomerDto;
import com.sujandas.ecommerceddd.domain.entities.Customer;

public class CustomerMapper {


    public  static CustomerDto toDto(Customer customer)
    {
        return  new CustomerDto(
                (long) customer.getId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getContactNumber()
                );

    }
}
