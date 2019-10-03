package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bankAccount acc1=new bankAccount();
		acc1.accountNumber="123456";
		//acc1.name="Rogger";
		acc1.setName("Roggerrrr");
		acc1.setSsn("12345655555");
		
		acc1.balance=10000;
		acc1.deposit(5000);
		
		
		acc1.setRate();
		acc1.increseRate();
		
		System.out.println(acc1.getName());
		System.out.println("SSN is  "+acc1.getSsn());

	
	System.out.println(acc1.toString());
	
		
		bankAccount acc2=new bankAccount("checking account");
		acc2.accountNumber="123456";
		
		bankAccount acc3=new bankAccount("saving account",5000);
		acc3.accountNumber="123456";
		
	/*	
		CDaccount cd1=new CDaccount();
		cd1.balance=5000;
		cd1.name="John";
		cd1.intrestRate="4.5";
		cd1.accountNumber="CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		*/
		
	}

}
