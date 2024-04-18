package com.ashish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ashish.modal.Product;

public class InsertProduct {

	public static void main(String[] args) {

		System.out.println("Project  Start");

		Product product = new Product();
		product.setProductId(10);
		product.setProName("Helmet");
		product.setPrice(2000);

		Configuration config = new Configuration();

		config.configure("/com/ashish/hibernate.cfg.xml");

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
		session.save(product);

		session.getTransaction().commit();
		session.close();
		factory.close();

		System.out.println(factory);
	}
}
