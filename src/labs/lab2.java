package labs;

public class lab2 {

	public static void main(String[] args) {
		Student stu1=new Student("Janel","3578044956");
		Student stu2=new Student("John" ,"2367879997");
		Student stu3=new Student("Ezabel","5478044055");
		
		stu1.enroll("Math344");
		stu1.enroll("Eng567");
		stu1.enroll("Eng511");
		
		stu1.checkBalance();
		stu1.ShowCources();

	}
}
		class Student{
			//properties
			private static int iD=1000;
			private String name;
			private String ssn;
			private String email;
			private String userId;
			private String corces="";
			private static final int costOfCurce=800;
			private int balance=0;
			
			public Student(String name,String ssn ) {
				iD++;
				this.name=name;
				this.ssn=ssn;
				setUserId();
				setEmail();
				
			}
			
			private void setEmail() {
				email=name.toLowerCase()+"."+iD+"@gmail.com";
				System.out.println("Email is " +email );
			}
			
			private void setUserId() {
				int max=9000;
				int min=1000;
				int randNum=(int) (Math.random()*(max-min));
				randNum=randNum+min;
				userId=iD+""+randNum+ssn.substring(6);
				System.out.println("userId is " +userId );

			}
			
		 public void enroll(String corces) {
			this.corces =this.corces+corces;
			balance=balance+costOfCurce;

		 }
		 public void payToition(int ammaunt) {
			 balance=balance-ammaunt;
			 
		 }
		 public void checkBalance() {
				System.out.println(balance );

		 }
		 
		 public void ShowCources() {
				System.out.println(corces );

			 
		 }
		 public String toString() {
			 return null;
			 
		 }
			
		}
	

