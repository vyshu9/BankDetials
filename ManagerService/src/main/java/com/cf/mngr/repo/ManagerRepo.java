package com.cf.mngr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cf.mngr.model.CustomerAccounts;

import antlr.collections.List;

@Repository
	public interface ManagerRepo extends JpaRepository<CustomerAccounts,Integer>{
	@Query("select u from CustomerAccounts u where u.cid=?1")
	public List findAllCustomerAccounts(int cid);
	}




