package com.cf.cust.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.cf.cust.model.Customer;
import com.cf.cust.repo.CustomerRepo;

public interface CustomerService {
   public Customer saveCustomer(Customer customer);
	
	public long getBalance(int customerId);
	
	
	
		
	}


