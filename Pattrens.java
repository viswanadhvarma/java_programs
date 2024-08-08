package com.basicprograms.loops;
import java.util.Scanner;
public class Pattrens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=1;
//		for(int i=1;i<=4;i++) {
//			
//			for(int j=1;j<=4;j++) {
//				
//				System.out.print(a+" ");
//				a++;
//			}
//			System.out.println();
//		} 
//		
		
		
//		for(int i=1;i<4;i++) {
//			for(int j=1;j<6;j++) {
//				if(j%2!=0)
//					System.out.print("1 ");
//				else
//					System.out.print("0 ");
//			}
//			System.out.println();
//		}
		
		
		
		
//		for(int i=5;i>0;i--) {
//			for(int j=5;j>0;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
//		for(int i=1;i<=4;i++) {
//			
//			for(int j=1;j<=4;j++) {
//				System.out.print(i+j-1);
//			}
//			System.out.println();
//			
//		}
//		
		
		
		
		
		
		
//		int a=1;
//		for(int i=1;i<=5;i++) {
//			
//			for(int j=1;j<=5;j++) {
//				a=i+j-1;
//				if(a%2==0)
//					System.out.print(a+" ");
//				else
//					System.out.print("0 ");
//				
//				
//			}
//			System.out.println();	
//		}
	
		
		
		
		
		
//		char di='A';
//		for(int i=1;i<=4;i++) {
//			
//			for(char j=1;j<=4;j++) {
//				
//				System.out.print(di+" ");
//				di++;
//			
//				
//			}
//			
//			System.out.println();	
		
		
		
		
		
		
//		
//		char di='A';
//		int row=6,col=9;
//		for(int i=1;i<=row;i++) {
//			
//			for(int j=1;j<=row;j++) {
//				
//				System.out.print(di+" ");
//				
//				
//				if(j<row)
//					di++;
//				if(di>'Z')
//					di='A';
//			}
//			
//			System.out.println();	
//		
//		}
//		
//		
		
		
		
//		int r=8;
//		for(int i=1;i<=r;i++) {
//			for(int j=i;j<=r;j++) {
//				if(i==1||j==r||j==i)
//					System.out.print("* ");
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		} 
//		int col=8;
//		for(int k=1;k<=col;k++) {
//			for(int l=1;l<=k;l++) {
//				if(k==col||l==1||k==l)
//					System.out.print("* ");
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}
//		
		
		
		
		
		
		
		
//		int r=8;
//		for(int i=1;i<=r;i++) {
//			for(int j=1;j<=r;j++) {
//				if(j==1||i==j)
//					System.out.print("* ");
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		} 
//		int col=8;
//		for(int k=1;k<=col;k++) {
//			for(int l=k;l<=col;l++) {
//				if(l==k||l==col)
//					System.out.print("* ");
//				else
//					System.out.print("  ");
//			}
//			System.out.println();
//		}
//		
	
		
		
		
		
//	int rows=9;
//	for(int r=1;r<=rows;r++)
//	{
//		for(int c=1;c<r;c++)
//		{
//			System.out.print("  ");
//			
//		}
//		for(int c=rows;c>=2*r-1;c--)
//		{
//			if(r==1||c==rows||c==2*r-1)
//				System.out.print("# ");
//			else 
//				System.out.print("  ");
//			
//		}
//		System.out.println();
//	}
//		
//		
		
		
		
		
		
		
//		int rows=5;
//		for(int r=1;r<rows;r++)
//		{
//			for(int c=r;c<rows-1;c++)
//			{
//				System.out.print("  ");
//				
//			}
//			for(int c=1;c<=2*r-1;c++)
//			{
//				if(c==2*r-1||c==1||r==rows/2+1)
//					System.out.print("# ");
//				else
//					System.out.print("  ");
//				
//				
//			}
//			System.out.println();
//		}
			
		
		
		
//		int rows=4;
//		for(int r=1;r<=rows;r++)
//		{
//			for(int c=r;c<=rows-1;c++)
//			{
//				System.out.print("  ");
//				
//			}
//			for(int c=1;c<=2*r-1;c++)
//			{
//				if(c==2*r-1||c==1)
//					System.out.print("# ");
//				else
//					System.out.print("  ");
//				
//				
//			}
//			System.out.println();
//		}
//		for(int r=1;r<=rows;r++)
//		{
//			for(int c=1;c<r;c++)
//			{
//				System.out.print("  ");
//				
//			}
//			for(int c=2*r;c<=2*rows;c++)
//			{
//				if(c==2*rows||c==r*2)
//					System.out.print("# ");
//				else
//					System.out.print("  ");
//				
//				
//			}
//			System.out.println();
//		}
//		
//		
//		
		
	
		
		
		
		
		
		int rows=3,a=1;
		for(int r=1;r<=rows;r++)
		{
			
			for(int c=r;c<rows;c++)
			{
				System.out.print("   ");
			}
			for(int c=1;c<=2*r-1;)
			{
				
					int count=0,temp=0;
					for(int j=1;j<=a;j++)
					{
						if(a%j==0) 
						{
							count++;
							temp=a;	
						}
						}
					if(count==2) 
					{
						System.out.print(temp+" ");
						c++;
					}
					a++;
					
							
				
			}
			System.out.println();
		}
		
		
		
	}

}
