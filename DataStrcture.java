package com.basicprograms.loops;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
public class DataStrcture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Deque ll=new LinkedList();
//		ll.add(1);
//		ll.add(2);
//		ll.add('a');
//		ll.add("hello");
//		//ll.add(3, 3);
//		
//		System.out.println(ll);
//		
//		List al=new ArrayList();
//		al.add(11);
//		al.add(21);
//		al.add(15);
//		al.add(54);
//		al.add(32);
//		al.add(18);
//		al.add(11);
//		al.add(21);
//		al.add(15);
//		al.add(54);
//		al.add(32);
//		al.add(18);
//		System.out.println("List");
//		System.out.println(al);
//		
//		
////		Deque ad=new ArrayDeque();
////		ad.add(1);
////		ad.add(2);
////		ad.add('a');
////		ad.add("hello");
////		//ad.add(3, 3);
////
////		System.out.println(ad);
//		
//		Queue pq=new PriorityQueue();
//		
//		pq.add(11);
//		pq.add(21);
//		pq.add(15);
//		pq.add(54);
//		pq.add(32);
//		pq.add(18);
//		pq.add(11);
//		pq.add(21);
//		pq.add(15);
//		pq.add(54);
//		pq.add(32);
//		pq.add(18);
//		//pq.add('a');
//		//pq.add("hello");
//		//pq.add(3, 3);
//		System.out.println("Queue");
//		System.out.println(pq);
//		Set s=new HashSet();
//		s.add(11);
//		s.add(21);
//		s.add(15);
//		s.add(54);
//		s.add(32);
//		s.add(18);
//		s.add(11);
//		s.add(21);
//		s.add(15);
//		s.add(54);
//		s.add(32);
//		s.add(18);
//		System.out.println("set");
//		System.out.println(s);
		
		
//		List al=new ArrayList();
//		al.add(10);
//		al.add(9);
//		al.add("hello");
//		al.add(null);
//		System.out.println(al);
//		
//		int arr[]= {10,20,30,40,50,60,70,80,90,100};
//		ArrayList al=new ArrayList();
//		for(int i=0;i<arr.length;i++)
//		{
//			al.add(arr[i]);
//		}
//		System.out.println(al);
//		System.out.println(al.size());
//		al.add(5, 55);
//		al.set(6, 44);
//		al.remove(5);
//		System.out.println(al);
//		System.out.println(al.size());
		

		
//		int a[]= {10,10,14,20,11,19,13};
//		ArrayList al=new ArrayList();
//		for(int i=0;i<a.length;i++)
//		{
//			al.add(a[i]);
//		}
//		System.out.println(al);
//		Set s=new HashSet();
//		s.addAll(al);
//		System.out.println("After set");
//		System.out.println(s);
//		
		
//		int []a= {10,15,20,15};
//		List al1=new ArrayList();
//		for(int x=0;x<a.length;x++)
//		{
//			al1.add(a[x]);
//			
//		}
//		System.out.println(al1);
//	
//		for(int x=0;x<a.length;x++)
//		{
//			if(al1.indexOf(al1.get(x))==al1.lastIndexOf(al1.get(x)))
//				System.out.println(al1.get(x));
//		}
		
		
//		ArrayList al=new ArrayList(Arrays.asList(1,2,3,4));
//		Iterator it=al.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
//		System.out.println("Forward iteration :");
//		ListIterator itr=al.listIterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		System.out.println("Backword iteration :");
//		while(itr.hasPrevious())
//		{
//			System.out.println(itr.previous());
//		}
		//OP:1
//		2
//		3
//		4
//		Forward iteration :
//		1
//		2
//		3
//		4
//		Backword iteration :
//		4
//		3
//		2
//		1
		
		Student s1=new Student(3,"Ravi","cse");
		Student s2=new Student(2,"Ram","eee");
		Student s3=new Student(4,"karthik","ece");
		Student s4=new Student(1,"surya","mech");
		List<Student> hs=new ArrayList<>(Arrays.asList(s1,s2,s3,s4));
//		Iterator i=hs.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		System.out.println(hs);
	//	Collections.sort(hs,new Rollsort());
//		System.out.println("\nAfter compare:\n");
//		System.out.println(hs);
		
		
		
		
	}

}
class Student
{
	int roll;
	String name;
	String dept;
	public Student(int roll, String name,String dept) {
		super();
		this.roll = roll;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", dept=" + dept +"]";
	}
	
	
}

//class Rollsort implements Comparator<Student>
//{
//	public int compare(Student s1,Student s2)
//	{
//		return Integer.compare(s1.roll, s2.roll);
//	}
//}

class Rollsort implements compareto()
