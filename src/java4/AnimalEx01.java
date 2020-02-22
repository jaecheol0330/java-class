package java4;

interface Animal {
	public abstract void sound();

}
class Pig implements Animal{
	
	public void sound() {
		System.out.println("�۸�");
	}
}

class Dog implements Animal {

	// ��ȿȭ��Ű��.
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat implements Animal {
	// ��ȿȭ��Ű��.
	public void sound() {
		System.out.println("�߿�");
	}
}

class Bird implements Animal {
	// ��ȿȭ��Ű��.
	public void sound() {
		System.out.println("±��");
	}
}
class Tiger implements Animal{
	public void sound() {
		System.out.println("����");
	}
}
class Cow implements Animal{
	public void sound() {
		System.out.println("����");
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
