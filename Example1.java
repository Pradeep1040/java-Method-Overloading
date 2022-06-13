package org.jsp.MethodOverloading;

public class Example1 
{
	public static void main(String[] args) 
	{
		display();
		display(100);
		
	}
	
public static void  display()
{
	System.out.println("without parameter method");
}
public static void display(int x)
{
	System.out.println("With parameter method");
}
}
