package com.shivu.hibernate.demo;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivu.hibernate.entity.Student;

public class StudentDemo {

	static Student theStudent = new Student("Tippu Sultan", "Nadaf", "tippuSultan@gmail.com");
	static Student theStudent2 = new Student("Pranav", "Naik", "pranavnaik@gmail.com");
	static Student theStudent3 = new Student("Nihal", "Garag", "nihalgarag@gmail.com");
	
	public static void main(String[] args) {
		//build a session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(Student.class)
								 .buildSessionFactory();
		
		StudentDemo studentDemo = new StudentDemo();
		
		//Add into database
		Student dilip = new Student("Dilip", null, "dilip@gmail.com"); 
		studentDemo.add(factory, dilip);
		
		//get from database
		Student stud = studentDemo.retrieve(factory, 1);
		System.out.println(stud);
		
		//Update database
		boolean update = studentDemo.updateLastName(factory, dilip.getId(), "Kooli");
		
		//Querying all students
		//create a session object
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Student> list = session
								.createQuery("from Student")
								.list();
		session.getTransaction().commit();
		System.out.println("\n List : " + list);
		
		//Querying students whose email domain is gmail.com
		session = factory.getCurrentSession();
		session.beginTransaction();
		list = session.createQuery("from Student s where s.email like '%gmail.com'").list();
		session.getTransaction().commit();
		System.out.println( "\nStudents with email ending in gmail.com " + list);
		//close session-factory
		factory.close();
	}


	private boolean updateLastName(SessionFactory factory, int id, String string) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Student stud = session.get(Student.class, id);
		stud.setlastName("Kooli");
		session.getTransaction().commit();
		return true;
	}


	private boolean add(SessionFactory factory, Student theStudent) {
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			session.save(theStudent);
			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			session.close();
			return false;
		}finally {
			session.close();
		}
		return true;
		
	}
	
	private Student retrieve(SessionFactory factory, int i) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Student stud = session.get(Student.class, 1);
		session.getTransaction().commit();
		return stud;
	}

}
