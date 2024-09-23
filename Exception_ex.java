package com.basicprograms.loops;

import java.util.Scanner;

public class Exception_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			System.out.println(10/n);
			int a[]= {10};
			System.out.println(a[n]);
			String k="Hello";
			System.out.println(k.charAt(n));
			
		}
		catch(Exception a)
		{
			System.out.println("im in exception");
		}
		
	}
	

}
class a{
	int x;
}
