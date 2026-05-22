package com.sujandas.ecommerceddd.api;


import com.sujandas.ecommerceddd.application.dtos.CustomerDto;
import com.sujandas.ecommerceddd.application.services.ICustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private  final ICustomerService customerService;


    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<CustomerDto> getAllCustomers()
    {

        return  customerService.getAllCustomers();

    }

}
