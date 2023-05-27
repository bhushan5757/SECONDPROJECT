package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestMain {
	public static void main(String[] args) {
		
	
Configuration cf=new Configuration().configure("hibernate.cfg.xml");
SessionFactory sf=cf.buildSessionFactory();
Session s=sf.openSession();

Student sd=new Student();
sd.setName("Bhushan");
sd.setCity("pune");
sd.setStd(1);


s.save(sd);
s.close();
sf.close();
}
}