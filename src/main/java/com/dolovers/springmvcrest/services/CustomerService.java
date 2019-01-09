package com.dolovers.springmvcrest.services;

import com.dolovers.springmvcrest.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();
    Customer saveCustomer(Customer customer);
    Customer updateCustomer(Long id, Customer customer);
    Boolean deleteCustomer(Long id);
}
