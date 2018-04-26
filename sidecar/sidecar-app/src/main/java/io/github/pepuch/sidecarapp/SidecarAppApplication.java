package io.github.pepuch.sidecarapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SidecarAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SidecarAppApplication.class, args);
	}
}
