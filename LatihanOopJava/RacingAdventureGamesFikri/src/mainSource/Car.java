package mainSource;

// Car.java
public class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + brand + ", " + numDoors + " doors");
    }
}

