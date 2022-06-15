package inheritanceclasses;

public class Pomegranate {
	
	//attributes
	private String color;
	private boolean hasSeeds;
	
	//constructor
	public Pomegranate() {
		this.color ="red";
		this.hasSeeds= true;
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
		return "A" + this.color + "pomegranate with hasSeeds = " + this.hasSeeds;
	}
	
	

}
