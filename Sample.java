package com.basicprograms.loops;

import java.util.Arrays;

public class Sample {

	public static void main(String[] args) 
	{

		
		
		int a[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		Sample s=new Sample();
		int count=0;
		s.add(a,count);
	}

	int add(int a[][],int count)
	{
	
		if (count==20)
			return count;
		else
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
			
					if(j==0 && count<=5) {
						
						System.out.print(a[i][j]+" ");
						count++;
					}
					else if(j==a.length && count<=10)
					{
						System.out.print(a[i][j]);
						count++;
					}
					
				}
				
			}
			return add(a,count);
		}
		
		
		
	}

	
}






