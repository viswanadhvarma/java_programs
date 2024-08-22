package com.basicprograms.loops;

import java.util.Arrays;

public class Exam {

	public static void main(String[] args) {
	
		
//		String a[]={"15","19","5","7","11","13"};
//		for(int i=0;i<a.length;i++)
//		{
//			int num=Integer.parseInt(a[i]);
//			int count=0;
//			for(int j=1;j<=num;j++)
//			{
//				if(num%j==0)
//				{
//					count++;
//				}
//			}
//			if(count==2)
//			{
//				a[i]="Prime";
//			}
//			
//						
//		}
		
		//System.out.println(Arrays.toString(a));
//		for(String t:a)
//			System.out.println(t);
		
		
		
		int a[]= {1,2,3,4,5,6,7,8,9,2};
		int b[]=new int[a.length];
		int max=0,c=0;
		for(int i=0;i<a.length;i++)
		{
			if(b[i]>=1)
				continue;
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=c++;
				}
			}
			if(count>max)
					max=count;
			
		}	
		System.out.println(Arrays.toString(b));
		System.out.println(max);
		
		
		
		
//		int a[]= {6,3,2,7,44,12,46,83,86,124,45,5,1,8};
//		int max=0,sm=0;
//		for(int i=0;i<a.length;i++)
//		{
//			
//			if(a[i]>max)
//			{
//				max=a[i];
//			}
//		}
//		System.out.println(max);
//		for(int i=0;i<a.length;i++)
//		{
//			if(sm<a[i] && max!=a[i])
//			{
//				sm=a[i];
//			}
//		}
//		
//		System.out.println(sm);
//		
		
		
	}

}
