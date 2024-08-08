package com.basicprograms.loops;
import java.util.Scanner;
public class HighestCommonFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=s.nextInt();
		int b=0,c=0,d=0,e=0,f=0;
		
		while(a>0) {
			b=a%10;
			d=d*10+b;
			a=a/10;
			c++;
		}
		System.out.println(d);
		
		while(d>0) {
			b=d%10;
			
			e=e*10+b;
			d=d/10;
			c--;
			
		}
		
		f=(int)Math.pow(10,c);
		e*=f;
		System.out.println(e);
		
			
		
		//System.out.println(d);
	}

}
