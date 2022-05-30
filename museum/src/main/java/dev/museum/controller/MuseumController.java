package dev.museum.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.museum.model.Exhibit;

@RestController
public class MuseumController {

	@RequestMapping("/create")
	public Exhibit save(@RequestParam("Name") String Name, @RequestParam("State") String State,
			@RequestParam("Era") String Era, @RequestParam("Floor") String Floor) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("museum");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		Exhibit exhibit = new Exhibit();
		exhibit.setName(Name);
		exhibit.setState(State);
		exhibit.setEra(Era);
		exhibit.setFloor(Floor);

		em.persist(exhibit);

		tx.commit();

		return exhibit;

	}
	
	
	@PatchMapping(value = "/{id}")
	public void update(@PathVariable Long id, @RequestParam("Name") String Name) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("museum");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		Exhibit exhibit = em.find(Exhibit.class, id);

		exhibit.setName(Name);
		em.persist(exhibit);

		tx.commit();

	}

	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("museum");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		Exhibit exhibit = em.find(Exhibit.class, id);
		em.remove(exhibit);
		tx.commit();
	}

}
