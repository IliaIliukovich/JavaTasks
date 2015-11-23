package lesson150928;

public class BadMood implements BrainState {
	
	@Override
	public void feed(Dog dog) {
		Dog.eat();
		dog.state = new GoodMood();
	}

	@Override
	public void stroke(Dog dog) {
		Dog.bite();
	}
}