package hibernateproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class StudentDriver {
    
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Student s =new Student();
//		s.setName("abi");
//		s.setContact(845678922);
//		s.setEmail("abi123@gmail.com");
//		
//		//--------save sudent
//    	et.begin();
//	    em.persist(s);
//		et.commit(); 
		
	//	find student
//		Student s1 =em.find(Student.class, 4	);
//		System.out.println(s1.getName());
		
		//------delete student
		
//		Student studentD =em.find(Student.class, 3);
//		et.begin();
//		em.remove(studentD);
//    	et.commit();
		
		//------update student
		
//		Student studentU=em.find(Student.class, 2);
//		studentU.setEmail("kaviya12@gmail.com");
//		
//		et.begin();
//		em.merge(studentU);
//		et.commit();
		
		
		//-----onetoone relation
		
//		Laptop laptop=new Laptop();
//		laptop.setBrand("hp");
//		laptop.setRam(16);
//		
//		Student s=new Student();
//		s.setName("vi");
//		s.setContact(123456789);
//		s.setEmail("kavi@gmail.com");
//		s.setLaptop(laptop);
//		
//		et.begin();
//		em.persist(laptop);
//		em.persist(s);
//		et.commit();
		 
		//-----change ram value in laptop based on student laptop
		
//		Student s=em.find(Student.class,4);
//		Laptop exlaptop=s.getLaptop();
//		exlaptop.setRam(8);
//		
//		et.begin();
//		em.merge(exlaptop);
//		et.commit();
		
		
		//------remove laptop row
		
		Student s=em.find(Student.class,6);
		Laptop exlaptop=s.getLaptop();
		
		s.setLaptop(null);
		
		et.begin();
		em.merge(s);
		em.remove(exlaptop);
		et.commit();
		 
		
		
		
		
	}
}
