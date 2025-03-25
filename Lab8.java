import java.util.ArrayList;

// Abstract class
abstract class Vehicle {
    String name;
    int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    abstract String makeSound();

    void drive() {
        System.out.println(name + " is driving.");
    }

    void drive(String terrain) {
        System.out.println(name + " is driving on " + terrain + ".");
    }
}

// Interface
interface WorkRole {
    String performTask();
}

// Car class
class Car extends Vehicle implements WorkRole {
    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    String makeSound() {
        return "Vroom!";
    }

    @Override
    public String performTask() {
        return "The car is usually a personal vehicle.";
    }
}

// Bike class
class Bike extends Vehicle implements WorkRole {
    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    String makeSound() {
        return "Ring ring!";
    }

    @Override
    public String performTask() {
        return "The bike is used for exercises and short distance transportation.";
    }
}

// Truck class
class Truck extends Vehicle implements WorkRole {
    public Truck(String name, int speed) {
        super(name, speed);
    }

    @Override
    String makeSound() {
        return "Honk!";
    }

    @Override
    public String performTask() {
        return "The truck is used for transporting goods.";
    }
}

// Fleet class
class Fleet {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    void dailyRoutine() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.name + ": " + vehicle.makeSound());
            if (vehicle instanceof WorkRole) {
                System.out.println(((WorkRole) vehicle).performTask());
            }
        }
    }
}

// Main class
public class Lab8 {
    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        fleet.addVehicle(new Car("Sedan", 120));
        fleet.addVehicle(new Bike("Mountain Bike", 30));
        fleet.addVehicle(new Truck("Freightliner", 80));

        fleet.dailyRoutine();
    }
}