package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.Vehicle;
import com.example.demo.repositories.vehicleRepo;




@RestController
public class VehicleController {
	
	private final vehicleRepo repository;
	
	VehicleController(vehicleRepo repository){
		this.repository = repository;
	}
	@GetMapping("/Vehicles")
	List<Vehicle> all(){
		return repository.findAll();
	}
	
	@PutMapping("/Vehicles/{reg}")
    Vehicle newVehicle(@RequestBody Vehicle newVehicle) {
    	return repository.save(newVehicle);
    }
	
	@GetMapping("/Vehicles/{reg}")
	Optional<Vehicle> one(@PathVariable String reg) {
	    
	    return repository.findById(reg);
	    //.orElseThrow(() -> new customerNotFoundException(id));
	}
	
	@PutMapping("/Vehicles/{reg}")
	Vehicle replaceVehicle(@RequestBody Vehicle newVehicle, @PathVariable String reg) {
	    
	    return repository.findById(reg)
	      .map(vehicle -> {
	        vehicle.setMake(newVehicle.getMake());
	        vehicle.setReg(newVehicle.getReg());
	        return repository.save(vehicle);
	      })
	      .orElseGet(() -> {
	        newVehicle.setReg(reg);
	        return repository.save(newVehicle);
	      });
	 }
	
	
	 @DeleteMapping("/Vehicles/{reg}")
	 void deleteHires(@PathVariable String reg) {
	    repository.deleteById(reg);
	 }

    
    

}