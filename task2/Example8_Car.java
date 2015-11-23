package lesson150922;

public class Example8_Car implements Example8_Interface1,Example8_Interface2 {

	@Override
	public void open() {
		System.out.println("The car opens");
	}

	@Override
	public void lock() {
		System.out.println("The car is closed");
	}

	@Override
	public void drive() {
		System.out.println("The car drives");
	}

	@Override
	public void fuel() {
		System.out.println("Petrol tank is full");
	}
	
}
