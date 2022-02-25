package com.cf.mngr.service;

import java.util.List;
import java.util.Optional;

import com.cf.mngr.model.CustomerAccounts;
import com.cf.mngr.model.Transactions;



public interface ManagerService {
	public List findAllCustomerAccounts();
	public String insertNotes(CustomerAccounts Customeraccounts,String accttype);
	public String deleteNotes();
	public Optional<Transactions> findByttype(String ttype);
	}




