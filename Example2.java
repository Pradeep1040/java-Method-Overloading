package org.jsp.MethodOverloading;

public class Example2 
{
	public static void main(String[] args)
	{
		view();
		view ("Bye");
		
	}
	public static void view()
	{
		int x = 100;
		System.out.println(x);
		
	}
	public static void view (String a)
	{
		
		int y = 300;
		System.out.println(y);
		System.out.println(a);
	}

}
