package com.loan.mortgageMicroService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MortgageMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MortgageMicroServiceApplication.class, args);
		System.out.println("***********|| Mortgage Loan Microservice ||***********");
	}

}
