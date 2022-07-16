package uy.edu.ort.devops.shippingserviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShippingServiceExampleApplication {

	public static void main(String[] args) {
		System.out.println("Shipping Service Started on Port 8080");
		SpringApplication.run(ShippingServiceExampleApplication.class, args);
	}

}
