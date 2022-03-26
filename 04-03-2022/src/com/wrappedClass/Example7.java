package com.wrappedClass;

public class Example7 {

	public static void main(String[] args) 
	{
		long l=20;
		Long l1=l;
		Long l2=Long.valueOf(l);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println("***********");
		
		long l3= 23;
		Long l4=new Long(l3);
		long l5=l4;
		long l6=l4.longValue();
		System.out.println(l5);
		System.out.println(l6);

	}

}
