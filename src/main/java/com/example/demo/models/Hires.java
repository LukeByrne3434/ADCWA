package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;



@Entity
public class Hires {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String hid;
	private String hireStartDate;
	@ManyToOne
	@JoinColumn(name = "cid_FK")
	private Customer hireCustomer;
	@ManyToOne
	@JoinColumn(name = "reg_FK")
	private Vehicle hireVehicle;
	public String getHid() {
		return hid;
	}
	public void setHid(String hid) {
		this.hid = hid;
	}
	public String getHireStartDate() {
		return hireStartDate;
	}
	public void setHireStartDate(String hireStartDate) {
		this.hireStartDate = hireStartDate;
	}
	public Customer getHireCustomer() {
		return hireCustomer;
	}
	public void setHireCustomer(Customer hireCustomer) {
		this.hireCustomer = hireCustomer;
	}
	public Vehicle getHireVehicle() {
		return hireVehicle;
	}
	public void setHireVehicle(Vehicle hireVehicle) {
		this.hireVehicle = hireVehicle;
	}
	
	
}
