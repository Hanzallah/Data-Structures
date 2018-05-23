package dataStructs;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addToTail("Hello");
		list.addToTail("World");
		
		list.removeFromHead();
		list.insert("yo", 0);
		list.insert("hey", 1);
		list.insert("burney", 2);
		list.insert("add", 3);
		list.delete(1);
		list.delete(2);
		list.print();
		
		System.out.println(list.isEmpty());
		System.out.println(list.getData(2));
	}
}
