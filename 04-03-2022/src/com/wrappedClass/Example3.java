package com.wrappedClass;

public class Example3
{
public static void main(String[] args)
{
	// byte into Byte
	byte rank = 45;
	Byte b1=rank;
	Byte b2=Byte.valueOf(rank);
	System.out.println(b1);
	System.out.println(b2);
	System.out.println("************");
	
	// Byte into byte 
	Byte age=22;
	Byte myAge= new Byte(age);
	byte sisAge=myAge;
	byte momAge=myAge.byteValue();
	System.out.println(sisAge);
	System.out.println(momAge);
}
}
