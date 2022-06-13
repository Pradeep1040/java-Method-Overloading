package org.jsp.MethodOverloading;

public class Example4 
{
	public static void main(String[] args) 
	{
	  m1(121,31);
	  m1("Ram","syam");
	}


public static void m1(int a,int b)
{
	System.out.println(a);
	System.out.println(b);
}
public static void m1(String a, String b)
{
	System.out.println(a);
	System.out.println(b);
	
}
}
