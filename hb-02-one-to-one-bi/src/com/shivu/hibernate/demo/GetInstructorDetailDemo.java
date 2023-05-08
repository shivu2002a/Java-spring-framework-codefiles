package com.shivu.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivu.hibernate.entity.Instructor;
import com.shivu.hibernate.entity.InstructorDetail;

public class GetInstructorDetailDemo {

	public static void main(String[] args) {
		//build a session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.buildSessionFactory();
		
		//Create session
		Session session = factory.getCurrentSession();

		try {
			
			//Begin Transaction
			session.beginTransaction();			
			
			//Get instructor Detail object and get ins object from this ins detail obj;
			int id = 3;
			InstructorDetail insDetail = session.get(InstructorDetail.class, id);
			System.out.println("Instructor detail - " + insDetail + "\nInstructor associated - " + insDetail.getInstructor());
			
			//Commit Transaction
			session.getTransaction().commit();
			
			System.out.println("Done!!"); 
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			session.close();
			factory.close();
		}
	}
}
