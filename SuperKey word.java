class Parent {
    String name = "Parent";

    void display() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    String name = "Child";

    void display() {
        super.display();
        System.out.println("This is child class");
        System.out.println("Parent name: " + super.name);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
