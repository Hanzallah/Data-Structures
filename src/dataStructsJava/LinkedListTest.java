package dataStructsJava;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("James");
		list.add("Henry");
		list.add("Tom");
		list.add("John");
		
		ListIterator<String> iterator = list.listIterator();
		
		// after first two value add the name
		iterator.next();
		iterator.next();
		iterator.add("Burney");
		
		// after one value remove the name
		iterator.next();
		iterator.remove();
		
		System.out.println(list);
		
	}
}
