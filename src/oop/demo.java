package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void work() {
		System.out.println("Work  "+name );

	}
	void eat() {
		System.out.println("Eat  "+name );

	}
	void sleep() {
		System.out.println("Sleep  "+name );

	}
}

public class demo {

	public static void main(String[] args) {

	Person person1=new Person();
	person1.name="Joe";
	person1.email="Joggge";
	
	person1.eat();
	person1.sleep();
	person1.work();
	}

}
