package com.basicprograms.loops;
import java.util.Scanner;
public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=s.nextInt();
		
		for(int start=1;start<=num;start++) {
			if(num%start==0) {
				int count=0,a=1,temp=0;
				for(;a<=start;a++) {
					if(start%a==0) {
						count++;
						temp=a;
					}
				
				}
				if(count==2) {
					System.out.println(temp);
				}
				
			}
				
		}
			
		
		
		
		
		
	}

}
