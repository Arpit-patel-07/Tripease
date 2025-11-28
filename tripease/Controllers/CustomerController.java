package com.example.tripease.Controllers;

import com.example.tripease.Entities.Customer;
import com.example.tripease.Services.CustomerServices;
import com.example.tripease.Transformer.CustomerTransformer;
import com.example.tripease.dto.CustomerRequest;
import com.example.tripease.dto.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerServices services;

    @PostMapping("/add")
    public CustomerResponse addCustomer(@RequestBody CustomerRequest customerRequest){
        Customer customer = CustomerTransformer.customerRequestToCustomer(customerRequest);
        return  services.addCustomer(customer);
    }
}
