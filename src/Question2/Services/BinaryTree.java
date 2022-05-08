package Question2.Services;


public class BinaryTree {

	// Root of binary tree
	Node root;

	//Logic to implement InOrder using recursion
	public void inOrder() {
		inOrder(root);
	}
	private void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.printf("%s ", node.data);
		inOrder(node.right);
	}

	//Method to create Binary Tree
	public static BinaryTree create() {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node("50");
		tree.root.left = new Node("30");
		tree.root.right= new Node("60");
		tree.root.left.left = new Node("10");
		tree.root.right.left=new Node("55");

		return tree;
	}

}
