package binaryTree;

public class SameTreeChecker {
	public boolean isSameTree(Node p, Node q) {
		if(p==null && q==null)
			return true;
		
		if(p!=null && q!=null)
			return (p.data == q.data 
			&& isSameTree(p.left, q.left)
			&& isSameTree(p.right, q.right));
		
		return false;
	}
}
