package bacics;

public class NumbersCulc {
	
	public static void main(String[] args) {
		printName();
		int numa=10;
		int numb=14;
		addNumbers(numa,numb);
		multNum(numa,numb);
		
	}
		
		static void printName() {
			System.out.println("My name is ggg");
			
		}
	
		
		static void addNumbers(int numbera, int numberb)  {
			
		int sum=numbera+numberb;
			System.out.println("sum is "+sum );
			
		}
		
		static int multNum(int valuea, int valueb)  {
			
			int mult=valuea*valueb;
			System.out.println("Mult is "+mult );

			return mult;
				
			}

}
