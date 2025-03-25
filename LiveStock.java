import java.util.ArrayList;

// Abstract class
abstract class Livestock {
    String name;
    int age;

    public Livestock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract String makeSound();

    void graze() {
        System.out.println(name + " is grazing.");
    }

    void graze(String food) {
        System.out.println(name + " is grazing on " + food + ".");
    }

    // Overloaded method
    String makeSound(int volume) {
        return makeSound() + " at volume " + volume;
    }
}

// Interface
interface WorkRole {
    String performTask();
}

// Horse class
class Horse extends Livestock implements WorkRole {
    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Neigh!";
    }

    @Override
    public String performTask() {
        return "The horse is used for riding.";
    }
}

// Sheep class
class Sheep extends Livestock implements WorkRole {
    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Baa!";
    }

    @Override
    public String performTask() {
        return "The sheep is used for cashmere products.";
    }
}

// Camel class
class Camel extends Livestock implements WorkRole {
    public Camel(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Grunt!";
    }

    @Override
    public String performTask() {
        return "The camel is used for desert transport.";
    }
}

// Goat class
class Goat extends Livestock implements WorkRole {
    public Goat(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Bleat!";
    }

    @Override
    public String performTask() {
        return "The goat is used for milk production.";
    }
}

// Herd class
class Herd {
    ArrayList<Livestock> livestock = new ArrayList<>();

    void addLivestock(Livestock animal) {
        livestock.add(animal);
    }

    void dailyRoutine() {
        for (Livestock animal : livestock) {
            System.out.println(animal.name + ": " + animal.makeSound());
            if (animal instanceof WorkRole) {
                System.out.println(((WorkRole) animal).performTask());
            }
        }
    }
}

// Main class
public class LiveStock {
    public static void main(String[] args) {
        Herd herd = new Herd();
        herd.addLivestock(new Horse("Mori", 4));
        herd.addLivestock(new Sheep("Honi", 2));
        herd.addLivestock(new Camel("Temee", 6));
        herd.addLivestock(new Goat("Ymaa", 3));

        herd.dailyRoutine();

        // Demonstrate polymorphism with an array of Livestock
        Livestock[] livestockArray = {
            new Horse("Mori", 4),
            new Sheep("Honi", 2),
            new Camel("Temee", 6),
            new Goat("Ymaa", 3)
        };

        System.out.println("\nDemonstrating polymorphism with graze method:");
        for (Livestock animal : livestockArray) {
            animal.graze();
        }
    }
}