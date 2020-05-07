package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;




@SpringBootApplication
@EntityScan("com.app")
public class StartApp  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(StartApp.class, args);
	}

}

