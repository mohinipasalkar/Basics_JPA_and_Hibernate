package com.mohini.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car c = new Car();
        c.setCarid(1);
        c.setCarname("TATA");
        c.setColor("black");
        
        Configuration conf = new Configuration();
        
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        session.save(c);
    }
}
