package com.basicprograms.loops;

import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Adding before number and after number
//		int brr[]=new int[5];
//		int arr[]= {10,20,30,40,50};
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
//		
//		op: 30,40,60,80,90
		
		
		
		
		
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
//		System.out.println(Arrays.toString(c));
//		
//		op:[10, 20, 30, 40, 50, 100, 90, 80, 70, 60]
		
		
		
		
		
//		Half of array reversed
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
//		op:[50, 40, 30, 20, 10, 100, 90, 80, 70, 60]
				
				
//		Adding Even index after odd indexs
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
//		op:[20, 40, 60, 10, 30, 50]
		
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
//		 
//		op:[20, 10, 40, 30, 60, 50]

		
		
		
//		Counting Elements
		
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
//		op:10,20
		
		
		
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
//		op: Element not Found
		
		
		
		

//		Swapping even and odd indexes
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
//		
//		op:[20, 10, 40, 30, 60, 50, 80, 90, 70]
		
		
		
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
		
		
//		Ascending order
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
//		
//		System.out.println(Arrays.toString(a));
//		
//		op:[10, 20, 30, 40, 50, 60, 70, 80, 90]
		
		
//		Zero elements are stored after positive numbers
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
		
	//	op:[1, 2, 2, 5, 1, 0, 0, 0, 0, 0, 0, 0]
		
		// Secound Maximum
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
//		op:60

		
		// MIssing element in Sorting
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
//	
//	op: [5, 6, 6, 8, 9, 9, 10]     ,7
			


//		Right Rotation
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
//	op: [6, 1, 2, 3, 4, 5]
		
		
		//Left Rotation
//	int a[]= {1,2,3,4,5,6};
//	int temp=a[0];
//	for(int i=0;i<a.length-1;i++)
//	{
//		a[i]=a[i+1];
//		
//	}
//	a[a.length-1]=temp;
//	System.out.println(Arrays.toString(a));
//
//	op: [2, 3, 4, 5, 6, 1]
		
	// Find MIssing Element
//		int a[]= {4,5,2,7,8,9,9};
//		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]>max)
//				max=a[i];
//			if(a[i]<min)
//				min=a[i];
//		}
//		
//		System.out.println(min+" "+max);
//		while(min<max)
//		{
//			int count=0;
//			for(int i=0;i<a.length;i++)
//			{
//				if(a[i]==min)
//					count++;
//				
//			}
//			
//			if(count==0)
//				System.out.println(min);
//			min++;
//		}
//		
//		op: 3,6
		
		
		// Find MIssing Element
//		int[] arr = {7,6,4,5,8};
//		  int[] b = new int[9];
//		  for(int i = 0;i<arr.length;i++)
//		  {
//		    b[arr[i]-1]++;
//		  }
//		  for(int i=4;i<b.length;i++)
//		  {
//		   if(b[i]==0)
//		   {
//		    System.out.println(i+1);
//		   }
//		  }
//		
//		
//		op: 9
		
		//Bubble sorting
//		int a[]= {5,-1,3,-12,9,1,-7,15,-12,10};
//		System.out.println(a.length);
//		for(int j=0;j<a.length-1;j++)
//		{
//			for(int i=0;i<a.length-1-j;i++)
//			{
//				if(a[i]>a[i+1])
//				{
//					int temp=a[i+1];
//					a[i+1]=a[i];
//					a[i]=temp;
//					
//				}
//			}
//			
//		}
//		System.out.println(Arrays.toString(a));
//
//		
//		op:[-12, -12, -7, -1, 1, 3, 5, 9, 10, 15]
		
		
//		// Removing element on particular index
//		int a[]= {10,20,30,40,50,60,70};
//		int index=3 ,i;
//		for(i=index;i<a.length-1;i++)
//		{
//			a[i]=a[i+1];
//			
//		}
//		a[i]=0;
//		System.out.println(Arrays.toString(a));
//		
//		
//		//[10, 20, 30, 50, 60, 70, 0]
//		
//		int z=2;
//		for(int j=a.length-1;j>z;j--)
//		{
//			a[j]=a[j-1];
//			
//		}
//		a[z]=25;
//		System.out.println(Arrays.toString(a));
		
		
	// It will gives you Wrong output
//		int a[]={10,20,30,40,50,60,70,80,90};
//        int z=0,k=0;
//        int temp=a[k];
//        for(int i=0;i<=a.length-1;i++)
//        {
//     	
//            a[i]=a[i+1];
//            if(i==a.length-2)
//            {
//                i+=1;
//                
//                a[a.length-1]=temp;
//               
//            }
//            if(i==8 && z<2)
//            {
//                i=-1;
//                z++;
//            }
//              
//        }
//        System.out.println(Arrays.toString(a)); 
//		
//			[40, 50, 60, 70, 80, 90, 10, 10, 10]
		//Expected output:[40, 50, 60, 70, 80, 90, 10, 20, 30]
		
		// Error
		
//		int a[][]=new int[3][];
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter size of row elements:");
//		for(int i=0;i<a.length;i++)
//		{
//			int j=s.nextInt();
//			a[i]=new int[j];
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length;j++)
//			{
//				System.out.print(a[i][j]);
//			}
//			System.out.println();
//		}
		
		
		
		int a[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==0)
				{
					if(j<a.length-1)
						System.out.print(a[i][j]+" ");
				}
				int z=a.length;
				
			}
		}
		
		
	}
}
