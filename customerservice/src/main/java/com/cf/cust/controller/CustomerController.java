package com.cf.cust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.cf.cust.model.customer;

public class CustomerController{

	@Autowired
	customer service;
	@GetMapping("/all")
	public <transactions> List<transactions> findByttype(String ttyp){
	return service.findByttype(ttyp);
	}
	}






