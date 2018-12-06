package com.dolovers.springmvcrest.controllers;


import com.dolovers.springmvcrest.domain.Customer;
import com.dolovers.springmvcrest.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final String BASE_URL = "/api/v1/customers";

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getAllCustomers(){
        return customerService.findAllCustomers();
    }

    @GetMapping("/{id_}")
    Customer getCustomerById(@PathVariable Long id_){
        return customerService.findCustomerById(id_);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer_){
        return customerService.saveCustomer(customer_);
    }

    @PutMapping("/{id_}")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer updateCustomer(@PathVariable Long id_, @RequestBody Customer customer_){
        return customerService.updateCustomer(id_, customer_);
    }

}
