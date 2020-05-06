package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.app.projects.ProjectController;



@SpringBootApplication
@EnableJpaRepositories("com.app")
@EntityScan("com.app")
@EnableEurekaClient
public class StartApp  {
	
	@Bean
	public RestTemplate getRestemplate() {
		return new RestTemplate();
	}
	
	public WebClient.Builder getWebClientBuilder(){
		return WebClient.builder();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(StartApp.class, args);
	}

}

