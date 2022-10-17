package com.cg.main;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpaj.entities.Employee;
import com.cg.jpaj.entities.Manager;

public class Main
{
   public static void main(String arg[])
   {
   EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
   EntityManager em= factory.createEntityManager();
   em.getTransaction().begin();
   
   //create one employee
  
   Employee employee=new Employee();
   employee.setName("Suraj"); 
   employee.setSalary(7000); 
   
   em.persist(employee); 
   
   //create one Manager
   Manager manager = new Manager();
   manager.setName("prajkta");
   manager.setSalary(10000);
   manager.setDepartmentName("IT");
   em.persist( manager);
   
   em.getTransaction().commit();
   
   System.out.println("sucessfully added one employee and manager in database");
   
   em.close();
   factory.close();
  
 
   }
   
}
