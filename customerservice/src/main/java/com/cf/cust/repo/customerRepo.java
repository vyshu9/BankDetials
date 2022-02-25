package com.cf.cust.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cf.cust.model.customer;
@Repository
public interface customerRepo extends JpaRepository<customer,Integer>{



}



