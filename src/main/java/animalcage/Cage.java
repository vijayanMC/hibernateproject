package animalcage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cage {
     
	@Qualifier(value="cat")
	@Autowired
	Animal animal;
	
	public void cageAnimal()
{
		animal.sound();
	}
}
