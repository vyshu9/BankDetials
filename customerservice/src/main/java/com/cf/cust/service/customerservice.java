package com.cf.cust.service;

import java.util.List;
import java.util.Optional;

import com.cf.cust.model.customer;
import com.cf.cust.model.transactions;

public interface customerservice<Transactions> {
	public String insertcustomer(customer customer);
	public Optional<Transactions>findByttype(String ttype,String amount);
	public List<transactions> findByttype(String ttype);
	
		
	}


