package lesson150922;

public class Example6_Restriction {
	
	static class Animal {
		void run(){}
		void eat(){}
		void fly(){}
	}
	
	static class Hen extends Animal {
		@Override
		void run() {
		}
		@Override
		void eat() {
		}
		@Override
		void fly() {
			throw new UnsupportedOperationException();
		}
	}
}
