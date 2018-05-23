package dataStructs;

public class CircularArrayQueue {
	private String[] buffer;
	private int size;
	private int head;
	private int tail;
	
	public CircularArrayQueue() {
		buffer = new String[10];
		size = 0;
		head = 0;
		tail = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void add(String data) {
		grow();
		size++;
		
		buffer[tail] = data;
		tail = (tail+1)%buffer.length;
	}
	
	public String remove() {
		if (size > 0) {
			String removed = buffer[head];
			
			head = (head+1)%buffer.length;
			size--;
			return removed;
		}
		return null;
	}
	
	public void grow() {
		if (size == buffer.length) {
			String[] newBuffer = new String[2*buffer.length];
			for (int i = 0; i < buffer.length; i++) {
				newBuffer[i] = buffer[(head+i)%buffer.length];
			}
			buffer = newBuffer;
			head = 0;
			tail = size;
		}
	}
}