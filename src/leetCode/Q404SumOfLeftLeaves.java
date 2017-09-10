package leetCode;

public class Q404SumOfLeftLeaves {
	int sum =0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root,"null");
        return sum;
    }
    
    void helper(TreeNode root, String side){
        if(root==null){
            return;
        }
        helper(root.left,"left");
        helper(root.right,"right");
        if(root.left==null&& root.right==null && side=="left"){
            sum+=root.val;
        }
    }
}
