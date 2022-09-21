package com.training;

public class Student {
	
	private String studentName;
	private int rollNumber;
	private String branch;
	private String college;
	private double semFee;
	private String studentId;
	private long mobileNumber;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public double getSemFee() {
		return semFee;
	}
	public void setSemFee(double semFee) {
		this.semFee = semFee;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNumber=" + rollNumber + ", branch=" + branch
				+ ", college=" + college + ", semFee=" + semFee + ", studentId=" + studentId + ", mobileNumber="
				+ mobileNumber + "]";
	}
	
	
	
	

}
