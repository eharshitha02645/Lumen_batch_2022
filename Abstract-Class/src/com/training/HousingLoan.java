package com.training;

public class HousingLoan extends Loan {
	
	private int propertyAge;
	private String location;
	
	
	public HousingLoan(String applicantName, double loanAmount, double tenure, int propertyAge,
			String location) {
		super(applicantName, loanAmount, tenure);
		this.propertyAge = propertyAge;
		this.location = location;
	}



	@Override
	public double calculateIntrest() {
		
		double rateOfIntrest = 0.10;
		if(propertyAge<5 && location.equals("AndhraPradesh")) {
			rateOfIntrest = 0.12;
		}
		return getLoanAmount()*getTenure()*rateOfIntrest;
	}

}
