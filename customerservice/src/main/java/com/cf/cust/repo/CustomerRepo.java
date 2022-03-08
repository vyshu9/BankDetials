package com.cf.cust.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cf.cust.model.Customer;


@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{



}



