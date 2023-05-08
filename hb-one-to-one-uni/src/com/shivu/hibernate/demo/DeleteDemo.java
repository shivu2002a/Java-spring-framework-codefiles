package com.shivu.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shivu.hibernate.entity.Instructor;
import com.shivu.hibernate.entity.InstructorDetail;

public class DeleteDemo {
	
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
			//start a transaction
			session.beginTransaction();
			
			//get instructor by their primary key
			int id = 3;
			Instructor ins = session.get(Instructor.class, id);
			System.out.println(ins);
			
			//delete the instructor
			if(ins != null) {
				System.out.println("Deleting ins" + ins);
				session.delete(ins);
			}
			session.getTransaction().commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
}
