package com.stackroute.asmsgreceiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.stackroute.asmsgreceiver.services.Asmsgreceiver;

@SpringBootApplication
public class AsmsgreceiverApplication implements CommandLineRunner {
	
	@Autowired
	Asmsgreceiver consumer;
	
	@Override
	public void run(String... args) throws Exception {
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AsmsgreceiverApplication.class, args);
	}
}
