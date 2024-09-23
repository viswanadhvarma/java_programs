package com.basicprograms.loops;

public class Regarsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regarsion obj=new Regarsion();
//		int num=153;
//		int count1=t.digit(num, 0);
//		int a=t.arm(num,0,count1);
	
//		System.out.println(a);
		
		
		System.out.println(obj.fact(5, 1, 1));
	    }

//	int count=0;
//	int digit(int n, int count) {
//		
//		if(n==0)
//			return count;
//		else
//		{
//			++count;
//			return digit(n/10,count);
//		}
//		
//		
//	}
////	int count1=digit(n,count);
//	int arm(int n,int sum,int count1) {
//		
//		
//		if(n==0)
//			return sum;
//		else
//		{
//			int rev=n%10;
//			int po=(int)Math.pow(rev, count1);
//			sum+=po;
//			return arm(n/10,sum,count1);
//			
//		}
//		
//	}
//	
//	
	
	
		int fact(int num,int pro,int start)
		{
			if(start==num+1)
			{
				return pro;
				
			}
			else
			{
				pro*=start;
				return fact(num,pro,start+1);
			}
		}
	}
	
	

