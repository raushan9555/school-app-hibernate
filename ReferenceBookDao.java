package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.ReferenceBook;

public class ReferenceBookDao {
		//ReferenceBook rb=new ReferenceBook();
		ReferenceBook saveReferenceBook(ReferenceBook rb) {
			ReferenceBook rb1=new ReferenceBook();
			rb1.setId(1);
			rb1.setName("Core Java");
			rb1.setAuthor("Dixith SN");
			rb1.setSubject("Computer Science");
			ReferenceBook rb2=new ReferenceBook();
			rb2.setId(2);
			rb2.setName("JDBC API");
			rb2.setAuthor("Vinod R");
			rb2.setSubject("Computer Science");
			ReferenceBook rb3=new ReferenceBook();
			rb3.setId(3);
			rb3.setName("Hibernate");
			rb3.setAuthor("Vikas");
			rb3.setSubject("Computer Science");
			ReferenceBook rb4=new ReferenceBook();
			rb4.setId(2);
			rb4.setName("JDBC API");
			rb4.setAuthor("Vinod R");
			rb4.setSubject("Computer Science");
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
			System.out.println(emf);
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(rb1);
			em.persist(rb2);
			em.persist(rb3);
			em.persist(rb4);
			et.commit();
				return rb; 
				}
		ReferenceBook findReferenceBookById(int id) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
			EntityManager em=emf.createEntityManager();
			ReferenceBook ref=em.find(ReferenceBook.class,5);
			if(ref!=null) {
			System.out.println(ref.getId());
			System.out.println(ref.getName());
			System.out.println(ref.getAuthor());
			System.out.println(ref.getSubject());
			}
			else
				System.out.println("Roll No. does not exist");
			
			return null;
		}
		boolean deleteReferenceBook(int id) {
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
			//System.out.println(emf);
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			ReferenceBook ref=em.find(ReferenceBook.class,4);
			if(ref!=null) {
				et.begin();
				em.remove(ref);
				et.commit();
				System.out.println("Reference Book Deleted");
			}
			else {
				System.out.println("Reference Book No does not exist");
			}
			
			return false;
		}



}
