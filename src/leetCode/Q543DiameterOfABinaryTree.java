package leetCode;
import leetCode.TreeNode;

public class Q543DiameterOfABinaryTree {
static int max = 0;
	public static void main(String[] args){
		TreeNode five = new TreeNode(5);
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		one.left=two;
		two.left=four;
		two.right=five;
		one.right=three;
		System.out.println(diameterOfBinaryTree(one));
	}
	
	public static int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        max = Math.max(max,left+right);     
        return Math.max(left,right)+1;
    }
}
