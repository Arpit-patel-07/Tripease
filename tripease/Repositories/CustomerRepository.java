package com.example.tripease.Repositories;


import com.example.tripease.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}