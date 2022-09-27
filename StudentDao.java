package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.Student;

public class StudentDao {
	Student saveStudent(Student student) {
		Student stu1=new Student();
		stu1.setRol(1);
		stu1.setName("Deepika");
		stu1.setPercentage(78.3);
		Student stu2=new Student();
		stu2.setRol(2);
		stu2.setName("Leepika");
		stu2.setPercentage(88.3);
		Student stu3=new Student();
		stu3.setRol(3);
		stu3.setName("Deepak");
		stu3.setPercentage(79.3);
		Student stu4=new Student();
		stu4.setRol(4);
		stu4.setName("Sara");
		stu4.setPercentage(98.3);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		System.out.println(emf);
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(stu1);
		em.persist(stu2);
		em.persist(stu3);
		em.persist(stu4);
		et.commit();

		return student;
		
	}
	Student findStudentById(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		Student stu=em.find(Student.class,5);
		if(stu!=null) {
		System.out.println(stu.getRol());
		System.out.println(stu.getName());
		System.out.println(stu.getPercentage());
		}
		else
			System.out.println("Roll No. does not exist");
		return null;
		
	}
	boolean deleteStudent(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		//System.out.println(emf);
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student stu=em.find(Student.class,4);
		if(stu!=null) {
			et.begin();
			em.remove(stu);
			et.commit();
			System.out.println("Student Deleted");
		}
		else {
			System.out.println("Roll No does not exist");
		}
		return false;
		
	}
	Student updateStudent(Student student) {
		Student stu=new Student();
		//stu.setRol(3);
		stu.setRol(4);
		stu.setName("Vikas");
		stu.setPercentage(99.99);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		//System.out.println(emf);
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(stu);
		et.commit();

		return student;
		
	}

}
