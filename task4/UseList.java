package lesson150924;

public class UseList {
	
	public static void main(String[] args) {
		
		MyListModified<String> list = new MyListModified<>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		System.out.println(list);
		
		list.addLast("Null");
		list.addLast("Minus one");
		System.out.println(list);
	}

}
