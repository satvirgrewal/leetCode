package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Q1TwoSum {

	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int n:nums){
            map.put(n,index);
            index++;
        }
        Integer second =null;
        for (int i=0; i<nums.length;i++){
            second= map.get(target-nums[i]);
            if(second!=null && second!=i){
                return (new int[]{i,second});
            }
        }
        return null;
    }
	
}
