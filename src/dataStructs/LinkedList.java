package dataStructs;

import java.util.NoSuchElementException;

/**
 * A doubly linked list
 * @author Hanzallah Burney
 *
 */
public class LinkedList {
	private Node head;
	private Node tail;
	
	public LinkedList() {
		head = null;
		tail = null;
	}
	
	/**
	 * Adds a string to the head of the list
	 * @param data
	 */
	public void addToHead( String data) {
		if (head == null) {
			head = new Node(data);
			head.next = null;
			tail = head;
			tail.prev = null;
		}
		else {
			Node temp = new Node(data);
			temp.next = head;
			head.prev = temp;
			head = temp;	
		}
	}
	
	/**
	 * Adds a string to the tail to the list
	 * @param data
	 */
	public void addToTail( String data) {
		if (tail != null) {
			Node temp = new Node( data);
			tail.next = temp;
			tail.next.prev = tail;
			tail = temp;
		}
		else {
			addToHead( data);
		}
	}
	
	/**
	 * Removes the string at the head of the list
	 * @return
	 */
	public String removeFromHead() {
		if (head == null) {
			return null;
		}
		else if (head.next == null) {
			Node temp = head;
			head = null;
			return temp.data;
		}
		else {
			Node temp = head;
			head = head.next;
			head.prev = null;
			return temp.data;
		}
	}
	
	/**
	 * Adds a string at a specified index
	 * @param data
	 * @param index
	 */
	public void insert(String data, int index) {
		if (index == 0) {
			addToHead( data);
		}
		else {
			try {
				Node current = head;
				Node toInsert = new Node( data);
				Node temp = current;
				
				for (int i = 0; i < index; i++) {
					temp = current;
					current = current.next;
				}
				
				temp.next = toInsert;
				toInsert.next = current;
				current.prev = toInsert;
			} catch(NullPointerException e) {
				System.out.println("The index does not exist");
			}
		}
	}
	
	public String delete(int index) {
		if (index == 0) {
			return removeFromHead();
		}
		else {
			try {
				Node current = head;
				Node temp = current;
				Node currNext = current.next;
				
				for (int i = 0; i < index; i++) {
					temp = current;
					current = current.next;
					currNext = current.next;
				}
				temp.next = currNext;
				currNext.prev = temp;
				current.next = null;
				current.prev = null;
				return current.data;
			} catch(NullPointerException e) {
				return "The index does not exist";
			}
		}
	}
	
	/**
	 * Checks if the list is empty or not
	 * @return
	 */
	public boolean isEmpty(){
		return head == null;
	}
	
	/**
	 * Get the data from a specific index
	 * @param index
	 * @return
	 */
	public String getData( int index) {
		Node current = head;
		try {
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			return current.data;
		} catch (NullPointerException e) {
			return null;
		}
	}
	
	/**
	 * Prints the list
	 */
	public void print() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	
	/**
	 * Prints the list in reverse order
	 */
	public void printReverse() {
		Node current = tail;
		while(current != null) {
			System.out.println(current.data);
			current = current.prev;
		}
	}
	
	
	// Inner node class
	class Node {
		Node next;
		Node prev;
		String data;
		
		public Node(String data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	interface ListIterator{
		String next();
		boolean hasNext();
		void add(String data);
		void remove();
		void set(String data);
	}
	
	class LinkedListIterator implements ListIterator{
		Node current;
		Node prev;
		boolean nextPresent;
		
		public LinkedListIterator() {
			current = null;
			prev = null;
			nextPresent = false;
		}
		
		public String next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			prev = current;
			nextPresent = true;
			
			if (current == null) {
				current = head;
			}
			else {
				current  = current.next;
			}
			return current.data;
		}
		
		public boolean hasNext() {
			if (current == null) {
				return head != null;
			}
			else {
				return current.next != null;
			}
		}
		
		public void add(String data) {
			if (current == null) {
				addToHead(data);
				current = head;
			}
			else {
				Node temp = new Node(data);
				temp.next = current.next;
				current.next = temp;
				temp.prev = current;
				current = temp;
			}
			nextPresent = false;
		}
		
		public void remove() {
			if (!nextPresent) {
				throw new IllegalStateException();
			}
			
			if (current == head) {
				removeFromHead();
			}
			else {
				prev.next = current.next;
				current.next.prev = prev;
			}
			current = prev;
			nextPresent = false;
		}
		
		public void set(String data) {
			if (!nextPresent) {
				throw new IllegalStateException();
			}
			current.data = data;
		}
		
	}
}
