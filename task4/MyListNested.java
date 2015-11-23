package lesson150924;

public class MyListNested<T> {
	
	private class Node1 {
		T data;
		Node1 next;
	}
		
	Node1 first,last;
	
	public void add(T data) {
		Node1 node = new Node1();
		node.data = data;
		node.next = first;
		first = node;
		if (last == null) {
			last = node;
		}
	}
	
	public void addLast(T data) {
		Node1 node = new Node1();
		node.data = data;
		if (last != null) {
			last.next = node;
		}
		last = node;
		if (first == null) {
			first = node;
		}
	}
	
	
	@Override
	public String toString() {
		
		String s = "[";
		Node1 temp = first;
		
		while (temp != null) {
			s+=temp.data;
			s+=", ";
			temp=temp.next;
		}
		
		return s+"]";
	
		}
}
