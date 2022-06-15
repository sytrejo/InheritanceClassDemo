package inheritanceclasses;

//making an abstract class it means nobody can create an instance of fruit
//you need to create a specific type of fruit/
public abstract class Fruit {
	
	protected String color;
	protected boolean hasSeeds;
	
	//different values for different instances
	//create a constructor that takes in the attributes
	public Fruit(String color, boolean hasSeeds) {
		this.color = color;
		this.hasSeeds = hasSeeds;
	}
	
	
	//if you don't create your own constructor the compiler will create one
//	public Fruit() {
//		super();
//	}
	
	
	public String getColor() {
		return color;
	}
	
	public boolean isHasSeeds() {
		return hasSeeds;
	}
	

	@Override
	public String toString() {
		return "A " + this.color + " fruit with hasSeeds = " + this.hasSeeds;
	}
	
	
	//this.getClass().getSimpleName()
	

}
