/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String s = sc.next();
		    String a = sc.next();
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    int days = getday(a)-getday(s)+1;
		    while(days<l){
		        days=days+7;
		    }
		    if(days>r){
		        System.out.println("impossible");
		    }else if(days>=l&&days<=r&&days+7<=r){
		        System.out.println("many");
		    }else if(days>=l&&days<=r&&days+7>r){
		        System.out.println(days)   ;
		    }
		}
	}
	public static int getday(String s){
	    switch(s){
	        case "monday":
	            return 0;
	            
	        case "tuesday":
	            return 1;
	            
	        case "wednesday":
	            return 2;
	            
	        case "thursday":
	            return 3;
	            
	        case "friday":
	            return 4;
	            
	        case "saturday":
	            return 5;
	            
	        case "sunday":
	            return 6;
	            
	    }
	    return -1;
	}
}
