package com.projektokomanda.atsparumosalciuiskaiciuokle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.projektokomanda.atsparumosalciuiskaiciuiokle")
public class AtsparumoSalciuiSkaiciuokleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtsparumoSalciuiSkaiciuokleApplication.class, args);
		System.out.println("It works."); // Delete this line later.
	}
}
