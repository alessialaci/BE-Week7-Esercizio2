package it.alessialacitignola.epicode.be;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.alessialacitignola.epicode.be.config.Beans;
import it.alessialacitignola.epicode.be.entities.Person;
import it.alessialacitignola.epicode.be.services.PersonService;

@SpringBootApplication
public class BeWeek7Esercizio21Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BeWeek7Esercizio21Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//populateDb();
	}
	
	@Autowired
	PersonService ps;
	
	public void populateDb() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);

		Person p1 = (Person) ctx.getBean("person", "Alessia", "Lacitignola", 24);
		Person p2 = (Person) ctx.getBean("person", "Mario", "Rossi", 30);
		Person p3 = (Person) ctx.getBean("person", "Luigi", "Verdi", 31);
		Person p4 = (Person) ctx.getBean("person", "Maria", "Neri", 26);
		
		ps.savePerson(p1);
		ps.savePerson(p2);
		ps.savePerson(p3);
		ps.savePerson(p4);
		
		((AnnotationConfigApplicationContext)ctx).close();
	}

}
