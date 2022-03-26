package com.wrappedClass;

public class Example4 {

	public static void main(String[] args)
	{
		char grade='d';
	Character grade1=grade;
	Character grade2=Character.valueOf(grade);
	System.out.println(grade1);
	System.out.println(grade2);
	System.out.println("**************");
	Character rank = new Character('3');
    char rank1=rank;
    char rank2=rank.charValue();
    System.out.println(rank1);
    System.out.println(rank2);
	}

}
