package com.basicprograms.loops;
import java.util.*;
public class CollectionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1=new Student();
//		Student s4=new Student();
//		Student s3=new Student();
//		Student s2=new Student();
//		Student []s=new Student[] {s1,s4,s2,s3};
//		System.out.println("im Executed");
//		Object[] o=new Object [] {1,1.5,'a',};
//		for(Object k: o) {
//			System.out.println(k);
		
		
		List l=new ArrayList(Arrays.asList(8,3,11,4,7,26,15));	
		System.out.println(l);
		System.out.println(Collections.max(l));
		System.out.println(Collections.min(l));
	}

}
