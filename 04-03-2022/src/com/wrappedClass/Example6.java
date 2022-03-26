package com.wrappedClass;

public class Example6 {

	public static void main(String[] args) 
	{
	  short s=20;
	  Short s1=s;
	  Short s2=Short.valueOf(s1);
	  System.out.println(s1);
	  System.out.println(s2);
	  System.out.println("***********");
	  Short s3=10;
      Short s4=new Short(s3);
      short s5=s4;
      short s6=s4.shortValue();
      System.out.println(s5);
      System.out.println(s6);
	}

}
