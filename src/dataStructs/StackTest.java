package dataStructs;

public class StackTest {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push("Hello");
		stack.push("World");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
