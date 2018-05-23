package dataStructs;

public class QueueTest {
	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.add("Hello");
		q.add("World");
		
		System.out.println(q.peek());
		
		System.out.println(q.remove());
		
		System.out.println(q.peek());
		System.out.println(q.remove());
	}
}
