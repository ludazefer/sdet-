package oop;

public class LoanAccount implements Irate {

	@Override
	public void setRate() {
		System.out.println("Rate");
		
	}

	@Override
	public void increseRate() {
		System.out.println("INCRESEING Rate");
		
	}
	public void setTerm(int terms) {		
		System.out.println("Settint the term to "+  terms+" yers");

	}
	public void setAmorShedule() {		
		System.out.println("Amor shedule ");

	}

	
}
