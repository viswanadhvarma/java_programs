package com.basicprograms.loops;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int brr[]=new int[5];
//		int arr[]= {10,20,30,40,50};
//		
//		
//		
//		for(int i=0;i<5;i++) {
//			if(i==0) 
//				brr[i]=arr[i]+arr[i+1];
//			else if(i==4)
//				brr[i]=arr[i-1]+arr[i];
//			else
//				brr[i]=arr[i+1]+arr[i-1];
//			
//		}
//		for(int i=0;i<brr.length;i++) {
//			System.out.println(brr[i]);
//		}
		
		
		
		
//		int a[]= {10,20,30,40,50};
//		int b[]= {60,70,80,90,100};
//		int c[]=new int [a.length+b.length];
//		for(int i=0;i<a.length;i++) {
//			c[i]=a[i];
//		}
//		int k=0;
//		for(int j=c.length-1;j>=a.length;j--) {
//			
//			c[j]=b[k];
//			k++;
//		}
//		
//		for(int i=0;i<c.length;i++) {
//			System.out.println(c[i]);
//		}
//		
//		
//		
//		[10,20,30,40,0,0,0,0]
		
		
		
		
//		int a[]= {10,20,30,40,50,60,70,80,90,100};
//		int b[]=new int[a.length];
//		int c=(a.length/2);
//		b=a.clone();
//		int c1=c-1;
//		for(int i=0;i<c;i++) {
//			a[i]=b[c1];
//			c1--;
//		}
//		int c2=c;
//		for(int i=a.length-1;i>=c;i--) {
//			a[i]=b[c2];	
//			c2++;
//		}
//		System.out.println(Arrays.toString(a));
//		
		
		
//		int a[]= {10,20,30,40,50,60};
//		int b[]=new int[a.length];
//		int z=0;
//		if(a.length%2==0)
//		{
//			for(int i=0;i<a.length;i++)
//			{
//				if(i%2!=0)
//				{
//					b[z]=a[i];
//					z++;
//				}
//			}
//			for(int i=0;i<a.length;i++)
//			{
//				if(i%2==0)
//				{
//					b[z]=a[i];
//					z++;
//				}
//				
//			}
//			System.out.println(Arrays.toString(b));
//		}
//		
		
		
//		linear search
		
//		int a[]= {10,20,30,40,50,60};
//		int b[]=new int[a.length];
//		int z=0;
//		if(a.length%2==0)
//		{
//			for(int k=0;k<a.length;k++)
//			{
//				if(k%2==0)
//				{
//					b[z]=a[k+1];
//				}
//				else
//					b[z]=a[k-1];
//				z++;
//			}
//			System.out.println(Arrays.toString(b));
//		}
		

		
		
		
	
//		int a[]= {10,20,30,10,20,40,50,10,30,60,40,20,80};
//		int b[]=new int[a.length];
//		
//		for(int i=0;i<a.length;i++)
//		{
//			if(b[i]==1)
//				continue;
//			int count=0;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				{
//					count++;
//					b[j]=1;
//
//				}
//				
//				
//			}
//			//System.out.println(a[i]+" "+count);
//			if(count>1)
//				System.out.println(a[i]);
//		}
//		
	
//		Binary search
		
//		int a[]= {10,20,30,40,50,60,70};
//		int f=0,l=a.length-1,m=0,search=55;
//		for(;f<=l;)
//		{
//			m=(f+l)/2;
//			if(search==a[m])
//			{
//				System.out.println("Element Found");
//				break;
//			}
//			else if(search>a[m])
//			{
//				f=m+1;
//			}
//			else if(search<a[m])
//			{
//				l=m-1;
//			}
//		}
//		if(f>l)
//			System.out.println("Element not Found");
// 
		
		
		
		
		

		
//		int a[]= {10,20,30,40,50,60,70,80,90};
//		int b[]=new int[a.length];
//		int z=0;
//		if(a.length%2!=0)
//		{
//			for(int k=0;k<a.length;k++)
//			{
//				
//				if(k%2==0)
//				{
//					if(k==a.length-1)
//					{
//						int temp=b[z-1];
//						b[z-1]=a[k];
//						b[z]=temp;
//					}
//					else
//					{
//						b[z]=a[k+1];
//					}
//				}
//				else
//					b[z]=a[k-1];
//				
//				z++;
//				
//			}
//			System.out.println(Arrays.toString(b));
//		}
		
		
		
		
//		int a[]= {0,1,0,2,0,0,0,2,0,6,5,0,1,0};
//		int b[]=new int[a.length];
//		int z=0;
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length-1;j++)
//			{
//			
//					if(a[j]==0)
//					{
//						int temp=a[i];
//						a[i]=a[j];
//						a[j]=temp;
//						break;
//					}
//				
//				
//			}
////			System.out.println(a[i]);
//			
//		}
//		System.out.println(Arrays.toString(a));
//		
//		
		
		
		
//		int a[]= {20,40,70,30,90,10,50,60,80};
//		int z=0;
//		for(int i=z+1;i<a.length;i++)  
//		{
//			if(i==a.length-1)    
//			{
//				z++;
//				i=z+1;
//			}
//			if(a[z]>a[i])    
//			{
//				int temp=a[z];
//				a[z]=a[i];
//				a[i]=temp;
//				
//			}
//		}
//		for(int temp:a) 
//		{
//		System.out.println(temp);
//		}
		
		
		
		
//		int a[]= {0,1,0,2,0,0,2,0,5,0,1,0};
//		
//		for(int x=0;x<a.length;x++)
//		{
//			for(int y=x+1;y<a.length;y++)
//			{
//				if(a[x]==0)
//				{
//					int temp=a[x];
//					a[x]=a[y];
//					a[y]=temp;
//					
//				}
//			}
//		}
//		System.out.println(Arrays.toString(a));
//		
		
		
//		int a[]= {40,30,90,50,10,20,60,60,20,50,90,40,60,90};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		int sm=0;
//		for(int i=a.length-1;i>=0;i--)
//		{
//			if((a[i])!=a[i-1])
//			{
//				sm=a[i-1];
//				break;
//			}
//		}
//		System.out.println(sm);
//		

		

//	int a[]= {9,6,6,8,10,5,9};	
//	Arrays.sort(a);
//	System.out.println(Arrays.toString(a));
//	int min=a[0];
//	
//	for(int i=0;i<a.length;i++)
//	{
//		if(a[i]!=min)
//		{
//			System.out.println(min);
//			break;
//		}
//		min++;
//	}
	

		
//	int a[]= {1,2,3,4,5,6};
//	int temp=a[a.length-1];
//	for(int i=a.length-1;i>0;i--)
//	{
//		a[i]=a[i-1];
//		
//	}
//	a[0]=temp;
//	System.out.println(Arrays.toString(a));
//
//		
	
		
		
		
//	int a[]= {1,2,3,4,5,6};
//	int temp=a[0];
//	for(int i=0;i<a.length-1;i++)
//	{
//		a[i]=a[i+1];
//		
//	}
//	a[a.length-1]=temp;
//	System.out.println(Arrays.toString(a));

		
	
		
		
		
	}

}
