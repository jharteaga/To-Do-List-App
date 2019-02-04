package com.example.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ToDoListAppApplication extends SpringBootServletInitializer{
	
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(ToDoListAppApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ToDoListAppApplication.class, args);
	}

}

