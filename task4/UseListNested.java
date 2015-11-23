package lesson150924;

public class UseListNested {
	
public static void main(String[] args) {
		
		MyListNested<String> list = new MyListNested<>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		System.out.println(list);
		
		list.addLast("Null");
		list.addLast("Minus one");
		
		list.add("Four");
		
		System.out.println(list);

}
}
