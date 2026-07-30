package inher;


class animal{
	String name = "sajjan";
	int age=1;
	void eat() {
		 System.out.println(name +" is eating his treat");   
    }
	void walk() {
	    System.out.println(name +" is going for walk in a garden");
	    
	}
}
	class dog extends animal{
		String breed="pomeranian";
		
		void bark() {
			System.out.println(name + "is barking at me");
		}
		void display() {
			 System.out.println("name ="+name);
			 System.out.println("age = " + age);
			 System.out.println("breed + " + breed);
		}
		
	}
	
	
public class Main{
	public static void main(String args[])
	{
		dog d =new dog();
		d.display();
		d.eat();
		d.walk();
		d.bark();
	}
}
	
	
