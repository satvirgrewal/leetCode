package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q349IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        
        if(nums1 == null || nums1.length==0 || nums2 == null || nums2.length == 0){
        return new int[0];
        }
        
        Map<Integer,Integer> map = new HashMap<>();
        int length1= nums1.length;
        int length2=nums2.length;
        ArrayList<Integer> output= new ArrayList<Integer>();
        if(length1<length2){
           for(int i=0;i<length2;i++){
               if(map.get(nums2[i])==null){
                   map.put(nums2[i],1);
               }
               else{
                   map.put(nums2[i],map.get(nums2[i])+1);
               }
           }
           
           for(int i = 0; i<length1;i++){
               if(map.containsKey(nums1[i])){
                   map.remove(nums1[i]);
                   output.add(nums1[i]);
                   
               }
           }
        }
        else{
            for(int i=0;i<length1;i++){
               if(map.get(nums1[i])==null){
                   map.put(nums1[i],1);
               }
               else{
                   map.put(nums1[i],map.get(nums1[i])+1);
               }
           }
           int newIndex =0;
           for(int i = 0; i<length2;i++){
               if(map.containsKey(nums2[i])){
                   output.add(nums2[i]);
                   map.remove(nums2[i]);
               }
        }
        }
        int [] op = new int[output.size()];
        for(int i=0;i<output.size();i++){
            op[i]=output.get(i).intValue();
        }
        return op;
    }

	

}
