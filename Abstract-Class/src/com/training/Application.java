package com.training;

public class Application {
	
	public static void main(String[] args) {
		
		Loan applicant1 = 
				new HousingLoan("Haasitha",2000000.00,20.00,1,"AndhraPradesh");
		Loan applicant2 = 
				new HousingLoan("Haasitha",2000000.00,20.00,1,"Karnataka");
		Loan applicant3 = 
				new HousingLoan("Haasitha",2000000.00,20.00,7,"AndhraPradesh");
		
		Loan applicant4 = 
				new PersonalLoan("Anil",2000000.00,20.00,"business");
		Loan applicant5 = 
				new PersonalLoan("Mitish",2000000.00,20.00,"government");
		Loan applicant6 = 
				new PersonalLoan("Nitish",2000000.00,20.00,"ITEmployee");
		
		LoanService service = new LoanService();
				
			System.out.println("is Added:="+service.addLoan(applicant1));
			System.out.println("is Added:="+service.addLoan(applicant2));
			System.out.println("is Added:="+service.addLoan(applicant3));
			System.out.println("is Added:="+service.addLoan(applicant4));
			System.out.println("is Added:="+service.addLoan(applicant5));
			System.out.println("is Added:="+service.addLoan(applicant6));
//			    service.addLoan(applicant1);
//				service.addLoan(applicant2);
//				service.addLoan(applicant3);
//				service.addLoan(applicant4);
//				service.addLoan(applicant5);
//				service.addLoan(applicant6);
		
		Loan[] loans = service.getAll();
		
		for(Loan eachLoan: loans) {
			System.out.println("Intrest Amount:=" +eachLoan.calculateIntrest());
		}
	}

}
