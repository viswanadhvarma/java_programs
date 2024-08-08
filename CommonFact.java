package com.basicprograms.loops;

public class CommonFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=3,i=1;
		while (a>i)
		{
			
			if(a%2!=0)
			{
				a=(3*a)+1;
			}
			else
				a=a/2;
			System.out.println(a);
		}
		*/
		
//		int a=13,b=26,c=1,z=1,k=1;
//		if(a<b)
//			c=b;
//		else
//			c=a;
//		
//		while(c>k)//24>1
//		{
//			if(a%c==0 && b%c==0)//12%24 && 24&24  12%12 && 24%12 12%11 12%6&& 24%6
//			{
//				if(k!=c)
//					z=c;
//				
//			}
//			
//			c--;//23 11
//		}
//		System.out.println(z);
//		
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		for (int i = 0; i < myNumbers.length; ++i) 
		{
			for(int j = 0; j < myNumbers[i].length; ++j) 
			{
				System.out.println(myNumbers[i][j]);
			}
		}
		
		}

	}


