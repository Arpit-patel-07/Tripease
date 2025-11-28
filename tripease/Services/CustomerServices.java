package com.example.tripease.Services;

import com.example.tripease.Entities.Customer;
import com.example.tripease.Repositories.CustomerRepository;
import com.example.tripease.Transformer.CustomerTransformer;
import com.example.tripease.dto.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServices {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerResponse addCustomer(Customer customer){
        Customer savedData =  customerRepository.save(customer);
        return CustomerTransformer.customerToCustomerResponse(customer);
    }
}
