package com.cf.cust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cf.cust.model.Transactions;
import com.cf.cust.service.CustomerService;
import com.cf.cust.service.CustomerServiceImpl;
import com.cf.cust.model.Customer;

@RestController("/api/")
public class CustomerController{
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping(path = "/save-customer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
		
	}

	}
	






