package com.coforge.sp.admin;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
	@EnableAdminServer
	@EnableDiscoveryClient
	public class SpringBootAdminApplication {
	    public static void main(String[] args) {
	        SpringApplication.run(SpringBootAdminApplication.class, args);
	    }

	}



