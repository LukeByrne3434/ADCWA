package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String reg;
	private String make;
	String hireable;
	@ManyToMany(mappedBy = "hireVehicle")
	private List<Hires> vehicleHires = new ArrayList<Hires>();
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getHireable() {
		return hireable;
	}
	public void setHireable(String hireable) {
		this.hireable = hireable;
	}
	public List<Hires> getVehicleHires() {
		return vehicleHires;
	}
	public void setVehicleHires(List<Hires> vehicleHires) {
		this.vehicleHires = vehicleHires;
	}

}
