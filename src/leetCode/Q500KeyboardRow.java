package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Q500KeyboardRow {
    String row1="qwertyuiopQWERTYUIOP";
    String row2="ASDFGHJKLasdfghjkl";
    String row3="zxcvbnmZXCVBNM";
    public String[] findWords(String[] words) {
        ArrayList<String> result = new ArrayList<String>();
        for(String word:words){
            if(check1Line(word)){
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);
    }		
    
    public boolean check1Line(String word){
        char first= word.charAt(0);
        String row="";
        if(row1.indexOf(first)>=0){
            row = row1;
        }
         if(row2.indexOf(first)>=0){
            row= row2;
        }
         if(row3.indexOf(first)>=0){
            row= row3;
        }
        for(int i =1; i<word.length();i++){
            if(row.indexOf(word.charAt(i))<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
    	Q500KeyboardRow object = new Q500KeyboardRow();
    	System.out.println(Arrays.toString(object.findWords(new String[] {"Hello","Alaska","Dad","Peace"})));
    }

}
