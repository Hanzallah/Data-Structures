package trees;

import java.util.Arrays;

public class SimpleTreeTest {
	public static void main(String[] args) {
		SimpleTree<String> root = new SimpleTree<>("Root");

		SimpleTree<String> child1 = new SimpleTree<>("Child1");
		child1.addChild("Grandchild1");
		child1.addChild("Grandchild2");

		SimpleTree<String> child2 = new SimpleTree<>("Child2");
		child2.addChild("Grandchild3");

		root.addChild(child1);
		root.addChild(child2);
		root.addChild("Child3");

		root.addChildren(Arrays.asList(
		        new SimpleTree<>("Child4"),
		        new SimpleTree<>("Child5"),
		        new SimpleTree<>("Child6")
		));

		for(SimpleTree<String> node : root.getChildren()) {
		    System.out.println(node.getData());
		}
		
		for(SimpleTree<String> node : child1.getChildren()) {
		    System.out.println(node.getData());
		}
	}
}
