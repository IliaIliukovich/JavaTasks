package lesson150928;

public class Dog {

	public BrainState state = new BadMood();
	
	public void feed() {
		System.out.println("--> feed dog");
		state.feed(this);
	}
	
	public void stroke() {
		System.out.println("--> stroke dog");
		state.stroke(this);
	}
	
	
	public static void bite() {
		System.out.println("bites");		
	}

	public static void bark() {
		System.out.println("barks");
	}

	public static void eat() {
		System.out.println("eats");
	}

	public static void wag() {
		System.out.println("wags");
	}

}
