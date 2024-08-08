package com.basicprograms.loops;

public class fibnocci {
	public static void main(String args[]) {
		int z=0,a=1,b=1,c=1,d=10;
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		while (d>0)
		{
			
			c=z+a+b;
			z=a;
			a=b;
			b=c;
			System.out.println(c);
			d--;
			
		
			
			
		}
		
	}

}
