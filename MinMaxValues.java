package com.basicprograms.loops;
import java.util.Scanner;
public class MinMaxValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		int a=s.nextInt();
//		int b=0,hd=0,ld=9,temp=a,shd=0,sld=9;
//		while(a>1){
//			
//			b=a%10;
//			
//			if(hd<b)
//				
//				hd=b;
//	
//			if(ld>b)
//				ld=b;
//
//			a=a/10;
//		}
//		a=temp;
//		
//		System.out.println("highest digit : "+hd);
//		System.out.println("lowest digit : "+ld);
//
//		while(a>1)
//		{
//			b=a%10;
//			if(shd<b && hd!=b)
//				shd=b;
//			
//			if(sld>b && ld!=b)
//				sld=b;
//			a=a/10;
//		}
//		System.out.println("Secound heighest digit"+shd);
//		System.out.println("Secound lowest digit"+sld);
		
		
		
		int num=10;
        for(int i=1;i<=num;i++){
            int count=0,temp=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                    temp=i;
                }
                if(count==2)
                    System.out.println(temp);
                
            }
            
        }
	}

}
