interface Machine {
    String start();
}

abstract class Appliance implements Machine {
    String name;

    // Parent constructor requires a name
    public Appliance(String name) {
        this.name = name;
    }
}

class Fan extends Appliance {
    public Fan(String fan) {
        super(fan); // Pass the variable to the parent constructor
    }

    @Override
    public String start() {
        return "Fan is running";
    }
}

class WashingMachine extends Appliance {
    // Added missing constructor to satisfy the parent class
    public WashingMachine(String name) {
        super(name); // Pass the variable to the parent constructor
    }

    @Override
    public String start() {
        return "Washing Machine is operating";
    }
}

public class AIDemo {
    public static void main(String[] args) {

        // Changed reference types from 'Machina' to 'Machine'
        Machine fan = new Fan("Fan");
        Machine washer = new WashingMachine("Washing Machine");

        // Print the results directly
        System.out.println(fan.start());
        System.out.println(washer.start());
    }
}