package hibernatemanytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SimmDriver {

public static void main(String[] args) {
		
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
 		EntityManager em=emf.createEntityManager();
 		EntityTransaction et=em.getTransaction();
 		
 		
 		
 }
}
