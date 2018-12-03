package com.example.SpringDemoInMemory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringDemoInMemoryApplication {

	public static void main(String[] args) {
		
		
		System.out.println("sadsadda");
		ConfigurableApplicationContext run = SpringApplication.run(SpringDemoInMemoryApplication.class, args);
	}
}
