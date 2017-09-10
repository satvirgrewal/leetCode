package leetCode;

public class Q112PathSum {
    int num;
    boolean result = false;
    int temp = 0;
    
    
    public static void main(String[] args){
    	TreeNode five = new TreeNode(5);
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode seven = new TreeNode(7);
		TreeNode six = new TreeNode(6);
		TreeNode eight = new TreeNode(8);
		one.left=two;
		two.left=four;
		two.right=five;
		one.right=three;
		three.left = six;
		three.right = seven;
		four.left = eight;
		Q112PathSum test = new Q112PathSum();
    	System.out.println(test.hasPathSum(one,10));
    	
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        num = sum;
        helper(root);
        return result;
    }
    
    private void helper(TreeNode root){
        if(root == null){
            return;
        }
        temp+=root.val;
        helper(root.left);
        helper(root.right);
        
        if(root.left == null && root.right == null){
            if (temp == num){
                result = true;
                return;
            }  
        }
        temp-=root.val;
    }
}
