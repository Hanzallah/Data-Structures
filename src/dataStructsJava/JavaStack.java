package dataStructsJava;
import java.util.*;

public class JavaStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		stack.push("Hanzallah");
		stack.push("Alice");
		stack.push("Ben");
		
		System.out.println(stack.peek());
		
		while (stack.size() > 0) {
			System.out.println(stack.pop());
		}
	}
}
