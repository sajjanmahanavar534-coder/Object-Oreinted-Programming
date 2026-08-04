package single_inheritance;

//Defined Superclass as Animal

class Animals{
      
	void eat() {
		
	System.out.println("Animal is eating.");	
	
	}
}

//Defined Subclass as dog

class Dog extends Animals{
	
	void bark() {
		
	System.out.println("Dog is barking.");
		
	}
}

public class Animal {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Animals animals = new Animals();
		
		 animals.eat();   // Inherited method
	     dog.bark();  // Dog's own method
		
	}	
}

