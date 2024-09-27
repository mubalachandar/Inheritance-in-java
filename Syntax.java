abstract class AbstractClass {
    abstract void display();
}
class Parent {
    String name;
    public Parent(String name) {
        this.name = name;
    }
}

class Child extends Parent  {

    public Child(String name) {
        super(name);
    }

    
    public void display() {
        System.out.println("Name: " + this.name);
    }
}


public class Syntax {
    public static void main(String[] args) {
        
        Child child = new Child("Charlie");

        
        child.display();  
    }
}