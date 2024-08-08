package com.basicprograms.loops;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<5;j++) {
//				System.out.print(" * ");
//			}
//			System.out.println(" * ");	
//		}

		
		for(int num=100;num<999;num++) {
			int count=0,rem=0,temp=num,ano=num;
			for(;ano>0;) {
				rem=ano%10;
				count++;
				ano=ano/10;
			}
			ano=num;
			int pow=0,sum=0;
			for(;ano>0;) {
				rem=ano%10;
				pow=(int)Math.pow(rem, count);
				sum+=pow;
				ano=ano/10;
			}
			
			if(temp==sum)
				System.out.println(sum);
			
		}
	}

}
