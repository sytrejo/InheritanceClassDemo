package inheritanceclasses;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		Apple apple = new Apple();
		Banana banana = new Banana();
		Pomegranate pomegranate = new Pomegranate();
		SeedlessGrape seedlessGrape = new SeedlessGrape();
		
		//Print out the Fruits
		//will only print out the hash code
		System.out.println(apple);
		System.out.println(banana);
		System.out.println(pomegranate);
		System.out.println(seedlessGrape);
		
		//print out the properties of the apple
//		System.out.println("The apple has seeds:" + apple.getHasSeeds());
		
		//Now that all fruits share a type we can add them to a list
		List<Fruit> fruits = new ArrayList<Fruit>();
		
		fruits.add(apple);
		
		System.out.println(fruits);
		
		//creating a fruit without specific kind
//		Fruit someFruit = new Fruit("Green" , false);
		
		
	}

}
