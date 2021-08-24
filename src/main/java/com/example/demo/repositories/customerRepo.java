package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Customer;

public interface customerRepo extends JpaRepository<Customer, String> {

}
