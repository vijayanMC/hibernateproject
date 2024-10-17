package hibernateproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDriver {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		//-----save 3 users with 3 adhar
		
//		Aadhar a2=new Aadhar();
//		a2.setAddress("coimbatore");
//		a2.setNumber(99444032);
//		
//		
//		User s1=new User();
//		s1.setName("vijay");
//		s1.setContact(123456789);
//		s1.setA(a2);
//		
//		et.begin();
//		em.persist(a2);
//		em.persist(s1);
//		et.commit();
		
 	
		
		//------update address of user who's userid=2
		
		
//		User s=em.find(User.class,2);
//		Aadhar a=s.getA();
//		a.setAddress("bangalore");
//		
//		et.begin();
//		em.merge(a);
//		et.commit();
		
		
		//-----delete user with id=1 along with aadhar
		
		
//		User s=em.find(User.class,3);
//		Aadhar a=s.getA();
//		
//		s.setA(null);
//		
//		et.begin();
//		em.merge(s);
//		em.remove(a);
//		em.remove(s);
//		et.commit();
		
		//-----by using CascadeType
		
		
		//add
//		Aadhar a2=new Aadhar();
//		a2.setAddress("coimbatore");
//		a2.setNumber(99444032);
//		
//		User s1=new User();
//		s1.setName("vijay");
//		s1.setContact(123456789);
//		
//		s1.setA(a2);
//		et.begin();
//		em.persist(s1);
//		et.commit();
	   
		//update address
		
//		User s=em.find(User.class,3);
//		s.getA().setAddress("chennai");
//		
//		et.begin();
//		em.merge(s);
//		et.commit();
		
		//delete by user id
		
		User s=em.find(User.class, 4);
		et.begin();
		em.remove(s);
		et.commit();
}

}
