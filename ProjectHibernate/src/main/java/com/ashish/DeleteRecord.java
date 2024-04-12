package com.ashish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecord {
	public static void main(String[] args) {

		// Making Configuration object
		Configuration cfg = new Configuration();
		cfg.configure("com/ashish/hibernate.cfg.xml");

		// Building session factory object
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Object object = session.load(Student.class, new Integer(104));
		Student student = (Student) object;
		Transaction txt = session.beginTransaction();

		// Delete student
		session.delete(student);
		System.out.println("Data delete successfully.....!!");
		txt.commit();
		session.close();
		factory.close();

	}
}
