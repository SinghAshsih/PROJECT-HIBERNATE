package com.ashish;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ashish.modal.Student;

public class HQL_GetPartialObject {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("com/aa/hibernate/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Query<Student> qry = session.createQuery("select s.id,s.name from student");

		List<Student> list = qry.list();

		System.out.println("Total Number of records " + list.size());

		Iterator<Student> itr = list.iterator();

		while (itr.hasNext()) {
			Student student = itr.next();

			System.out.println("StudentId:" + student.getId() + ",   StudentName: " + student.getName());

		}
	}
}