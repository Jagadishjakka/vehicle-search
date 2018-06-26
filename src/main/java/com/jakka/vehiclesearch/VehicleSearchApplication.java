package com.jakka.vehiclesearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.jakka.vehiclesearch")

public class VehicleSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleSearchApplication.class, args);
	}
}
