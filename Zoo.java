package week12b;

public class Zoo {
	public static void main(String[]agre) {
		Animal zoo = new Animal(11,"female",158);
		Bird bird1 = new Bird(11,"female",160);
		Fish fish1 = new Fish(11,"male",150);
		
		zoo.age=15;
		zoo.gender="female";
		zoo.weight=165;
				
		bird1.fly();
		fish1.swim();
	}
}