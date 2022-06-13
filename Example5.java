package org.jsp.MethodOverloading;

public class Example5 
{
	public static void main(String[] args) 
	{
		int x = m1(123,121);
		System.out.println(x);
		String a = m1('A','B');
		System.out.println(a);
		
	}
	
public static int m1(int x,int y)
{
	System.out.println(x);
	System.out.println(y);
	return 100;
}
public static String m1 (char a ,char b)
{
	System.out.println(a);
	System.out.println(b);
	return "Hello";
}

}