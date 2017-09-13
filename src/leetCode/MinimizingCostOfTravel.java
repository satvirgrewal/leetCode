//A man has to travel for given number of days by bus. He can buy either:
//
//1 day ticket for 2Rs (valid for 1 day)
//7 days ticket for 7Rs (valid for 7 consecutive days)
//30 days ticket for 25Rs (valid for 30 consecutive days)
//We are given an array, whose elements are the day numbers on which he travels.
//
//For example, if the given array is {1,3,5,8,9,10}, then he travels on these 6 days. Now we have to minimize the cost of his travel. What would be the best approach to solve this problem?
package leetCode;

import java.util.ArrayList;
import java.util.Collections;

public class MinimizingCostOfTravel {
	static int largestDay;
	public static void main(String [] args){
		int[] ip = new int[]{1,3};//,4};//,5,6,7,12,13,14,15,16,17,18,19,20,28,30};
		largestDay = ip[ip.length-1];
		System.out.println(helper(0, 0,0,ip));
		
	}
	static int helper(int lastDayTravelled, int cost, int index,int[] ip){
		if(lastDayTravelled>=largestDay){
			return cost;
		}
		if(cost==22){
			System.out.println(lastDayTravelled+ ",   "+index );
		}
		int cost1=cost,cost2=cost,cost3=cost;
		if(lastDayTravelled+1>=ip[index]){
			cost1 = cost1+ helper(lastDayTravelled+1, cost + 2,index+1,ip);
		}
		if(lastDayTravelled+7>=ip[index]){
			cost2= cost2+ helper(lastDayTravelled+7, cost+7,index+1,ip);
		}
		if(lastDayTravelled+30>=ip[index]){
			cost3= cost3+ helper(lastDayTravelled+30, cost+25,index+1,ip);
		}
		return min(cost1,cost2,cost3);
	}
	
	static int min(int a, int b, int c){
		int result =0;
		if(a<b && a<c){
			result = a;
		}
		else if(b<c&&b<a){
			result = b;
		}
		else{
			result = c;
		}
		
		return result;
	}
	
	int minBusTickets(int[] trips, int[] cost, int day, int lastIndex) {		    
	    if (day < trips[0])
		  return 0;	
	    if (cost[day] > 0) 
			  return cost[day];
	    int l = 0;
	    int r = lastIndex;
	    while (l <= r) {
	    	int mid = l + (r - l)/2;
	    	if (trips[mid] == day) {
	    		 lastIndex = mid;
	    		 break;
	    	}
	    	else if(trips[mid] < day) 
	    		l = mid + 1;
	    	else
	    		r = mid - 1;	    	
	    }
	    
	    if (l > r) {
	    	day = trips[r];
	    	lastIndex = r;
	    }

	   int min = Integer.MAX_VALUE;			
	  min = Math.min(min, minBusTickets(trips, cost, day - 1,lastIndex) + 2);				
	  min = Math.min(min, minBusTickets(trips, cost, day - 7,lastIndex) + 7);				
	  min = Math.min(min, minBusTickets(trips, cost, day - 30,lastIndex) + 25);
	  cost[day] = min;
	  return min;	
	
	}
	
	public static class Solution {
		static ArrayList<Double> costOption=new ArrayList<Double>();
		static double []costArray=new double[13];
		static int days[] ={1,2,3,4,5,6,7,8,9,10};

		static double Solution(){
			int []paymentPlan={2,7,30};
			
			
			if(days.length>=23){
				return 25;
			}
			else if(days.length<=3){
				return days.length*2;
			}
			
			else{			
				for (int day : days) {
					costOption.clear();
					costOption.add(calculateDailyPlan(day));
					costOption.add(calculateWeeklyPlan(day));
					costOption.add(calculateMonthlyPlan(day));
					costArray[day-1]=Collections.min(costOption);				
				}		
			}	
			return costArray[days.length-1];	
		}

		public static double calculateDailyPlan(int day){	
			if(day<=1){
				return 2;
			}
			else{
				return 2+costArray[day-1-(1)];
			}		
		}

		public static double calculateWeeklyPlan(int day){	
			if(day<=7){
				return 7;
			}
			else{
				return 7+costArray[day-1-(7)];
			}	
		}	
		public static double calculateMonthlyPlan(int day){	
			if(day<=30){
				return 25;
			}
			else{
				return 25+costArray[day-1-(30)];
			}	
		}	
		  public static void main(String args[])
		    {                        
		        System.out.println(Solution());
		    }
		}

}

