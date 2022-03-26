package com.wrappedClass;

public class Example1 {

	public static void main(String[] args) 
	{
		//int to Integer
		int age =20;
		Integer myAge=age;
		Integer myAge1=Integer.valueOf(age);
		System.out.println(myAge);
		System.out.println(myAge1);
		
		System.out.println("************");
		// Integer to int
		Integer a = new Integer(33);
		int b=a;
		int c=a.intValue();
		System.out.println(b);
		System.out.println(c);

	}

}