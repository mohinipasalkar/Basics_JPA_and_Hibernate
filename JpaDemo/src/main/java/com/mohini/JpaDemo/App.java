package com.mohini.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");        
        EntityManager em = emf.createEntityManager();
        
    //    Customers customer =  em.find(Customers.class, 1);
    //    System.out.println(customer.toString());
        
        //Creating new customer
        Customers c = new Customers();
        c.setCid(7);
        c.setCname("mizu");
        c.setDish("cake");
        em.getTransaction().begin();
           em.persist(c);
        em.getTransaction().commit();
      System.out.println(c);   
        
    }
}
