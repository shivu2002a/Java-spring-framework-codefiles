package com.shivu.hibernate.demo;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivu.hibernate.entity.Instructor;
import com.shivu.hibernate.entity.InstructorDetail;

public class CreateDemo {

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
			// Create objects and associate them
			Instructor ins = new Instructor("N", "Pranav", "npranav@gmail.com");
			InstructorDetail insDet = new InstructorDetail("https://www.npranav's.com/youtube", "Games");
			
			Instructor ins2 = new Instructor("Nihal", "Garag", "nihalgarag@gmail.com");
			InstructorDetail insDet2 = new InstructorDetail("https://www.nihalgarag.com/youtube", "Cricket");
			
			ins2.setInstructorDetail(insDet2);
			
			session.beginTransaction();
			session.save(ins2);
			session.getTransaction().commit();
			System.out.println("Done!!");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			session.close();
		}
	}

}
