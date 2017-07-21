package leetCode;

public class Q557ReverseWordsinaStringIII {
	StringBuilder builder = new StringBuilder();
    public String reverseWords(String s) {
        s = s.trim();
        int start =0;
        int end = 0;
        for(int i= 0;i<s.length();i++){
            if(s.charAt(i)==' ' && end==start){
                builder.append(' ');
                start++;
                end++;
            }
            else if(s.charAt(i)==' ' && end>start){
                
                builder.append(new StringBuilder(s.substring(start,end)).reverse());
                builder.append(' ');
                end++;
                start=end;
                
                
            }
            else if(i==s.length()-1){
            	builder.append(new StringBuilder(s.substring(start,end+1)).reverse());
            }
            else{
                end++;
            }
        }
        return builder.toString();
    }
    
    public static void main(String[] args){
    	Q557ReverseWordsinaStringIII testObject = new Q557ReverseWordsinaStringIII();
    	System.out.println(testObject.reverseWords("Let's take LeetCode contest    "));
    }
}
