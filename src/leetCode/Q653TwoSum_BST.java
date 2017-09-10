package leetCode;

import java.util.HashSet;
import java.util.Set;

public class Q653TwoSum_BST {
	Set<Integer> set = new HashSet<Integer>();
    public boolean findTarget(TreeNode root, int k) {
        boolean result = false;
        itera(root);
        for(Integer i:set){
            if(set.contains(k-i.intValue()) && (k-i.intValue())!=i.intValue() ){
                result = true;
            break;
        }
       
        }
         return result;
    }
            
     void itera(TreeNode root){
        if(root == null) return ;
        itera(root.left);
        set.add(root.val);
        itera(root.right);
    }
}
