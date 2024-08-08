package com.basicprograms.loops;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int y=5,x=2,a=1,c=1;
//		
//		double b=1.0,z=1.0;
//		if (y>x)
//		{
//			int n=y;
//			int r=x;
//			int d=n-r;
//			while(a<=n)
//			{
//				b*=a;
//				if(a<=r)
//				{
//					c*=a;
//				}
//				if(a<=d)
//				{
//					d*=a;
//				}
//				a++;
//			}
//			double k=c*d;
//			z=b/k;
//			System.out.println(z);
//		}
		
		int a=1,b=1,c=1,z=1,x=1,w=1;
		
		double n=5.0,r=2.0;
		double k=n-r;
		while(a<=n)
		{
			z*=a;
			a++;
		}
		
		while(b<=r)
		{
			x*=b;
			b++;
		}
		while(c<=k)
		{
			w*=c;
			c++;
		}
		double m=(x*w);
		double h=z/m;
		System.out.println(h);
		
		
	}

}
