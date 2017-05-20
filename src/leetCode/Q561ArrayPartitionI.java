package leetCode;

import java.util.Arrays;

public class Q561ArrayPartitionI {
	public int arrayPairSum(int[] nums) {
        int output = 0;
        if (nums == null)
        return output;
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i=i+2){
            output=output+nums[i];
        }
        return output;
    }
}
