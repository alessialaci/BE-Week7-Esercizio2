package it.alessialacitignola.epicode.be.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.alessialacitignola.epicode.be.entities.Person;

@Configuration
public class Beans {
	
	@Bean
	@Scope("prototype")
	public Person person(String name, String lastname, int eta) {
		return Person.builder()
				.name(name)
				.lastname(lastname)
				.eta(eta)
				.build();
	}

}
