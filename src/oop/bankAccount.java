package oop;

public class bankAccount implements Irate{
	String accountNumber;
	private static final String routingNumber="01234456";

	private String name;
	private String ssn;
	String accountTipe;
	double balance;
	
	
	
	
	
	
	
	
	bankAccount(){
		System.out.println("NEW ACCOUNT CRETOR");

	}
	bankAccount(String accountTipe){
		System.out.println("NEW ACCOUNT  " +accountTipe);

	}
	
	
	bankAccount(String accountTipe,double routingNumber){
		System.out.println("NEW ACCOUNT1  " +accountTipe);
		System.out.println("NEW ACCOUNT 1 " +routingNumber);

	}
	
	public void setName(String name) {
		this.name= "Mr "+name;
		
	}
	public String getName() {
		return name;
	}
	
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
		
			
	}
	
	
	//Interface method
	public void setRate() {
		System.out.println("SETTING RATE");

		
	}
    public void increseRate() {
		System.out.println("INCRESEING RATE");

		
	}
	
	
	//define method
	
	public void deposit(double amount) {
		balance=balance +amount;
		showActivity("DEPOSIT");
		
	}
	void withrow(double amount) {
		balance=balance +amount;
		showActivity("WITHROW");

		
	}
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT  activity "+ activity);
		System.out.println("YOUR BALANCE "+ balance);

	}
	void checkBalance() {
		System.out.println("Balance " +balance);
		
	}
	void getStatus() {
		
	}
	@Override
	public String toString() {
		return "[ NAME "+ name + " ACCOUNT " + accountNumber  + " ROUTING "+ routingNumber  +" BALANCE $ "+ balance +" ]";
		
	}

}
