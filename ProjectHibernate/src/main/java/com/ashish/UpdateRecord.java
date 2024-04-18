package com.ashish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ashish.modal.Product;
import com.ashish.modal.Student;

public class UpdateRecord {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("com/ashish/hibernate.cfg.xml");

		// creating session factory object

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Object object = session.load(Product.class, new Integer(0));
		Product product = (Product) object;
		// Student student = (Student) object;
		Transaction txt = session.beginTransaction();
		// student.setId(44);
//		student.setName("Aman Singh");
//		student.setCity("Gwalior");
//		System.out.println(student);
		product.setProName("Fridge");

		// update
		session.update(object);
		System.out.println("Data Update successfully.....!!");
		txt.commit();
		session.close();
		sessionFactory.close();

	}
}
