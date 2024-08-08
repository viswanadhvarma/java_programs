package com.basicprograms.loops;

public class ClassAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass myclass=new MyClass();
		
		for(int i=1;i<=200;i++) {
			
			int z=myclass.pali(i);
			if(i==z)
				System.out.println(z);
		}
		
		
		
	}
}

class MyClass{
	int num=12521;
	int pali(int x)
	{
		int temp=x,rev=0;
		while(temp>0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
			
		}
		return rev;
	
	}
//	void check() {
//		if(pali()==num)
//			System.out.println(num);
//	}
}
