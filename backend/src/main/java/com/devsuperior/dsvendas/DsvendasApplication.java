package com.devsuperior.dsvendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.*"})
public class DsvendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsvendasApplication.class, args);
	}

}
