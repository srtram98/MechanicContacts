package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Owner;
import dmacc.beans.Vehicle;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.OwnerRepository;

@SpringBootApplication
public class MechanicContactsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MechanicContactsApplication.class, args);
		
	}
	@Autowired
	OwnerRepository repo;
	
	@Override
	public void run(String... args) throws Exception{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	
		Owner o = appContext.getBean("owner", Owner.class);
		o.setName("Spoon");
		repo.save(o);
		
		Owner x = new Owner("Ginny", "515-999-7777", "gtaylor@gmail.com");
		Vehicle v = new Vehicle("2014", "Chevy", "Cruise", "Black");
		x.setVehicle(v);
		repo.save(x);
		
		Owner y = new Owner("Bill", "555-111-9876", "billgates@gmail.com");
		Vehicle v2 = new Vehicle("2023", "Honda", "Civic", "White");
		y.setVehicle(v2);
		repo.save(y);
		
		List<Owner> allMyOwners = repo.findAll();
		for(Owner people: allMyOwners) {
			System.out.println(people.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
	

}
