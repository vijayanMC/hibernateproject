package animalcage;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal{
	
	public void sound() {
		System.out.println("dog is barking");
	}


}
