package com.example.buletin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@SpringBootApplication
public class BuletinApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuletinApplication.class, args);
	}

}
