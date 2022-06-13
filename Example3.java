package org.jsp.MethodOverloading;

public class Example3 
{
	public static void main(String[] args) 
	{
		m1(40,240);
		Example3 e1 = new Example3();
		e1.m1(100, 200);
	}
	public static void m1(int g,int h)
	{
		System.out.println(g);
		System.out.println(h);
	}
	public void m12(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}

}
