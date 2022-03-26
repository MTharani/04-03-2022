package com.wrappedClass;

public class Example5 {

	public static void main(String[] args) 
	{
		boolean valid=true;
		Boolean valid1=valid;
		Boolean valid2=Boolean.valueOf(valid);
		System.out.println(valid1);
		System.out.println(valid2);
	    System.out.println("*************************");
        Boolean invalid=new Boolean(false);
        boolean invalid1=invalid;
        boolean invalid2=invalid.booleanValue();
        System.out.println(invalid1);
        System.out.println(invalid2);
	}

	
}
