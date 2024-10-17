package hibernateprojectphone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PhoneDriver {
     public static void main(String[] args) {
		
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
 		EntityManager em=emf.createEntityManager();
 		EntityTransaction et=em.getTransaction();
 		
// 		Sim s1=new Sim();
// 		s1.setSimType("5G");
// 		s1.setSimCost(200);
// 		
// 		Sim s2=new Sim();
// 		s2.setSimType("4G");
// 		s2.setSimCost(150);
// 		
// 		Sim s3=new Sim();
// 		s3.setSimType("4G");
// 		s3.setSimCost(100);
// 		
// 		List<Sim> simcards=new ArrayList<Sim>();
// 		simcards.add(s1);
// 		simcards.add(s2);
// 		simcards.add(s3);
// 		
// 		Phone phone=new Phone();
// 		phone.setBrand("vivo");
// 		phone.setRam(8);
// 		phone.setStorage(126);
// 		phone.setPhoneSimCards(simcards);
// 		
// 		et.begin();
// 		em.persist(phone);
// 		et.commit();
 		
 		
 		
 		//----- save 2 sim cards without any phone
 		
// 		Sim s1=new Sim();
// 		s1.setSimType("5G");
// 		s1.setSimCost(200);
// 		
// 		Sim s2=new Sim();
// 		s2.setSimType("4G");
// 		s2.setSimCost(150);
// 
// 	    et.begin();
// 	    em.persist(s1);
// 	    em.persist(s2);
// 	    et.commit();
 		
 		
 		
 		//------save phone wihtout any simcards
 		
// 		Phone phone=new Phone();
// 		phone.setBrand("apple");
// 		phone.setRam(12);
// 		phone.setStorage(126);
// 		phone.setPhoneSimCards(null);
// 		
// 		et.begin();
// 		em.persist(phone);
// 		et.commit();
 		
 		
 		//-----establish a relation b/t sim and phone  from above one
 		
// 		Sim s1=em.find(Sim.class, 7);
// 		Sim s2=em.find(Sim.class, 8);
// 		
// 		List<Sim> simcards=new ArrayList<Sim>();
// 		simcards.add(s1);
// 		simcards.add(s2);
// 		
// 		Phone p=em.find(Phone.class, 3);
// 		p.setPhoneSimCards(simcards);
// 		
// 		et.begin();
// 		em.persist(p); use em.merge(p);
// 		et.commit();
 		
 		
 	//-------remove one sim card whos id=1 from phone without deleting it  from the database
 		
// 		Phone p=em.find(Phone.class,1);
// 		List<Sim> simcards=p.getPhoneSimCards();
// 		List<Sim> updatelist=new ArrayList<Sim>();
// 		
// 		for(Sim s:simcards)
// 		{
// 			if(s.getSimid()!=1)
// 			{
// 				updatelist.add(s);
// 			}
// 		}
// 		p.setPhoneSimCards(updatelist);
// 		et.begin();
// 		em.merge(p);
// 		et.commit();
 		
 		//------save a new sim to a phone whos id=2;
 		
 		Phone p=em.find(Phone.class, 2);
 		
 		Sim s2=new Sim();
 		s2.setSimType("5G");
 		s2.setSimCost(150);
 		
 		p.getPhoneSimCards().add(s2);
 		
 		et.begin();
 		em.merge(s2); 
 		et.commit();
 		
 		
 		
 		
	}
}
