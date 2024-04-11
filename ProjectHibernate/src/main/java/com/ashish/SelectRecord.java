package com.ashish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/ashish/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o = session.load(Student.class, new Integer(104));
		Student s = (Student) o;
		// For loading Transaction scope is not necessary...
		System.out.println("Loaded object student name is___" + s.getName());
		System.out.println("Object Loaded successfully.....!!");
		session.close();
		factory.close();
	}
}