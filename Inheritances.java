package com.basicprograms.loops;




// Single inheritance


//public class Inheritances {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Child c=new Child();
//		System.out.println(c.x+" "+c.y+" "+c.z);
//		c.add();
//		c.sub();
//		
//	}
//
//}
//class Parent
//{
//	int x=10;
//	void add()
//	{
//		System.out.println("Add");
//	}
//}
//class Child extends Parent
//{
//	int y=0,z=super.x;
//	void sub()
//	{
//		System.out.println("Sub");
//	}
//}


// hirarechical inheritance
public class Inheritances {
	public static void main(String[] args) {
		Child1 c1=new Child1();
		System.out.println(c1.x+" "+c1.y);
		c1.add();
		c1.sub();
		Child2 c2=new Child2();
		System.out.println(c2.x+" "+c2.z+" "+c2.a);
		c2.add();
		c2.div();
		
	}
}
class Parent{
	int x=10;
	void add() {
		System.out.println("add");
	}
}
class Child1 extends Parent{
	int y=20;
	void sub() {
		System.out.println("sub");
	}
}
class Child2 extends Parent{
	int z=30,a=2;
	
	void div() {
		a=x;
		System.out.println("div");
	}
}



