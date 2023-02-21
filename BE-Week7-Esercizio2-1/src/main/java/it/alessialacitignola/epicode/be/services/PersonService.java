package it.alessialacitignola.epicode.be.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.alessialacitignola.epicode.be.entities.Person;
import it.alessialacitignola.epicode.be.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository pr;
	
	public Person savePerson(Person p) {
		return pr.save(p);
	}
	
	public List<Person> getAll() {
		return pr.findAll();
	}
	
}
