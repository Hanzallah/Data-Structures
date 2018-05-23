package trees;

public class BinarySearchTreeTest {
	public static void main(String[] args) {
		BinarySearchTree parent = new BinarySearchTree();
		parent.add(3);
		parent.add(2);
		parent.add(4);
		parent.add(5);
		parent.add(1);
		parent.remove(2);
		
		parent.printPost();
		parent.print();
		parent.printPre();
		
		System.out.println(parent.find(14));
	}
}
