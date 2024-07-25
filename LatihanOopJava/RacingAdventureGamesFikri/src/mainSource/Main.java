package mainSource;

// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to DriveSimulator!");

        // Input nama kendaraan dari pengguna
        System.out.print("Enter vehicle brand: ");
        String brand = scanner.nextLine();

        // Input jenis kendaraan dari pengguna
        System.out.print("Enter vehicle type (Car/Motorcycle): ");
        String vehicleType = scanner.nextLine();

        Vehicle vehicle;

        if (vehicleType.equalsIgnoreCase("Car")) {
            // Input jumlah pintu untuk mobil
            System.out.print("Enter number of doors: ");
            int numDoors = scanner.nextInt();
            vehicle = new Car(brand, numDoors);
        } else if (vehicleType.equalsIgnoreCase("Motorcycle")) {
            // Input jenis untuk sepeda motor
            System.out.print("Enter type of motorcycle: ");
            String type = scanner.next();
            vehicle = new Motorcycle(brand, type);
        } else {
            System.out.println("Invalid vehicle type. Exiting...");
            return;
        }

        // Operasi pada kendaraan
        vehicle.displayInfo();

        boolean gameOver = false;

        while (!gameOver) {
            System.out.println("\nSelect an action:");
            System.out.println("1. Accelerate");
            System.out.println("2. Brake");
            System.out.println("3. Turn");
            System.out.println("4. Crash (End Game)");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter acceleration amount: ");
                    int amount = scanner.nextInt();
                    vehicle.accelerate(amount);
                    break;
                case 2:
                    System.out.print("Enter braking amount: ");
                    amount = scanner.nextInt();
                    vehicle.brake(amount);
                    break;
                case 3:
                    System.out.print("Enter direction (left/right): ");
                    String direction = scanner.next();
                    vehicle.turn(direction);
                    break;
                case 4:
                    vehicle.crash();
                    gameOver = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}

