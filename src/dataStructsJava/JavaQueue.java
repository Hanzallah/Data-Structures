package dataStructsJava;
import java.util.*;

public class JavaQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		// FIFO
		queue.add(1);
		queue.add(2);
		queue.add(932);
		queue.add(73);
		queue.add(32);
		queue.add(432);
		
		System.out.println(queue.peek());
		
		while (queue.size() > 0) {
			System.out.println(queue.remove());
		}
	}
}
