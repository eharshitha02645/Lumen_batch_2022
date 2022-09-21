package com.training;

//skelton
public class LoanService {
	
	private Loan[] loanList;
	
	private static int count = 0;
	public LoanService() {     
		super();
		
		this.loanList = new Loan[6]; 
	}
	
	
	public boolean addLoan(Loan loan) {
		
		loanList[count] = loan; 
		count++;
		
		return true;
	}
	public Loan[] getAll() {
		return this.loanList;
	}
	

}
