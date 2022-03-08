package com.cf.cust.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;

import com.cf.cust.model.Customer;
import com.cf.cust.repo.CustomerRepo;
import com.cf.cust.repo.transcationrepo;

public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepo repo;
	
	
	public long getBalance(int customerId) {
		// TODO Auto-generated method stub
		Customer customer=repo.getById(customerId);
		return customer.customerId	;
	}


	@Override
	public Customer saveCustomer(Customer customer) {
		System.out.println(customer);
	
		return repo.save(customer);
	}
	
	
	
	
	}
	




