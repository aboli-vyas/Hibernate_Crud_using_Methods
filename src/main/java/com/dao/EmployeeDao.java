package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;

public class EmployeeDao {
	
//insert data

	public void insertData() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employee e = new Employee();
		e.setEmpName("Radha");
		e.setEmail("radha@gmail.com");
		e.setAddress("Dhule");
		e.setContact(995340899L);
		e.setDept("SrManager");
		e.setSalary("30LPA");

		ss.persist(e);
		tr.commit();
		

		System.out.println("Data is Inserted....");

	}
	
//delete data
	
	public void deleteData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		//delete from employee where id=2
		int id =3;
		
		Employee e1 =ss.get(Employee.class, id);
		//ss.delete(e1);
		ss.remove(e1);
		
		System.out.println("Data Deleted");
		
		tr.commit();
		ss.close();
	}
	
//Get particular record
	
	public void getParticular() {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Employee.class);
	
	SessionFactory sf =cfg.buildSessionFactory();
	Session ss= sf.openSession();
	Transaction tr =ss.beginTransaction();
	
	int id=1;
	Employee e1 = ss.get(Employee.class, id);
	System.out.println(e1);
	
	tr.commit();
	ss.close();
	
}
		
//update data
	
	public void updateData() {
	
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		//update employee set col=value where condi;
		int id = 5;
		
		Employee e1 = ss.get(Employee.class, id);
		e1.setEmpName("Rohan");
		e1.setEmail("rohan@gmail.com");
		e1.setAddress("Nashik");
		e1.setContact(9776549098L);
		e1.setDept("testes");
		e1.setSalary("10LPA");
		
		
		ss.merge(e1);
		System.out.println("Data is updated");
		
		tr.commit();
		ss.close();
	}

		
	}
	


