package lesson150928;

public class GoodMood implements BrainState{

	private static final int MAX_STROKES = 3;
	int count;
	
	@Override
	public void feed(Dog dog) {
		Dog.eat();
		Dog.wag();
		
	}

	@Override
	public void stroke(Dog dog) {
		Dog.wag(); 
		Dog.bark();
		count++;
		if (count>=MAX_STROKES) {
			dog.state = new BadMood();
		}
	}
		
}
