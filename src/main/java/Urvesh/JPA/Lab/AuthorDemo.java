package Urvesh.JPA.Lab;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.lab1.entities.Author;




public interface AuthorDemo {
public static void main(String[] args) {
		
		System.out.println("Start");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abcd");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();
		
		tr.begin();
		Author aut1 = new Author(101,"Sonu","k","P",1111111111);
		Author emp2 = new Author(102,"Monu","M","S",0000000000);
		Author emp3 = new Author(103,"Ponu","R","P",222222222);
		
		// Inserting record  ---> After insertion we cannot again insert that record
		em.persist(aut1);  //insert
		em.persist(emp2);
		em.persist(emp3);
		

		
		// Displaying record
		Author aut = em.find(Author.class, 101);   //Select
		System.out.println(aut.toString());
		
		tr.commit();
		System.out.println("End");
}
}