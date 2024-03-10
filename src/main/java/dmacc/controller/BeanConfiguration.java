package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Owner;
import dmacc.beans.Vehicle;

/**
 * @author Spencer Tramontina - srtramontina
 * CIS175 - Spring 2024
 * Mar 10, 2024
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public Owner owner() {
		Owner bean = new Owner();
		bean.setName("Spencer");
		bean.setPhone("515-777-9999");
		bean.setEmail("srtram@gmail.com");
		return bean;
	}
	
	@Bean
	public Vehicle vehicle() {
		Vehicle bean = new Vehicle("2013", "Ford", "Fusion", "Silver");
		return bean;
	}
}
