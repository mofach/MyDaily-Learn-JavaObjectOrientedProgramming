package mainSource;

// Vehicle.java
public abstract class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    public void accelerate(int amount) {
        speed += amount;
        System.out.println(brand + " accelerated to " + speed + " km/h.");
    }

    public void brake(int amount) {
        speed -= amount;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(brand + " slowed down to " + speed + " km/h.");
    }

    public void turn(String direction) {
        System.out.println(brand + " turned " + direction);
    }

    public void crash() {
        System.out.println(brand + " crashed!");
        System.out.println("Game Over!");
        // Implementasi logika untuk mengakhiri permainan atau melakukan reset
        System.exit(0);
    }

    public abstract void displayInfo();
}
