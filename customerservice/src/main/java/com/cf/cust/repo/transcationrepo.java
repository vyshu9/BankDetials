package com.cf.cust.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface transcationrepo<transactions> extends JpaRepository<transactions, Integer>{
		Optional<transactions> findByttype(String ttype, String amount); 
		List<transactions> findByttype(String ttype);
	}



}
