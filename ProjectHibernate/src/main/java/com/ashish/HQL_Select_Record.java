package com.ashish;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.ashish.modal.Student;

public class HQL_Select_Record {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		cfg.configure("/com/ashish/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Query<Student> qry = session.createQuery("from Student student");

		List<Student> studentList = qry.list();

		System.out.println("Total Number of records " + studentList.size());

		Iterator<Student> itr = studentList.iterator();

		while (itr.hasNext()) {
			Object obj = itr.next();
			Student student = (Student) obj;

			System.out.println("studentId : " + student.getId() + " studentName : " + student.getName());

		}
	}
}
