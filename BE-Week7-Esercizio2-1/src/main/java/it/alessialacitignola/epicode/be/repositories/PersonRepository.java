package it.alessialacitignola.epicode.be.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.alessialacitignola.epicode.be.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
