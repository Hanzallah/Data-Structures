package dataStructs;

public class ArrayList {
	private String[] buffer;
	private int currentSize;
	
	public ArrayList() {
		final int INITIAL_SIZE = 10; 
		buffer = new String[INITIAL_SIZE];
		currentSize = 0;
	}
	
	public int getSize() {
		return currentSize;
	}
	
	public String get(int n) {
		try {
			return buffer[n];
		} catch(IndexOutOfBoundsException e) {
			return "Index does not exist";
		}
	}
	
	public void set(int n, String data) {
		try {
			buffer[n] = data;
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Index does not exist");
		}
	}
	
	public boolean add(String data) {
		increaseBuffer();
		currentSize++;
		
		buffer[currentSize-1] = data;
		return true;
	}
	
	public String remove(int n) {
		try {
			String removed = buffer[n];
			
			for (int i = n+1; i < currentSize; i++) {
				buffer[i-1] = buffer[i];
			}
			
			currentSize--;
			return removed;
		} catch(IndexOutOfBoundsException e) {
			return "Index does not exist";
		}
	}
	
	public void increaseBuffer() {
		if (currentSize == buffer.length) {
			String[] newBuffer = new String[2 * buffer.length];
			for (int i = 0; i  < buffer.length; i++) {
				newBuffer[i] = buffer[i];
			}
			buffer = newBuffer;
		}
	}
}
