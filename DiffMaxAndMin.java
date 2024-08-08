package com.basicprograms.loops;
import java.util.Scanner;
public class DiffMaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=s.nextInt();
		for(int start=1;start<num;start++) {
			int temp=start,rem=0,max=0,min=9,diff=0;
			while(temp>0) {
				rem=temp%10;
				if(max<rem) {
					max=rem;
				}
				if(min>rem) {
					min=rem;
				}
				
				temp=temp/10;
			}
			diff=max-min;
			if(diff==0)
				System.out.println(""+start);
			
		}
		
	}

}
