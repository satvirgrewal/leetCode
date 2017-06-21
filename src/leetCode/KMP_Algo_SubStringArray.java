package leetCode;

import java.util.Arrays;

public class KMP_Algo_SubStringArray {
	public static void main(String args[]){
		String text = "abxabcabcaby";
		String pattern = "abcaby";
		int[] tempArray = createTempArray( pattern);
		boolean isSubString = isSubstringKMP(text,pattern,tempArray);
		System.out.println(Arrays.toString(tempArray));
		System.out.println(isSubString);

	}
	
	static boolean isSubstringKMP(String text, String pattern, int[] tempArray){
		int i = 0;
		int j = 0;
		boolean result =false;
		
		while(j<pattern.length() && i<text.length()){
			if(pattern.charAt(j)==text.charAt(i)){
				i++;
				j++;
			}
			else{
				if(j>0){
				j = tempArray[j-1];
			}
				else{
					i++;
				}
		}
		}
		if(j==pattern.length()){
			result = true;
		}
		return result;
	}
	
	static int[] createTempArray(String pattern){
		int j=0;
		int i=1;
		int[] temp = new int[pattern.length()];
		temp[0]=0;
		while(i<pattern.length()){
			if(pattern.charAt(i)==pattern.charAt(j)){
				temp[i]=j+1;
				i++;
				j++;
			}
			else{
				if(j>0){
					j= temp[j-1];
				}
				else{
					temp[i]=0;
					i++;
				}
			}
		}
		return temp;
	}

}
