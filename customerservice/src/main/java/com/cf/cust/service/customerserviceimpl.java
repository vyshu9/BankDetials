package com.cf.cust.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.cf.cust.model.Transactions;
import com.cf.cust.model.customer;
import com.cf.cust.repo.customerRepo;
import com.cf.cust.repo.transcationrepo;

public class customerserviceimpl implements customerservice{
	@Autowired
	private customerRepo repo;
	@Autowired
	private transactionrepo tranrepo;
	@Autowired
	RestTemplate template;
	public String insertCustomer(customer customer) {
	// TODO Auto-generated method stub
	return "Inserted successfully";
	} public Optional<Transactions> findByttype(String ttype, String amount) {
	// TODO Auto-generated method stub
	return tranrepo.findByttype(ttype,amount);
	} public List findByttype(String ttype) {
	// TODO Auto-generated method stub
	return tranrepo.findByttype(ttype);
	}
	}



}
