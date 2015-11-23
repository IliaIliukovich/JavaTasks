package lesson150922;

public class Example2_Specification {
	
	static abstract class RandomObjects{
		
		abstract void decorate();
		
	}
	
	static class House extends RandomObjects{
		
	@Override
		void decorate() {
			System.out.println("this house looks smart");
		}
	
	}
	
	static class Car extends RandomObjects{

	@Override 
		void decorate() {
			System.out.println("the car is cool");
		}	
	}
	
	static class Tree extends RandomObjects{

		@Override
		void decorate() {
			System.out.println("the tree is OK");	
		}
	}
	public static void main(String[] args) {
		RandomObjects house = new House();
		RandomObjects tree = new Tree();
		RandomObjects car = new Car();
		house.decorate();
		tree.decorate();
		car.decorate();	
	}
}
