package inheritanceclasses;

public class Banana {
	
	private String color;
	private boolean hasSeeds;
	
	//constructor
	public Banana() {
		this.color ="Yellow" ;
		this.hasSeeds =true;
	}

	//setters and getters
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean getHasSeeds() {
		return hasSeeds;
	}

	public void setHasSeeds(boolean hasSeeds) {
		this.hasSeeds = hasSeeds;
	}
	
	@Override
	public String toString() {
		return "A" + this.color + "banana with hasSeeds = " + this.hasSeeds;
	}


}
