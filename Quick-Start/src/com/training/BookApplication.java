package com.training;

public class BookApplication {
	
	public static void main(String[] args) {
		
		Book headFirstJava = new Book();
		
		headFirstJava.setBookNumber(100);
		
		System.out.println(headFirstJava.getBookNumber());
		
		headFirstJava.setBookName("Haasitha");
		System.out.println(headFirstJava.getBookName());
		
		headFirstJava.setAuthor("Harshitha");
		System.out.println(headFirstJava.getAuthor());
		
		headFirstJava.setPrice(1000);
		System.out.println(headFirstJava.getPrice());
		
		System.out.println(headFirstJava.toString());
	}

}
