package trees;

public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public void add(Integer data) {
		Node node = new Node(data);
		node.left = null;
		node.right = null;
		if (root == null) {
			root = node;
		}
		else {
			root.addNode(node);
		}
	}
	
	
	public boolean find(Integer data) {
		Node current = root;
		while (current != null) {
			int compare = current.data.compareTo(data);
			if (compare == 0) {
				return true;
			}
			else if (compare > 0) {
				current = current.left;
			}
			else {
				current = current.right;
			}
		}
		return false;
	}
	
	public void remove(int key)
    {
        root = remove(root, key);
    }
	
	public Node remove(Node root, Integer data) {
		/* Base Case: If the tree is empty */
        if (root == null)  return root;
 
        /* Otherwise, recur down the tree */
        if (data < root.data)
            root.left = remove(root.left, data);
        else if (data > root.data)
            root.right = remove(root.right, data);
 
        // if key is same as root's key, then This is the node
        // to be deleted
        else
        {
            // node with only one child or no child
        	// removes parent by replacing reference
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
 
            // Delete the inorder successor
            root.right = remove(root.right, root.data);
        }
 
        return root;
	}
	
	
	public void print() {
		print(root);
		System.out.println();
	}
	
	public void print(Node parent) {
		if (parent == null) {
			return;
		}
		else {
			print(parent.left);
			System.out.print(parent.data  + " ");
			print(parent.right);
		}
	}
	
	
	public void printPost() {
		printPost(root);
		System.out.println();
	}
	
	public void printPost(Node parent) {
		if (parent == null) {
			return;
		}
		else {
			printPost(parent.left);
			printPost(parent.right);
			System.out.print(parent.data  + " ");
		}
	}
	
	public void printPre() {
		printPre(root);
		System.out.println();
	}
	
	public void printPre(Node parent) {
		if (parent == null) {
			return;
		}
		else {
			System.out.print(parent.data + " ");
			printPre(parent.left);
			printPre(parent.right);
		}
	}
	
	
	// Inner node class
	class Node {
		Integer data;
		Node left;
		Node right;
		
		public Node(Integer data) {
			this.data = data;
			left = null;
			right = null;
		}
		
		public void addNode(Node node) {
			int compare = node.data.compareTo( (Integer) data);
			if (compare < 0) {
				if (left == null) {
					left = node;
				}
				else if (right == null) {
					right = node;
				}
				else {
					left.addNode(node);
				}
			}
			
			if (compare > 0) {
				if (right == null) {
					right = node;
				}
				else if (left == null) {
					left = node;
				}
				else {
					right.addNode(node);
				}
			}
		}
	}
}
