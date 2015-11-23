package lesson150922;

public class Examble1_Specialization {
	
	static class RandomObjects{
		
		public void decorate(){
			System.out.println("this thing is decorated");
		
	}
	
	static class House extends RandomObjects{
		
	@Override
		public	void decorate() {
			System.out.println("this house looks smart");
		}
	
	}
	
	static class Car extends RandomObjects{

	@Override 
		public void decorate() {
			System.out.println("the car is cool");
		}	
	}
	
	static class Tree extends RandomObjects{

		@Override
		public void decorate() {
			System.out.println("the tree is OK");	
		}
	}
	
	public static void main(String[] args) {
		RandomObjects object = new RandomObjects();
		RandomObjects house = new House();
		RandomObjects tree = new Tree();
		RandomObjects car = new Car();
		object.decorate();
		house.decorate();
		tree.decorate();
		car.decorate();	
	}
}

}
