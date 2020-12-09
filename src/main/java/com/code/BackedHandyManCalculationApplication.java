package com.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BackedHandyManCalculationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackedHandyManCalculationApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/technical/**")
				.allowedOrigins("http://localhost:4200")
				.allowedMethods("GET", "POST", "PUT", "DELETE")
				.maxAge(3600);
			}

		};
	}
	
}
