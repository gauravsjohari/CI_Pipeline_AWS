package com.example.Gaurav_CI_CD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GauravCiCdApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Gaurav Johari's Page";
	}
	public static void main(String[] args) {
		SpringApplication.run(GauravCiCdApplication.class, args);
	}

}
