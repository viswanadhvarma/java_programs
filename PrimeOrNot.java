package com.basicprograms.loops;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value : ");
		int count2=s.nextInt();
		int start2=1;
		while(start2>0) {
			int start=1,count=0;
			while(start<=start2) {
				if(start2%start==0)
					count++;
				start++;
				
			}
			if(count==2) {
				if(count2>0)
					System.out.println(start2+" prime");
				count2--;
			if(count2==0)
				break;
			}
			
			
			start2++;
		}
			
	}

}
