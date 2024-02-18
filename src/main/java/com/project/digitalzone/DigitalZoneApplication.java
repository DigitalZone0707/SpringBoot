package com.project.digitalzone;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "My API Definition",
				description = "All API Definitions",
				version = "1.0.0",
				contact = @Contact(
						name = "DigitalZone",
						email = "digitalzone0707@gmail.com",
						url = "http://localhost:8080"
				)
		),
		servers = @Server(
				url = "http://localhost:8080",
				description = "Development Server"
		)
)

@SpringBootApplication
public class DigitalZoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalZoneApplication.class, args);
	}

}
