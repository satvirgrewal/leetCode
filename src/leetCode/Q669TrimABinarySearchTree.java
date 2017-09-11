package leetCode;

public class Q669TrimABinarySearchTree {
	public TreeNode trimBST(TreeNode root, int L, int R) {
        return helper(root,L,R);
        //return root;  
    }
    TreeNode helper(TreeNode root, int L, int R){
        if(root == null){
            return null;
        }
        if(root.val<L){
            root = helper(root.right,L,R);
        }
        else if(root.val>R){
            root = helper(root.left,L,R);
        }
        else{
            root.left = helper(root.left,L,R);
            root.right = helper(root.right,L,R);
        }
        return root;
    }
}
