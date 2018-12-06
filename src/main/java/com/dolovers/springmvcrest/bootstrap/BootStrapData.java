package com.dolovers.springmvcrest.bootstrap;

import com.dolovers.springmvcrest.domain.Customer;
import com.dolovers.springmvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Customer Data");

        Customer customer1 = new Customer();
        customer1.setFirstName("Sagiruddin");
        customer1.setLastName("Mondal");
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setFirstName("Anish");
        customer2.setLastName("Chatterjee");
        customerRepository.save(customer2);

        Customer customer3 = new Customer();
        customer3.setFirstName("Aziz");
        customer3.setLastName("Mondal");
        customerRepository.save(customer3);

        System.out.println("Customers Saved: " + customerRepository.count());

    }
}
