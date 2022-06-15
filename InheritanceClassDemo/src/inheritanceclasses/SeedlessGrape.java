package inheritanceclasses;

public class SeedlessGrape {
	
	private String color;
	private boolean hasSeeds;
	
	public SeedlessGrape() {
		this.color = "white";
		this.hasSeeds = false;
	}

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
		return "A" + this.color + "seedlessGrape with hasSeeds = " + this.hasSeeds;
	}
	
	

}
