package pl.edu.agh.bazydanych.intro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pl.edu.agh.bazydanych.model.Employee;


public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Northwind");
		EntityManager em = emf.createEntityManager();
		Employee employee = em.find(Employee.class, 1);
		System.out.println(employee.getAddress());
		em.close();
		emf.close();
	}

}
