package src.main.java.com.example.demo;


import src.main.java.com.example.demo.Studentrecord;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Jpademo1Application {

	public static void main(String[] args) {

		EntityManagerFactory emf= Persistence.createEntityManagerFactory("p1");
		EntityManager em=emf.createEntityManager();
		em.find(Studentrecord.class,1);
	}

}
