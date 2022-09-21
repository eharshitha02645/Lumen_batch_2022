package com.training;

public class StudentApplication {
	public static void main(String[] args) {
		Student detail = new Student();
		
		detail.setStudentName("Harshitha");
		detail.setRollNumber(14);
		detail.setBranch("Mechanical");
		detail.setCollege("IIITDM Kurnool");
		detail.setSemFee(87000);
		detail.setStudentId("118ME0014");
		detail.setMobileNumber(9494887088L);
		
		System.out.println(detail.getStudentName());
		System.out.println(detail.getRollNumber());
		System.out.println(detail.getBranch());
		System.out.println(detail.getCollege());
		System.out.println(detail.getSemFee());
		System.out.println(detail.getStudentId());
		System.out.println(detail.getMobileNumber());
		
		System.out.println(detail.toString());
		
	}

}
