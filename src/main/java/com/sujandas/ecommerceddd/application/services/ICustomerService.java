package com.sujandas.ecommerceddd.application.services;

import com.sujandas.ecommerceddd.application.dtos.CustomerDto;
import com.sujandas.ecommerceddd.domain.entities.Customer;

import java.util.List;

public interface ICustomerService {

List<CustomerDto> getAllCustomers();
}
