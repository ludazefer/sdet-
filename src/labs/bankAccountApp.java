package labs;

public class bankAccountApp {

	public static void main(String[] args) {
          BankAccount acc1=new BankAccount("3456782345",1000);
          BankAccount acc2=new BankAccount("5678899766",2000);
          BankAccount acc3=new BankAccount("2345687957",2500);

          acc1.setName("Jim");
  		  System.out.println(acc1.getName());
  		  acc1.makeDeposit(500);
  		  acc1.makeDeposit(700);
  		  acc1.payBill(1000);
  		  acc1.accrue();
  		System.out.println(acc1.toString());

          
         
	}

}

class BankAccount implements IInttrest{
	//Property
	
	private static int iD=1000;
	private String accountNumber;
	private static final String routingNumber="057899098";
	private String name;
	private String SSN;
	private double balance;
	
	
	//Constructor
	
	public BankAccount(String SSN,double initDeposit) {
		balance=initDeposit;
		this.SSN=SSN;
		iD++;
		setAccountNumber();	
		
	}
	private void setAccountNumber() {
		int random=(int) (Math.random()*100);
		accountNumber=iD+""+random+SSN.substring(0, 2);
		System.out.println(accountNumber);
	
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;

	}
	public void payBill(double amount) {
		balance=balance-amount;
		showBalance();
	}
	public void makeDeposit(double amount) {
		balance=balance+amount;
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: " +balance);

	}
	@Override
	public void accrue() {
		balance=balance*(1+rate/100);	
		showBalance();

	}
	public String toString() {
		return "[name "+name+"]";
	}
	
	
}
