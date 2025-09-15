
class Vehicle {

    protected String brand;
    protected String model;
    protected int year;
    protected double price;
    protected String fuelType;

    public Vehicle(String brand, String model, int year, double price, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Fuel Type: " + fuelType);
    }

    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    public void honk() {
        System.out.println("Vehicle is honking");
    }
}

class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String brand, String model, int year, double price, String fuelType, int numberOfDoors) {
        super(brand, model, year, price, fuelType);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void honk() {
        System.out.println("Car is honking");
    }
}

class Bike extends Vehicle {

    private int numberOfGears;

    public Bike(String brand, String model, int year, double price, String fuelType, int numberOfGears) {
        super(brand, model, year, price, fuelType);
        this.numberOfGears = numberOfGears;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Gears: " + numberOfGears);
    }

    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }

    @Override
    public void honk() {
        System.out.println("Bike is honking");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {
        System.out.println("Vehicle Details:");
        Vehicle v1 = new Vehicle("Honda", "Civic", 2020, 20000, "Petrol");
        v1.displayInfo();
        v1.start();
        v1.stop();
        v1.honk();
        System.out.println();
        System.out.println("Car Details:");
        Car c1 = new Car("Honda", "Accord", 2020, 20000, "Petrol", 4);
        c1.displayInfo();
        c1.start();
        c1.stop();
        c1.honk();
        System.out.println();
        System.out.println("Bike Details:");
        Bike b1 = new Bike("Hero", "Splender", 2020, 10000, "Petrol", 6);
        b1.displayInfo();
        b1.start();
        b1.stop();
        b1.honk();
    }
}
