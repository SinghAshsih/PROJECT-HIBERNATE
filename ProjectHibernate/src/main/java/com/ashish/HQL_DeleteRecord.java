package com.ashish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ashish.modal.Student;

public class HQL_DeleteRecord {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("/com/ashish/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Query<Student> query = session.createQuery("delete from Product u where u.productId=:55");
		Transaction tx = session.beginTransaction();
		query.setParameter("55", 0);

		int result = query.executeUpdate();

		System.out.println("Command successfully executed....");
		System.out.println("Numer of records effected due to delete query" + result);
		tx.commit();
		session.close();

		session.close();

	}

}