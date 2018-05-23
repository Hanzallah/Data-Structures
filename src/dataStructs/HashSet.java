package dataStructs;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashSet {
	private Node[] bucket;
	private int size;
	
	public HashSet(int bucketSize) {
		bucket = new Node[bucketSize];
		size = 0;
	}
	
	
	public boolean contains(String data) {
		int h = data.hashCode();
		if (h < 0) {
			h = -h;
		}
		h = h % bucket.length;
		
		Node current = bucket[h];
		
		while (current != null) {
			if (current.data.equals(data)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	
	
	public boolean add(String data) {
		
		// compute hashcode
		int h = data.hashCode();
		if (h < 0) {
			h = -h;
		}
		h = h % bucket.length;
		
		// go to index
		Node current = bucket[h];	
		
		// if data already present return false
		while (current != null) {
			if (current.data.equals(data)) {
				return false;
			}
		}
		
		// add node to current index
		Node temp = new Node(data);
		temp.next = bucket[h];
		bucket[h] = temp;
		size++;
		return true;
	}
	
	
	public boolean remove(String data) {
		// compute hashcode
		int h = data.hashCode();
		if (h < 0) {
			h = -h;
		}
		h = h % bucket.length;
		
		
		Node current = bucket[h];	
		Node previous = null;
		
		while (current != null) {
			if (current.data.equals(data)) {
				if (previous == null) {
					bucket[h] = current.next;
				}
				else {
					previous.next = current.next;
				}
				size--;
				return true;
			}
			previous = current;	
			current  = current.next;
		}
		return false;
	}
	
	public int getSize() {
		return size;
	}
	
	
	public Iterator<String> iterator() {
		return new HashSetIterator();
	}
	
	class HashSetIterator implements Iterator<String>{
		private int buckets;
		private Node current;
		
		public HashSetIterator() {
			current = null;
			buckets = -1;
		}
		
		public boolean hasNext() {
			if (current != null && current.next != null) {
				return true;
			}
			
			for (int i = buckets + 1; i < bucket.length; i++) {
				if (bucket[i] != null) {
					return true;
				}
			}
			return false;
		}
		
		
		public String next() {
			if (current != null && current.next != null) {
				current = current.next;
			}
			else {
				do {
					buckets++;
					if (buckets == bucket.length) {
						throw new NoSuchElementException();
					}
					current = bucket[buckets];
				} while (current == null);
			}
			return current.data;
		}
		

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}
	
	
	// Inner node class
	class Node{
		Node next;
		String data;
		
		public Node(String data) {
			this.data = data;
			next = null;
		}
	}
}
