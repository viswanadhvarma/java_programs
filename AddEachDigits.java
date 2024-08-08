package com.basicprograms.loops;
import java.util.Scanner;
public class AddEachDigits {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a=99;
		while(a>=1) {
			
			int b=a,c=0,d=0,e=0,f=0;
			while (a>1) 
			{
				a=a/10;
				c++;	
			}
			a=b;
			while (a>1) {
				
				d=a%10;
				a=a/10;
				e=(int)Math.pow(d, c);
				f+=e;
						
			}
	
		
		if(b==f)
			System.out.println(f);
		else
			System.out.println(f);
		
		a--;
		}
	}

}
