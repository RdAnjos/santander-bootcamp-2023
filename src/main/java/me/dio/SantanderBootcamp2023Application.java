package me.dio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Corrigindo erro de CORS na nossa API publicada em PRD no Railway
@OpenAPIDefinition(servers = { @Server(url = "/" , description = "Default Server URL")})
@SpringBootApplication
public class SantanderBootcamp2023Application {

	public static void main(String[] args) {
		SpringApplication.run(SantanderBootcamp2023Application.class, args);
	}

}
