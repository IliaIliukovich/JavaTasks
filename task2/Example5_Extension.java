package lesson150922;

public class Example5_Extension {

	
	static class Birds {
		void fly(){}
		void eat(){}
	}
	
	static class Singing_Birds extends Birds {
		void sing(){
			System.out.println("Chirik-Chirik!!!");
		}
	}
}
