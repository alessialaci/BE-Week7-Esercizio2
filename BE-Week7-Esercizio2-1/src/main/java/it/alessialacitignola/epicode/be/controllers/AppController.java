package it.alessialacitignola.epicode.be.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.alessialacitignola.epicode.be.entities.Person;
import it.alessialacitignola.epicode.be.services.PersonService;

@RestController
@RequestMapping("/app/")
public class AppController {
	
	@Autowired
	PersonService ps;

	@GetMapping("data1")
	public String data1() {
		return "response";
	}
	
	@GetMapping("data2")
	public ResponseEntity<List<Person>> getAll() {
		List<Person> person = ps.getAll();
		
		if( person.isEmpty() ) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(person, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/data3", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Person>> getAll_2() {
		List<Person> person = ps.getAll();
		
		if( person.isEmpty() ) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(person, HttpStatus.OK);
	}
	
}
