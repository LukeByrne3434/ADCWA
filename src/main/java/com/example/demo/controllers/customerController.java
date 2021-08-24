package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Customer;
import com.example.demo.repositories.customerRepo;



@RestController
public class customerController {
	
	private final customerRepo repository;
	
	customerController(customerRepo repository){
		this.repository = repository;
	}
	@GetMapping("/customers")
	List<Customer> all(){
		return repository.findAll();
	}
	
	@PutMapping("/customers/{cid}")
    Customer newCustomer(@RequestBody Customer newCustomer) {
    	return repository.save(newCustomer);
    }
	
	@GetMapping("/customers/{cid}")
	Optional<Customer> one(@PathVariable String Cid) {
	    
	    return repository.findById(Cid);
	      //.orElseThrow(() -> new customerNotFoundException(id));
	}
	
	@PutMapping("/customers/{cid}")
	Customer replacecustomer(@RequestBody Customer newCustomer, @PathVariable String Cid) {
	    
	    return repository.findById(Cid)
	      .map(customer -> {
	        customer.setName(newCustomer.getName());
	        customer.setCid(newCustomer.getCid());
	        return repository.save(customer);
	      })
	      .orElseGet(() -> {
	        newCustomer.setCid(Cid);
	        return repository.save(newCustomer);
	      });
	 }
	
	 @DeleteMapping("/customers/{id}")
	 void deletecustomer(@PathVariable String Cid) {
	    repository.deleteById(Cid);
	 }

    
    

}
