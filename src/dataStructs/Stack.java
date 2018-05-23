package dataStructs;

public class Stack {
	private Node head;
//	or remove and add to head using alrady made linked list class
	
	public Stack() {
		head = null;
	}
	
	public void push(String data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
	
	public String pop() {
		if (head == null) {
			return null;
		}
		Node temp = head;
		head = head.next;
		return temp.data;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	// Inner node class
	class Node{
		String data;
		Node next;
		
		public Node(String data) {
			this.data = data;
		}
	}
}
