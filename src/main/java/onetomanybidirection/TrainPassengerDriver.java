 package onetomanybidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrainPassengerDriver {
  
	public static void main(String[] args) {
		
		   EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
		   EntityManager em=emf.createEntityManager();
		   EntityTransaction et=em.getTransaction();
		   
		   //----save a train with 3 passenger
		   
//		   Passenger p1=new Passenger();
//		   p1.setAge(21);
//		   p1.setName("ravi");
//		   
//		   Passenger p2=new Passenger();
//		   p2.setAge(20);
//		   p2.setName("kavin");
//		   
//		   Passenger p3=new Passenger();
//		   p3.setAge(19);
//		   p3.setName("vimal");
//		   
//		   
//		   List<Passenger> l1=new ArrayList<Passenger>();
//		   l1.add(p1);
//		   l1.add(p2);
//		   l1.add(p3);
//		   
//		  
//		   
//		   Train t1=new Train();
//		   t1.setTrainno(2);
//		   t1.setNoofcoaches(20);
//		   
//		   t1.setPassenger(l1);
//		   p1.setTrain(t1);
//		   p2.setTrain(t1);
//		   p3.setTrain(t1);
//		   
//		   
//		   et.begin();
//		   em.persist(t1);
//		   et.commit();
		   
		   
		   //-----add a passenger to an existing train
		   
//		   Train t=em.find(Train.class, 1);
//		   
//		   
//		   Passenger p3=new Passenger();
//		   p3.setAge(19);
//		   p3.setName("loki");
//		   p3.setTrain(t);
//		   
//		   List<Passenger> a=t.getPassenger();
//		   a.add(p3);
//		   t.setPassenger(a);
//		  
//		   et.begin();
//		   em.persist(p3);
//		   em.merge(t);
//		   et.commit();
		   
		   //-----remove a passenger from existing train
		   
//		   Train n=em.find(Train.class, 2);
//		   
//		   List<Passenger> l1=n.getPassenger();
//		   List<Passenger> l2=new ArrayList<Passenger>();
//		   
//		   for(Passenger p:l1)
//		   {
//			   if(p.getId()!=6)
//			   {
//				   l2.add(p);
//			   }
//			   
//		   }
//		   n.setPassenger(l2);
//		   et.begin();
//		   em.merge(n);
//		   et.commit();
		   
//		   Passenger p=em.find(Passenger.class,6);
////		   p.setTrain(null);
//		   
//		   et.begin();
////		   em.merge(p);
//		   em.remove(p);
//		   et.commit();
		   
		   
		   //---update train number using train id
		   
//		   Train t=em.find(Train.class,2);
//		   t.setTrainno(100);
//		   et.begin();
//		   em.merge(t);
//		   et.commit();
		   
		   
		   //--------save a train with no passenger
		   
//		   Train t1=new Train();
//		   t1.setTrainno(2);
//		   t1.setNoofcoaches(50);
//		   t1.setPassenger(null);
//		   
//		   et.begin();
//		   em.persist(t1);
//		   et.commit();
		   
		   
		   //---------assign train 2 to a person who is travelling in train1
		   
		   Train t1=em.find(Train.class,2);
		   Train t2=em.find(Train.class, 3);
		   
		   List<Passenger> l1=t1.getPassenger();
		   //l1.get(7).setTrain(t2);;
		   
//		   for(Passenger p:l1)
//			   {
//				   if(p.g)
//				   {
//					   l2.add(p);
//				   }
//				   
//			   } 
		   
		   
//			   n.setPassenger(l2);
//			   et.begin();
//			   em.merge(n);
//			   et.commit();
//		   
		   
//     	   et.begin();
//		   em.merge(t2);
//		   et.commit();
		   
		  
	}	   
}
