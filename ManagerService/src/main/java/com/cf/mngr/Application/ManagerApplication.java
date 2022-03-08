package com.cf.mngr.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





	@SpringBootApplication
      @EnableEurekaClients
	public class ManagerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ManagerApplication.class, args);
		}
	 
	}



