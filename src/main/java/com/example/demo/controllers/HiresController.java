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
import com.example.demo.models.Hires;
import com.example.demo.repositories.HiresRepo;




@RestController
public class HiresController {
	
	private final HiresRepo repository;
	
	HiresController(HiresRepo repository){
		this.repository = repository;
	}
	@GetMapping("/Hires")
	List<Hires> all(){
		return repository.findAll();
	}
	
	@PutMapping("/Hires/{hid}")
    Hires newHires(@RequestBody Hires newHires) {
    	return repository.save(newHires);
    }
	
	@GetMapping("/Hires/{hid}")
	Optional<Hires> one(@PathVariable String hid) {
	    
	    return repository.findById(hid);
	      //.orElseThrow(() -> new customerNotFoundException(id));
	}
	
	@PutMapping("/Hires/{hid}")
	Hires replaceHires(@RequestBody Hires newHires, @PathVariable String hid) {
	    
	    return repository.findById(hid)
	      .map(hires -> {
	        hires.setHireCustomer(newHires.getHireCustomer());
	        hires.setHid(newHires.getHid());
	        return repository.save(hires);
	      })
	      .orElseGet(() -> {
	        newHires.setHid(hid);
	        return repository.save(newHires);
	      });
	 }
	
	
	 @DeleteMapping("/Hires/{hid}")
	 void deleteHires(@PathVariable String hid) {
	    repository.deleteById(hid);
	 }

    
    

}
