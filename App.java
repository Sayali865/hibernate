package com.hibernatedemo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
      Configuration cfg = new Configuration();
      cfg.configure("hibernate.cfg.xml");
      
      SessionFactory sessionfactory = cfg.buildSessionFactory();
      
      Session session = sessionfactory.openSession();
      
      Transaction tr = session.beginTransaction();
      
      Student s = new Student();
      s.setSid(103);
      s.setName("Vaishnavi");
      s.setAddress("Shahunagar");
      s.setPhoneno(981744567);
      s.setMarks(80);
      
      
      session.save(s);
      tr.commit();
      session.close();
      System.out.println("Student added");
    
      
    }
}
