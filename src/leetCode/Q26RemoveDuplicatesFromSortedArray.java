package leetCode;

import java.util.Arrays;

public class Q26RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int size = length;
        int counter = 1;
        int prev = 0;
        while(counter < length){
            if(nums[prev] == nums[counter]){
                size -- ;
            }
            else{
                nums[prev+1] = nums[counter];
                prev = prev+1;
            }
            counter++;
        }
       if(size>0)
        Arrays.copyOfRange(nums,0,size-1);
        return size;
    }
    
    

}
