package week4;
class Animal<T>{
	T a;
	void eat() {
		System.out.println("냠냠");
	}
}
class Cat extends Animal{
	int b;
	void meow(){
		System.out.println("야옹");
	}
}
public class ClassCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal<Integer> an = new Animal();
		an.eat();
		Cat cat = new Cat();
		cat.eat(); cat.meow();
		Animal an2 = new Cat();
		Cat cat2 =  (Cat)an2;
		cat2.meow();

	}

}
