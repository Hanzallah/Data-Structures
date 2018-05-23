package dataStructsJava;

import java.util.PriorityQueue;

public class PriorityQueueJava {
	public static void main(String[] args) {
		PriorityQueue<Integer> priority = new PriorityQueue<>();
		
		priority.add(1);
		priority.add(2);
		priority.add(932);
		priority.add(73);
		priority.add(32);
		priority.add(432);
		
		System.out.println(priority.peek());
		
		while (priority.size() > 0) {
			System.out.println(priority.remove());
		}
		
	}
}
