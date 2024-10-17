package springioc;

  
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class UserDriver {
     
	
	public static void main(String[] args) {
		 
//		ClassPathResource resource=new ClassPathResource("bean.xml");
//		
//		BeanFactory factory =new XmlBeanFactory(resource);
//		
//		Laptop lap=factory.getBean("laptop",Laptop.class);
//		
//		System.out.println(lap);
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
//		
//		User u1=context.getBean(User.class);
//		User u2=context.getBean(User.class);
//		User u3=context.getBean(User.class);
//		
//		System.out.println(u1);
//		System.out.println(u2);
//		System.out.println(u3);
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
		
		Laptop u=context.getBean(Laptop.class);
		System.out.println(u);
		
		
	}
}
