package com.wrappedClass;

public class Example8 {

	public static void main(String[] args) 
	{
		double d=456.3;
		Double d1=d;
		Double d2=Double.valueOf(d);
		System.out.println(d1);
        System.out.println(d2);
        System.out.println("**********");
        Double d3=new Double(456.32);
        double d4=d3;
        double d5=d3.doubleValue();
        System.out.println(d4);
        System.out.println(d5);
	} 
	
	

}
