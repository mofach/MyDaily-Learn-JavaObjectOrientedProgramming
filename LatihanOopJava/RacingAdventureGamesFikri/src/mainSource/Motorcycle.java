package mainSource;

// Motorcycle.java
public class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String brand, String type) {
        super(brand);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle: " + brand + ", Type: " + type);
    }
}


