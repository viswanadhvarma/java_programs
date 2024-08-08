package com.basicprograms.loops;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter How many numbers do u want to add : ");
		int num=s.nextInt();
		int sum=0;
		do {
			System.out.println("Enter a number : ");
			int a=s.nextInt();
			sum+=a;
		}
		while(num>0);
		System.out.println(sum);
	}

}
