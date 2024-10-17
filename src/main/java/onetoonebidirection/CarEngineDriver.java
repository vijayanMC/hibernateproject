package onetoonebidirection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarEngineDriver {
   public static void main(String[] args) {
	
	   EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
	   EntityManager em=emf.createEntityManager();
	   EntityTransaction et=em.getTransaction();
		
		
//	   Car c1=new Car();
//	   c1.setColor("yellow");
//	   c1.setName("hyundai");
//	   
//	   Engine e1 =new Engine();
//	   e1.setType("petrol");
//	   e1.setCc(120);
//	   
//	   e1.setCar(c1);
//	   c1.setEngine(e1);
//	   
//	   et.begin();
//	   em.persist(e1);
//	   et.commit();
	   
	   
	   //------by using car id change the engine type
	   
//	   Car c1=em.find(Car.class, 1);
//	   c1.getEngine().setType("Ev");
//	   
//	   et.begin();
//	   em.merge(c1);
//	   et.commit();
//	   
	   
	   //------by using car id delete the engine
	   
//	   Car c1=em.find(Car.class,1);
//	   Engine e1=c1.getEngine();
//	   e1.setCar(null);
//	   c1.setEngine(null);
//	   
//	   et.begin();
//	   em.merge(c1);
//	   em.remove(e1);
//	   et.commit();
	   
	   //------save new engine
	   
//	   Engine e1 =new Engine();
//	   e1.setType("disel");
//	   e1.setCc(120);
//	   
//	   et.begin();
//	   em.persist(e1);
//	   et.commit();
	   
	   
	   //-------establish the relationship b/t car and engine
	   
//	   Car c1=em.find(Car.class, 1);
//	   
//	   Engine e1=em.find(Engine.class, 3);
//	   
//	   e1.setCar(c1);
//	   c1.setEngine(e1);
//	   
//	   et.begin();
//	   em.merge(c1);
//	   et.commit();
	   
	   
	   //-------want to print the data of car id=1 
	   
	   Car c1=em.find(Car.class,1);
	   
	   System.out.println(c1);
	   
	   
}
}
