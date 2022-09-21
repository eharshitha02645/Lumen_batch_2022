package com.training;

public class PersonalLoan extends Loan {
	
	private String profession;

	public PersonalLoan(String applicantName, double loanAmount, double tenure, String profession) {
		super(applicantName, loanAmount, tenure);
		this.setProfession(profession);
	}

	
	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	@Override
	public double calculateIntrest() {
		double rateOfIntrest = 0.15;
		if(profession.equals("ITEmployee")) {
			rateOfIntrest = 0.20;
		}
		return getLoanAmount()*getTenure()*rateOfIntrest;

	}


}
