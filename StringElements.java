package com.basicprograms.loops;

import java.util.Arrays;

public class StringElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String s="Hello all",s2="";
//		char s1;
//		s=s.toLowerCase();
//		//System.out.println(s);
//		for(int i=0;i<s.length();i++)
//		{
//			
//			s1=s.charAt(i);
//			if(s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u')
//			{
//				s2=s2+(char)(s1-32);
//				
//			}
//			else if (s1==' ')
//			{
//				s2=s2+'_';
//				
//			}
//			else
//				s2=s2+s1;
//			
//			
//		}
//		System.out.println(s2);
//		
//		op:  hEllO_All

		
//		Integer num=121;
//		String s=num.toString(),s1="";
//		StringBuffer k= new StringBuffer(s);
//		k.reverse();
//		s1=k.toString();
//		if(s1.equals(s))
//		{
//			System.out.println("p");
//			
//		}
//		else
//			System.out.println("np");
//		
		
		
		
//		String s="hello1@2 all 2 and 1",s1="",s2;
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			if(c>='0'&&c<='9')
//				s1=s1+c;
//		}
//		StringBuffer k=new StringBuffer(s1);
//		k.reverse();
//		s2=k.toString();
//		if(s1.equals(s2))
//			System.out.println("p");
//		else
//			System.out.println("np");
//		
//		
		
		
//		String s="A man 1, aplan 2& a canal % panama .",s1="",s2;
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			if(c>='a'&&c<='z'||c>='A'&&c<='Z')
//				s1=s1+c;
//			
//		}
//		StringBuffer k=new StringBuffer(s1);
//		k.reverse();
//		s2=k.toString();
//		if(s2.equalsIgnoreCase(s1))
//			System.out.println("p");
//		else
//			System.out.println("np");
//		
		
		
		
		
//		String s="hello all good morinng how are you",s1="";
//		String str[]=s.split(" ");
//		
//		for(int i=0;i<str.length;i++)
//		{
//			String word=str[i];
//			for(int j=0;j<word.length();j++)
//			{
//				char letter=word.charAt(j);
//				if(j==0||j==word.length()-1)
//				{
//					
//					s1=s1+Character.toUpperCase(letter);
//				}
//				else
//					s1=s1+Character.toLowerCase(letter);
//			}
//			s1=s1+" ";
//			
//		}
//		
//		
//		System.out.println(s1);
		
		
		
		
//		String s="hello all good morinng how are you",s1="";
//		String str[]=s.split(" ");
//		
//		for(int i=0;i<str.length;i++)
//		{
//			String word=str[i];
//			for(int j=0;j<word.length();j++)
//			{
//				char letter=word.charAt(j);
//				if(word.indexOf(letter)==word.lastIndexOf(letter))
//				{
//					s1=s1+letter;
//				}
//			}
//			s1=s1+" ";
//			
//		}
//		
//		
//		System.out.println(s1);
//		
//		op: heo a gd morig how are you 
		
		
		
//		Anagram or not
		
//		String s1="silent",s2="listen";
//		char l[]=s1.toCharArray();
//		char k[]=s2.toCharArray();
//		Arrays.sort(k);
//		Arrays.sort(l);
//		if(l.length==k.length)
//		{
//			boolean b=Arrays.equals(l, k);
//			if(b)
//			{
//				System.out.println("anagram");
//			}
//			else
//			{
//				System.out.println("not anagram");
//			}
//		}
//		else
//		{
//			System.out.println("not anagram");
//		}
//		
		
		
//		String s="Hello All Good Morinng How Are You",s1="",s2="";
//		
//		//OP: OlLeH AlL dOoG mOrNiNg wOh aRe uOy
//		System.out.println(s.length());
//		
//		for(int i=0;i<s.length();i++)
//		{
//			char k=s.charAt(i),m;
//			if(i%2==0)
//			{
//				if(k>='a'&&k<='z')
//				{
//					
//					m=Character.toUpperCase(k);
//					s1=s1+m;
//					
//				}
//				else
//					
//					s1=s1+k;
//				
//			}
//			else
//			{
//				m=Character.toLowerCase(k);
//				s1=s1+m;
//				
//			}
//			
//		}
//		System.out.println(s1);
//		String z[]=s1.split(" ");
//		System.out.println(Arrays.toString(z));
//		for(int i=0;i<z.length;i++)
//		{
//			if(i%2==0)
//			{
//				StringBuffer sb=new StringBuffer(z[i]);
//				String y=sb.reverse().toString();
//				s2=s2+y;
//			}
//			
//			else
//				s2=s2+z[i];
//			if(i<z.length-1)
//				s2=s2+"&";
//		}
//		
//		System.out.println(s2);
//
//		
		//op: OlLeH&AlL&dOoG&mOrInNg&wOh&aRe&uOy
		
		
		
		String s="z10b5c3",s1="";
		int a;
		
		for(int i=0;i<s.length();i++)
		{
			
			char l=s.charAt(i);
			if(Character.isAlphabetic(l))
			{
				int m=0;
				for(int j=i+1;j<s.length();j++)
				{
					char k=s.charAt(j);
					if(Character.isDigit(k))
					{
						int num=Character.getNumericValue(k);
						m=m*10+num;
					}
					else if(Character.isAlphabetic(l))
						break;
					
				}
				
				
				System.out.println(m);
				for(int j=0;j<m;j++)
				{
					s1+=l;
				}
			}
		}
		
		
		System.out.println(s1);
		
		
		
//		String s = "Hello All 123 # $ & GoOd MorninG";
//
//		int u_count = 0, l_count = 0, d_count = 0, s_count = 0, symbol = 0;
//
//		for (int x = 0; x < s.length(); x++) {
//		    char c = s.charAt(x);
//
//		    if (Character.isUpperCase(c)) {
//		        u_count++;
//		    } else if (Character.isLowerCase(c)) {
//		        l_count++;
//		    } else if (Character.isDigit(c)) {
//		        d_count++;
//		    } else if (c == ' ') {
//		        s_count++;
//		    } else {
//		        symbol++;
//		    }
//		}
//
//		System.out.println("no of upper case letters is " + u_count);
//		System.out.println("no of lower case letters is " + l_count);
//		System.out.println("no of digits is " + d_count);
//		System.out.println("no of spaces is " + s_count);
//		System.out.println("no of symbols is " + symbol);
		
	}

}
