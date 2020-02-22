package java4;

interface Animal {
	public abstract void sound();

}
class Pig implements Animal{
	
	public void sound() {
		System.out.println("¸Û¸Û");
	}
}

class Dog implements Animal {

	// ¹«È¿È­½ÃÅ°´Ù.
	public void sound() {
		System.out.println("¸Û¸Û");
	}
}

class Cat implements Animal {
	// ¹«È¿È­½ÃÅ°´Ù.
	public void sound() {
		System.out.println("¾ß¿Ë");
	}
}

class Bird implements Animal {
	// ¹«È¿È­½ÃÅ°´Ù.
	public void sound() {
		System.out.println("Â±¤‹");
	}
}
class Tiger implements Animal{
	public void sound() {
		System.out.println("¾îÈï");
	}
}
class Cow implements Animal{
	public void sound() {
		System.out.println("À½¸Þ");
	}
}

public class AnimalEx01 {

	static void play(Animal b) {
		b.sound();
	}

	public static void main(String[] args) {
		Bird b1= new Bird();
		play(b1);
		
		Cat c1 = new Cat();
		play(c1);
		
		Dog d1 = new Dog();
		play(d1);
		
		Tiger t1 = new Tiger();
		play(t1);
		
	    play(new Cow());
	    
	    play(new Pig());
	}

}
