package animalcage;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnimalDriver {
    
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Cage cage=context.getBean("cage",Cage.class);
		cage.cageAnimal();
				
				
	}
}
