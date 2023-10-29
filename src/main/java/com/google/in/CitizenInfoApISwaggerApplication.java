package com.google.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "citizen api", version = "2.0",description = "citizent Information"))
public class CitizenInfoApISwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitizenInfoApISwaggerApplication.class, args);
	}

}
