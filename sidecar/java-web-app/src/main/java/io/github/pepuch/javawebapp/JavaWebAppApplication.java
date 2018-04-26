package io.github.pepuch.javawebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JavaWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaWebAppApplication.class, args);
	}
}
