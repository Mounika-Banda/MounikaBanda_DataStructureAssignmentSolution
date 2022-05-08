package Question2.Driver;

import Question2.Services.BinaryTree;

public class Question2Driver {

	public static void main(String[] args) {

		//Calling Binary Tree Create method
		BinaryTree bt = BinaryTree.create();
		
		//Calling InOrder method
		bt.inOrder();

	}

}
