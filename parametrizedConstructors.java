class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Person p1 = new Person("Tara", 20);
        p1.display();
    }
}
