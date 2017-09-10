package leetCode;

public class Q606ConstructStringFromBinaryTree {
	 public String tree2str(TreeNode t) {
	        if(t==null){
	            return "";
	        }
	        String result ="";
	        if(t.left!=null || t.right!=null){
	         result = result+ "(" + tree2str(t.left)+")";
	            if (t.right!=null){
	            result = result + "(" + tree2str(t.right)+")";
	        }
	        }
	        
	        return t.val + result;
	    }
}
