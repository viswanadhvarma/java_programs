package com.basicprograms.loops;

public class ThreadsEx {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Demo thread1=new Demo();
//		Demo thread2=new Demo();
//		Demo thread3=new Demo();
//		Demo thread4=new Demo();
//		Demo thread5=new Demo();
//		thread1.setName("ramesh");
//		thread2.setName("suresh");
//		thread3.setName("kamesh");
//		thread4.setName("gokesh");
//		thread5.setName("vishal");
//		thread1.start();
//		thread2.start();
//		thread3.start();
//		thread4.start();
//		thread5.start();
//	}
//
//}
//
//class Demo extends Thread
//{
//	public void run()
//	{
//		for(int x=0;x<5;x++)
//			System.out.println(Thread.currentThread().getName()+"==>"+x);
//	}
	
	
	
//	public static void main(String[] args) {
//		Demo d=new Demo();
//		Thread t1=new Thread(d);
//		Thread t2=new Thread(d);
//		t1.setName("ram");
//		t2.setName("pavan");
//		t1.start();
//		t2.start();
//	}
//
//}
//class Demo implements Runnable
//{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		for(int i=0;i<10;i++)
//		{
//			System.out.println(Thread.currentThread().getName()+"==>"+i);
//		}
//	}
	
	
	
//	public static void main(String[] args) {
//	//Runnable r=new Runnable()
//		Runnable r=()->
//	
//		//public void run()
//		
//			System.out.println("im in main");
//		
//	
//		Thread t=new Thread(r,"ram");
//		Thread t1=new Thread(r,"king");
//		t1.start();
//		t.start();
//		System.out.println("hello");
//			
//	
//	}
	
	
//	public static void main(String[] args) {
//		Demo d=new Demo();
////		d.run();
////		d.run();
//		Thread t=new Thread(d,"ram");
//		Thread t1=new Thread(d,"chinna");
//		t.start();t1.start();
//	}
//	
//	
//}
//class Demo implements Runnable
//{
//	int count=1;
//	@Override
//	public synchronized void run() {
//		// TODO Auto-generated method stub
//		for(int i=1;i<=10;i++)
//		{
//			count++;
//			System.out.println(Thread.currentThread().getName()+"=>"+count);
//		}
//	}
	
	
//	public static void main(String[] args) {
//		Thread t=new Thread (new Example(),"T1");
//		t.start();
//		t.interrupt();
//		//System.out.println(Thread.currentThread().getName());
//		
//	}
//	
//	
//	
//	}
//class Example implements Runnable
//{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		try
//		{
//			System.out.println("im in try block Started");
//			Thread.sleep(1000);
//			System.out.println("im in try block completed");
//			
//		}
//		catch(InterruptedException e)
//		{
//			System.out.println("t1.Thread");
//		}
//		
//	}
	
	
//	public static void main(String[] args) {
//		Thread t=new Thread (new Example(),"T1");
//		t.start();
//		
//		System.out.println(Thread.currentThread().getName());
//		try {
//			System.out.println("main Thread Started");
//			Thread.sleep(2000);
//			System.out.println("main Thread completed");
//		}
//		catch(InterruptedException e)
//		{
//			System.out.println("Main Thread Exception");
//			
//		}
//		t.interrupt();
//		System.out.println("main thread");
//		
//		
//	}
//
//}
//class Example implements Runnable
//{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		try
//		{
//			System.out.println("im in try block Started");
//			Thread.sleep(1000);
//			System.out.println("im in try block completed");
//			
//		}
//		catch(InterruptedException e)
//		{
//			System.out.println("t1.Thread");
//		}
//		
//	}
	
	
	public static void main(String[] args) {
		Thread t=new Thread (new Example(),"T1");
		Thread t2=new Thread (new Example(),"T2");
		t.start();
		t2.start();
		try
		{
			t2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("im interrupted");
		}
		System.out.println("main thread");
		
	}

}
class Example implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
	
	
}
	
	

	
	
	
