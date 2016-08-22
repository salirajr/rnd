package js.rnd.testdome;

/*
 * Write a function that checks if a given binary tree is a valid binary search tree. A binary search tree (BST) is a binary tree where the value of each node is larger or equal to the values in all the nodes in that node's left subtree and is smaller than the values in all the nodes in that node's right subtree.
 * 
 * For example, for the following tree:
 * 
 * n1 (Value: 1, Left: null, Right: null)
 * n2 (Value: 2, Left: n1, Right: n3)
 * n3 (Value: 3, Left: null, Right: null)
 * Call to isValidBST(n2) should return true since a tree with root at n2 is a valid binary search tree.
 * 
 * Explanation: Subtrees rooted at nodes n1 and n3 are valid binary search trees as they have no children. A tree rooted at node n2 is a valid binary search tree since its value (2) is larger or equal to the largest value in its left subtree (1, rooted at n1) and is smaller than the smallest value in its right subtree (3 rooted at n3).
 * */

class Node {
	public int value;
	public Node left, right;

	public Node(int value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
}

public class BinarySearchTree {
	public static boolean isValidBST(Node root) {
		throw new UnsupportedOperationException("Waiting to be implemented.");
	}

	public static void main(String[] args) {
		Node n1 = new Node(1, null, null);
		Node n3 = new Node(3, null, null);
		Node n2 = new Node(2, n1, n3);

		System.out.println(isValidBST(n2));
	}
}