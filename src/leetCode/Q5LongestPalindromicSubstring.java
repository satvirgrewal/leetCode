package leetCode;

public class Q5LongestPalindromicSubstring {
	int starting = 0;
    int longest=0;
public String longestPalindrome(String s) {
    char[] input = s.toCharArray();
    int length = input.length;
   
    if(length <2){
        return s;
    }
   
   for(int i=0; i<length-1; i++){
       checkPalidrome(input,i,i); // for odd length
       checkPalidrome(input,i,i+1); //for even length
   }
   return s.substring(starting,starting+longest);
}
void checkPalidrome(char[] input, int left, int right){
    while(left>=0 && right<input.length && input[left] == input[right]){
        left--;
        right++;
    }
 if ((right-left-1)>longest){
     starting = left+1;
     longest = (right-left-1);
 } 
 
}

}
