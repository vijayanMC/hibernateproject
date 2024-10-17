package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudenttDriver {
    public static void main(String[] args) {
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
 		EntityManager em=emf.createEntityManager();
 		EntityTransaction et=em.getTransaction();
 		
// 		
// 		Course c1=new Course();
// 		c1.setName("Java");
// 		c1.setPrice(8000);
// 		
// 		Course c2=new Course();
// 		c2.setName("Sql");
// 		c2.setPrice(5000);
// 		
// 		Course c3=new Course();
// 		c3.setName("Web-Tech");
// 		c3 .setPrice(7000);
// 		
// 		Studentt s1=new Studentt();
// 		s1.setName("ajay");
// 		s1.setContact(834567892);
// 		s1.setEmail("ajay123@gmail.com");
 		
// 		List<Course> course1 =new ArrayList<Course>();
// 		course1.add(c1);
// 		course1.add(c3);
// 		s1.setCourse(course1);
// 		
// 		Studentt s2=new Studentt();
// 		s2.setName("abi");
// 		s2.setContact(903545678);
// 		s2.setEmail("abi123@gmail.com");
// 		
// 		List<Course> course2 =new ArrayList<Course>();
// 		course2.add(c1);
// 		course2.add(c2);
// 		s2.setCourse(course2);
// 		
// 		et.begin();
// 		em.persist(s1);
// 		em.persist(s2);
// 		et.commit();
 		
 		//----------add a student (s3) who is taking course2(c2)
 		
 		Course c1=new Course();
 		c1.setName("Java");
 		c1.setPrice(8000);
 		
 		Course c2=new Course();
 		c2.setName("Sql");
 		c2.setPrice(5000);
 		
 		Course c3=new Course();
 		c3.setName("Web-Tech");
 		c3 .setPrice(7000);
 		
// 		Studentt s1=new Studentt();
// 		s1.setName("nirmal");
// 		s1.setContact(994567892);
// 		s1.setEmail("nirmal123@gmail.com");	
// 		
// 		
// 		List<Course> course1 =new ArrayList<Course>();
// 		
// 		course1.add(c2);
// 		s1.setCourse(course1);
// 		
// 		et.begin();
// 		em.persist(s1);
// 		et.commit();
 		
 		//------add a student who take all 3 course
 		
// 		Studentt s1=new Studentt();
// 		s1.setName("santhosh");
// 		s1.setContact(994567892);
// 		s1.setEmail("santhosh123@gmail.com");	
//
// 		List<Course> course1 =new ArrayList<Course>();
// 		
// 		course1.add(c1);
// 		course1.add(c2);
// 		course1.add(c3);
// 		s1.setCourse(course1);
// 		
// 		et.begin();
// 		em.persist(s1);
// 		et.commit();
 		
 		//----remove course c1 from from student s2
 		
 		Studentt p=em.find(Studentt.class,1);
 		List<Course> course=p.getCourse();
 		List<Course> updatelist=new ArrayList<Course>();
 		
 		for(Course s:course)
 		{ 
 			if(s.getId()!=1)
 			{
 				updatelist.add(s);
 			}
 		}
 		p.setCourse(updatelist);
 		et.begin();
 		em.merge(p);
 		et.commit();
 		
	}
}
