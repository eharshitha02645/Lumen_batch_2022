package com.training;
/*
 * All classes in Java either directly or indirectly extend the java.lang.Object class
 * 
 * Java Compiler Adds a default constructor to all the Java classes - If the user 
 * doesn't provide a constructor
 * 
 * Use javap to decompile and view the default constructor
 */


public class Greeting {
	public String getMessage() {
		System.out.println("Hi Team");
		return "Welcome to Java Programing";
		
	}
	
	public String getMessage(String name) {
		return "Hello " + name;
	}
	public void sumNumber(int a, int b) {
		System.out.println(a+b);
	}

}
