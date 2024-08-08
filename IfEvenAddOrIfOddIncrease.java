package com.basicprograms.loops;
import java.util.Scanner;
public class IfEvenAddOrIfOddIncrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=s.nextInt();
		int b=0,c=0,d=0,temp=num,e=0,f,g,h,i=0,j=0,z=0;
		while(num>0) {
			
			c++;
			num=num/10;
		
		}
		num=temp;
		if(c%2==0)
		{
			d=c/2;
			e=(int)Math.pow(10, d);
			f=num%e;
			g=num/e;
			h=f+g;
			System.out.println("total Number :"+h);
		}
		else {
			for(;num>0;) {
				b=num%10;
				i=i*10+(b);
				num/=10;
			}
			num=i;
			for(;num>0;) {
				b=num%10;
				z=b+1;
				if(z==10) {
					z=1;
					j=j*10*(z);
				}
				else
					j=j*10+(z);
				num/=10;
			}
		
			
			System.out.println(j);
		}
	}

}
