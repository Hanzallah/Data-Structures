package dataStructs;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("Hello");
		list.add("World");
		
		list.set(0, "change");
		
		list.remove(1);
		
		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.get(i));
		}
	}
}
