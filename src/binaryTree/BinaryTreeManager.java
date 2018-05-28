package binaryTree;

public class BinaryTreeManager {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(1);
		
		tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        
        tree.root.left.left = new Node(4);
        
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();
        
        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);
  
        tree2.root = new Node(1);
        tree2.root.left = new Node(2);
        tree2.root.right = new Node(3);
        tree2.root.left.left = new Node(4);
        tree2.root.left.right = new Node(5);
        
        SameTreeChecker checkObj = new SameTreeChecker();
        
        if(checkObj.isSameTree(tree1.root, tree2.root))
        		System.out.println("Same tree ");
        else
        	System.out.println("Different tree ");
	}

}
