package br.edu.ifpb.dac.projetodac;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifpb.dac.projetodac.controller.SpecieController;
import br.edu.ifpb.dac.projetodac.model.SpecieModel;

@SpringBootApplication
public class ProjectDacApplication implements CommandLineRunner {
//	SpecieController ec = new SpecieController();

	public static void main(String[] args) {
		SpringApplication.run(ProjectDacApplication.class, args);
		
//		SpecieModel e1 = new SpecieModel(null, "Caesalpinea pyramidalis", "Catingueira");
//		SpecieModel e2 = new SpecieModel(null, "Crotalaria spectabilis", "Sementes Piraí");
//		SpecieModel e3 = new SpecieModel(null, "Genipa americana L", "Jenipapepeiro");
//		SpecieModel e4 = new SpecieModel(null, "Acacia mangium Wild", "Acácia");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
//		em.persist(e1);
//		em.persist(e2);
//		em.persist(e3);
//		em.persist(e4);
		
		em.getTransaction().commit();
	}

	@Override
	public void run(String... args) throws Exception {
//		ec.criar();
//		ec.listar();
	}

}
