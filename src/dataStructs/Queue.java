package dataStructs;

public class Queue {
	private LinkedList list;
	
	public Queue() {
		list = new LinkedList();
	}
	
	public void add(String data) {
		list.addToTail(data);
	}
	
	public String remove() {
		return list.removeFromHead();
	}
	
	public String peek() {
		return list.getData(0);
	}
}
