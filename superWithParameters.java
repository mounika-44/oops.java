class Vehicle {
    Vehicle(String type) {
        System.out.println("Vehicle type: " + type);
    }
}

class Car extends Vehicle {
    Car(String type, String model) {
        super(type);
        System.out.println("Car model: " + model);
    }
}

public class SuperWithParameters {
    public static void main(String[] args) {
        Car c = new Car("Four Wheeler", "Tesla");
    }
}
