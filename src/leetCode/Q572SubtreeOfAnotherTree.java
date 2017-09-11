package leetCode;

public class Q572SubtreeOfAnotherTree {

	public static void main(String [] args){
		TreeNode s = new TreeNode(3);
		TreeNode four= new TreeNode(4);
		TreeNode five=new TreeNode(5);
		TreeNode two = new TreeNode(2);
		TreeNode one = new TreeNode(1);
		s.left = four;
		s.right = five;
		s.left.left = one;
		s.left.right = two;
		TreeNode t = new TreeNode(4);
		t.left = one;
		t.right = two;
		System.out.println(isSubtree(s,t));
	}
	public static boolean isSubtree(TreeNode s, TreeNode t) {
        if(t==null || s==null){
            if(t==s){
                return true;
            }
            else{
               return false; 
            }
        }
        if(s.val==t.val){
            return isSubtree(s.left,t.left) && isSubtree(s.right,t.right) ;
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t) ;
    }
}
