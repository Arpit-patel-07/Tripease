package com.example.tripease.Transformer;

import com.example.tripease.Entities.Customer;
import com.example.tripease.dto.CustomerRequest;
import com.example.tripease.dto.CustomerResponse;

public class CustomerTransformer {

    public static Customer customerRequestToCustomer(CustomerRequest customerRequest){
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setAge(customerRequest.getAge());
        customer.setEmail(customerRequest.getEmail());
        customer.setGender(customerRequest.getGender());
        return customer;
    }

    public static CustomerResponse  customerToCustomerResponse(Customer customer){
        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setName(customer.getName());
        customerResponse.setAge(customer.getAge());
        customerResponse.setEmail(customer.getEmail());
        customerResponse.setGender(customer.getGender());
        return customerResponse;
    }
}
