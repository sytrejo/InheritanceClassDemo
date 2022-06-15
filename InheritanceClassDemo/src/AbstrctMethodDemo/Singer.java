package AbstrctMethodDemo;

//concrete class has no 'concrete' keyword 
public class Singer extends Performer {
	
	//to resolve the conflict between and abstract class and a concrete subclass
	//add the method body to the concrete class to be implemented.
	//use the override documentation as a best practice
	//if the override is included the complier will check for a supertype
	@Override
	public void perform() {
		System.out.println("Sing beautifully");
	}

}
