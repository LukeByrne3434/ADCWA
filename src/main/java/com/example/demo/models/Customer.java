package com.example.demo.models;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;


@Entity
public class Customer {
	@Id		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String cid;
	private String name;
	@OneToMany(mappedBy = "hireCustomer")
	private List<Hires> customerHires;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Hires> getCustomerHires() {
		return customerHires;
	}
	public void setCustomerHires(List<Hires> customerHires) {
		this.customerHires = customerHires;
	}
	
	
}
