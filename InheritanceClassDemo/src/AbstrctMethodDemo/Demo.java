package AbstrctMethodDemo;

public class Demo {
	
	public static void main(String[] args) {
		Performer p = new Singer();
		p = new Dancer(); 
		
		//the p reference can point to either a SInger or a Dancer (or any other Performer)
		p.perform();
	}

}
