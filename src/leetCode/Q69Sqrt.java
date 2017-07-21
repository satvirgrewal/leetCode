package leetCode;

public class Q69Sqrt {
	public static int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        long start = 0, mid=0,last=x/2;
        long target = (long)x;
        while(start<=last){
            mid=start +(last-start)/2;
            if(mid*mid==target){
                break;
            }
            if(mid*mid>target){
                last= mid-1;
            }
            else{
                start = mid;
            }
        }
        System.out.println(mid);
        return (int)mid;
        
    }
	
	public static void main(String[] args){
		System.out.println(mySqrt(6));
	}
}
