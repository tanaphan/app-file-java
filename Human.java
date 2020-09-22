package week12b;

public class Human {
	String name ;
	int age;
	int height;
	String eyeColor;
	public Human() {
		
	}
	
	public void display() {
		System.out.println("Hello, my name is "+name);
		System.out.println("I am "+ age + " year old");
		System.out.println("I am "+ height + " inches tall");
		System.out.println("My eye color is " + eyeColor);
		System.out.println("======" +name+ "======");
	}
	
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
	public void work() {
		System.out.println("Working...");
	}
}
