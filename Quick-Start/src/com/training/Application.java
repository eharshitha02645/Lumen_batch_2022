package com.training;

public class Application {

	public /*final*/ static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Type variableName = new Constructor;
		
		Greeting grtObj = new Greeting();
		
		String response = grtObj.getMessage();
		System.out.println(response);
		System.out.println(grtObj.getMessage());
		
		
        String hello = grtObj.getMessage("nandini");
		System.out.println(hello);
		
		
        grtObj.sumNumber(9,3);
		

	}

}
