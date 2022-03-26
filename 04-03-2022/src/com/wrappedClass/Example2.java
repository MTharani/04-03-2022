package com.wrappedClass;

public class Example2 {

	public static void main(String[] args) 
	{
		// float into Float
		float a = 56.32f;
		Float b=a;
		Float c= Float.valueOf(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("********");
		
		// Float into float primitive value
		Float mark= new Float(56.46f);
		float mark1=mark;
		float mark2=mark.floatValue();
		System.out.println(mark1);
		System.out.println(mark2);

	}

}
