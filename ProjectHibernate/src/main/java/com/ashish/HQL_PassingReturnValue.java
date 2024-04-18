package com.ashish;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ashish.modal.Student;

public class HQL_PassingReturnValue {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("/com/ashish/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		// By using Lable
		Query<Student> query = session.createQuery("from Student s where s.name=?3");

		query.setParameter(3, "Ravi");

		List<Student> list = query.list();

		System.out.println("Total number of records: " + list.size());

		Iterator<Student> itr = list.iterator();

		while (itr.hasNext()) {
			Object obj = itr.next();

			Student student = (Student) obj;

			System.out.println("StudentId: " + student.getId());
			System.out.println("StudentName: " + student.getName());
		}
	}
}