class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 18;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
