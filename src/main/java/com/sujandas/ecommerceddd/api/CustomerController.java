package com.sujandas.ecommerceddd.api;


import com.sujandas.ecommerceddd.application.dtos.CreateCustomerDto;
import com.sujandas.ecommerceddd.application.dtos.CustomerDto;
import com.sujandas.ecommerceddd.application.dtos.UpdateCustomerDto;
import com.sujandas.ecommerceddd.application.services.ICustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private  final ICustomerService customerService;


    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerDto> getAllCustomers()
    {
     // joy sree rama
        return  customerService.getAllCustomers();

    }


    @GetMapping("/{id}")
    public  CustomerDto getCustomerById(@PathVariable("id") Long id)
    {
        return  customerService.getCustomerById(id);

    }

    @PostMapping
    public CustomerDto  createCustomer(@RequestBody CreateCustomerDto request)
    {
        return  customerService.createCustomer(request);

    }

    @PostMapping("/{id}")
    public  CustomerDto updateCustomer(@PathVariable("id") Long id,@RequestBody UpdateCustomerDto updateCustomerDto)
    {
        return  customerService.updateCustomer(id,updateCustomerDto);
    }







}
