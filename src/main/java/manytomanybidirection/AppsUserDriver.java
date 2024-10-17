package manytomanybidirection;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernateproject.User;

public class AppsUserDriver {
      
	public static void main(String[] args) {
		
		   EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
		   EntityManager em=emf.createEntityManager();
		   EntityTransaction et=em.getTransaction();
		   
//		   Application app1=new Application();
//		   app1.setName("google");
//		   app1.setCost(1000);
//		   
//		   
//		   Application app2=new Application();
//		   app2.setName("chrome");
//		   app2.setCost(1050);
//		   
//		   Application app3=new Application();
//		   app3.setName("uc browser");
//		   app3.setCost(1100);
//		   
//		   Userr u1=new Userr();
//		   u1.setName("nirmal");
//		   u1.setEmail("nirmal123@gamil.com");
//		   
//		   
//		   Userr u2=new Userr();
//		   u2.setName("ajay");
//		   u2.setEmail("ajay123@gamil.com");
//		   
//		   Userr u3=new Userr();
//		   u3.setName("abi");
//		   u3.setEmail("abi123@gamil.com");
//		   
//		   
//		   
//		   List<Userr> users1=new ArrayList<Userr>();
//		   users1.add(u1);
//		   users1.add(u3);
//		   
//		   app1.setUsers(users1);
//		   
//		   List<Userr> users2=new ArrayList<Userr>();
//		   users2.add(u1);
//		   users2.add(u2);
//		   users2.add(u3);
//		   
//		   app2.setUsers(users2);
//		   
//		   List<Userr> users3=new ArrayList<Userr>();
//		   users3.add(u3);
//		   
//		   app3.setUsers(users3);
//		   
//		   List<Application> apps1=new ArrayList<Application>();
//		   apps1.add(app2);
//		   
//		   u1.setApps(apps1);
//		   
//		   
//		   List<Application> apps2=new ArrayList<Application>();
//		   apps2.add(app1);
//		   apps2.add(app2);
//		   
//		   u2.setApps(apps2);
//		   
//		   
//		   List<Application> apps3=new ArrayList<Application>();
//		   apps3.add(app1);
//		   apps3.add(app2);
//		   apps3.add(app3);
//		   
//		   u3.setApps(apps3);
//		   
//		   
//		   et.begin();
//		   em.persist(app3);
//		   et.commit();
		   
		   
		   
		   // -------------------add one app(app4) for user (users3)
		   
		   
//		   Userr u=em.find(Userr.class, 3);
//		   
//		   Application app4=new Application();
//		   app4.setName("you tube");
//		   app4.setCost(500);
//		   
//		   List<Application> apps3=new ArrayList<Application>();
//		   apps3.add(app4);
//		   
//		   u.setApps(apps3);
//		   
//		   et.begin();
//		   em.persist(app4);
//		   et.commit();
		   
		   //---------from user2 remove  app(name =google)userid=2
		   
		   
//		   Userr u=em.find(Userr.class, 2);
//		   
//		   List<Application> apps=u.getApps();
//		   List<Application> newapp=new ArrayList<Application>();
//		   
//		   for(Application aps:apps)
//		   {
//			   if(aps.getName().equals("google"))
//			   {
//				   aps.getUsers().remove(u);
//				   et.begin();
//				   em.merge(aps);
//				   et.commit();
//			   }else {
//				   newapp.add(aps);
//			   }
//		   }
//		    
//		   u.setApps(newapp);
//		   et.begin();
//		   em.merge(u);
//		   et.commit();
		   
		   
		   
		   //======delete an app with app id=3
		   
		   Application app=em.find(Application.class,3);
		   List<Userr> users=app.getUsers();
		   
		   for(Userr u:users)
		   {
			   List<Application> apps=u.getApps();
			   List<Application> newapp=new ArrayList<Application>();
			   
			   for(Application aps:apps)
			   {
				   if(!aps.equals(app))
				   {
					   newapp.add(aps);
				   }
			   }
			   u.setApps(newapp);
			   et.begin();
			   em.merge(u);
			   et.commit();
		   }
		   app.setUsers(null);
		   et.begin();
		   em.remove(app);
		   et.commit();
	}
}
