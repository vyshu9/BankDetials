package com.cf.mngr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cf.mngr.service.ManagerService;



@RestController
@RequestMapping("/manager")
public class ManagerController<CustomerAccounts> {
	@Autowired
	ManagerService service;
	@GetMapping("/all")
	public List findAllCustomerAccounts(){
	return service.findAllCustomerAccounts();
	}
	}




