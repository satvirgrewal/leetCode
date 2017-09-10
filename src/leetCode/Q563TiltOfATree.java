package leetCode;

public class Q563TiltOfATree {
	static int tilt = 0;
	static int left = 0;
	static   int right = 0;
	public static void main(String[] args){
		TreeNode one =new TreeNode(1);
		TreeNode two  = new TreeNode(2);
		TreeNode three  = new TreeNode(3);
		TreeNode four  = new TreeNode(4);
		TreeNode five  = new TreeNode(5);
		one.left= two;
		one.right = three;
		two.left = four;
		three.right = five;
		int a = traverse(one);
		System.out.println(tilt);
	}

	static int traverse(TreeNode root){
        if (root== null) return 0;
        int left =0;
        left =  traverse(root.left);
        int right = 0;
        right = traverse(root.right);  
        tilt+=Math.abs(left-right);
        
        return left + right + root.val;
    }
	
	
}
