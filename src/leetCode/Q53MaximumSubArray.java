package leetCode;

public class Q53MaximumSubArray {
	public int maxSubArray(int[] nums) {
        if(nums == null || nums.length==0){
            return 0;
        }
        
        int length = nums.length;
        if (length == 1)
        return nums[0];
        int[] dp = new int[length];
         int max = nums[0];
         dp[0]=nums[0];
         for(int i=1;i<length;i++){
             dp[i] = nums[i]+(dp[i-1]>0 ? dp[i-1]:0);
             max = Math.max(max,dp[i]);
         }
        
        
        return max;
    }
}
