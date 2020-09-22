package week12b;

public class Animal {
	int age;
	String gender;
	int weight;
	
	public Animal(int age,String gender,int weight) {
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		System.out.println(age+ " " +gender+ " "+weight);
	}
	
	public void eat() {
		System.out.println("Eath...");
	}
	
	public void walk() {
		System.out.println("walking...");
	}
	
	public void sleep() {
		System.out.println("sleeping...");
	}
}
