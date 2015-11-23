package lesson150924;

public class MyListModified<T> {

	Node<T> first,last;
	
	public void add(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = first;
		first = node;
		if (last == null) {
			last = node;
		}
	}
	
	public void addLast(T data) {
		Node<T> node = new Node<T>();
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
		Node<T> temp = first;
		
		while (temp != null) {
			s+=temp.data;
			s+=", ";
			temp=temp.next;
		}
		
		return s+"]";
	}
	
}
