package dataStructs;

public class CircularArrayQueueTest {
	public static void main(String[] args) {
		CircularArrayQueue q = new CircularArrayQueue();
		q.add("hello");
		q.add("world");
		
		System.out.println(q.remove());
	}
}
