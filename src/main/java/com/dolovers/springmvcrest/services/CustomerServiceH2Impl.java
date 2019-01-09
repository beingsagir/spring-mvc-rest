package com.dolovers.springmvcrest.services;

import com.dolovers.springmvcrest.domain.Customer;
import com.dolovers.springmvcrest.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceH2Impl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceH2Impl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        if(customerRepository.existsById(id) && (id == customer.getId()))
            return customerRepository.save(customer);
        else
            return null;
    }

    @Override
    public Boolean deleteCustomer(Long id) {
        if(customerRepository.existsById(id))
            customerRepository.deleteById(id);
        else
            return false;
        return true;
    }

}
