package mainSrc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Doctor> doctors = new ArrayList<>();
    private static List<Patient> patients = new ArrayList<>();
    private static List<Schedule> schedules = new ArrayList<>();

    public static void main(String[] args) {
        initializeData();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=====================================");
            System.out.println("|   Selamat datang di SIRUSA        |");
            System.out.println("|   (Sistem Informasi Rumah Sakit)  |");
            System.out.println("=====================================");
            System.out.println("| Silahkan pilih menu di bawah:     |");
            System.out.println("| 1. Kelola Dokter                  |");
            System.out.println("| 2. Kelola Pasien                  |");
            System.out.println("| 3. Jadwal Dokter                  |");
            System.out.println("| 4. Keluar                         |");
            System.out.println("=====================================");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    manageDoctors(scanner);
                    break;
                case 2:
                    managePatients(scanner);
                    break;
                case 3:
                    viewDoctorSchedules();
                    break;
                case 4:
                    System.out.println("=======================================");
                    System.out.println("|    Terima kasih telah menggunakan   |");
                    System.out.println("|              SIRUSA                 |");
                    System.out.println("| Dikembangkan oleh:                  |");
                    System.out.println("| Gilang Nur Rizki (22552011037)      |");
                    System.out.println("| Aqil Muhammad Fachrezi (22552011065)|");
                    System.out.println("=======================================");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }

    private static void initializeData() {
        // Initialize doctors
        doctors.add(new Pediatrician("Dr. Ahmad", "Room 101", "08:00 - 14:00"));
        doctors.add(new Dentist("Dr. Budi", "Room 102", "09:00 - 15:00"));
        doctors.add(new Obstetrician("Dr. Citra", "Room 103", "10:00 - 16:00"));
        doctors.add(new Ophthalmologist("Dr. Dewi", "Room 104", "11:00 - 17:00"));
        doctors.add(new GeneralPractitioner("Dr. Eka", "Room 105", "12:00 - 18:00"));

        // Initialize schedules
        schedules.add(new Schedule("Monday", "Dr. Ahmad", "Pediatrician", "Room 101", "08:00 - 14:00"));
        schedules.add(new Schedule("Tuesday", "Dr. Budi", "Dentist", "Room 102", "09:00 - 15:00"));
        schedules.add(new Schedule("Wednesday", "Dr. Citra", "Obstetrician", "Room 103", "10:00 - 16:00"));
        schedules.add(new Schedule("Thursday", "Dr. Dewi", "Ophthalmologist", "Room 104", "11:00 - 17:00"));
        schedules.add(new Schedule("Friday", "Dr. Eka", "General Practitioner", "Room 105", "12:00 - 18:00"));
    }

    private static void manageDoctors(Scanner scanner) {
        while (true) {
            System.out.println("=====================================");
            System.out.println("|          Kelola Dokter            |");
            System.out.println("=====================================");
            System.out.println("| 1. Lihat Dokter                   |");
            System.out.println("| 2. Tambah Dokter                  |");
            System.out.println("| 3. Kembali ke Menu Utama          |");
            System.out.println("=====================================");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    viewDoctors();
                    break;
                case 2:
                    addDoctor(scanner);
                    break;
                case 3:
                    return; // Return to main menu
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }

    private static void managePatients(Scanner scanner) {
        while (true) {
            System.out.println("=====================================");
            System.out.println("|          Kelola Pasien            |");
            System.out.println("=====================================");
            System.out.println("| 1. Lihat Pasien                   |");
            System.out.println("| 2. Tambah Pasien                  |");
            System.out.println("| 3. Kembali ke Menu Utama          |");
            System.out.println("=====================================");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    viewPatients();
                    break;
                case 2:
                    inputPatientData(scanner);
                    break;
                case 3:
                    return; // Return to main menu
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
    

    private static void viewDoctors() {
        System.out.println("Daftar Dokter:");
        if (doctors.isEmpty()) {
            System.out.println("Tidak ada data dokter yang tersedia.");
        } else {
            for (Doctor doctor : doctors) {
                System.out.println(doctor);
            }
        }
        System.out.println();
    }

    private static void viewPatients() {
        System.out.println("Daftar Pasien:");
        if (patients.isEmpty()) {
            System.out.println("Tidak ada data pasien yang tersedia.");
        } else {
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }
        System.out.println();
    }

    private static void viewDoctorSchedules() {
        System.out.println("Jadwal Dokter:");
        if (schedules.isEmpty()) {
            System.out.println("Tidak ada jadwal dokter yang tersedia.");
        } else {
            for (Schedule schedule : schedules) {
                System.out.println(schedule);
            }
        }
        System.out.println();
    }

    private static void inputPatientData(Scanner scanner) {
        System.out.println("Input Data Pasien:");
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        System.out.print("Ruangan (General/VIP/President Suite): ");
        String room = scanner.nextLine();
        System.out.print("Jenis Kelamin: ");
        String gender = scanner.nextLine();
        System.out.print("Usia: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Keluhan: ");
        String complaint = scanner.nextLine();

        Patient patient;
        if (room.equalsIgnoreCase("General")) {
            patient = new GeneralRoomPatient(name, gender, age, new Date(), complaint);
        } else if (room.equalsIgnoreCase("VIP")) {
            patient = new VIPRoomPatient(name, gender, age, new Date(), complaint);
        } else {
            patient = new PresidentSuitePatient(name, gender, age, new Date(), complaint);
        }

        patients.add(patient);
        System.out.println("Data pasien berhasil ditambahkan.\n");
    }

    private static void addDoctor(Scanner scanner) {
        System.out.println("Tambah Dokter:");
        System.out.print("Nama Dokter: ");
        String name = scanner.nextLine();
        System.out.print("Bidang (Pediatrician/Dentist/Obstetrician/Ophthalmologist/General Practitioner): ");
        String field = scanner.nextLine();
        System.out.print("Ruangan: ");
        String room = scanner.nextLine();
        System.out.print("Jadwal Praktek (e.g., 08:00 - 14:00): ");
        String schedule = scanner.nextLine();

        Doctor doctor;
        switch (field.toLowerCase()) {
            case "pediatrician":
                doctor = new Pediatrician(name, room, schedule);
                break;
            case "dentist":
                doctor = new Dentist(name, room, schedule);
                break;
            case "obstetrician":
                doctor = new Obstetrician(name, room, schedule);
                break;
            case "ophthalmologist":
                doctor = new Ophthalmologist(name, room, schedule);
                break;
            case "general practitioner":
                doctor = new GeneralPractitioner(name, room, schedule);
                break;
            default:
                System.out.println("Bidang dokter tidak valid. Dokter tidak ditambahkan.");
                return;
        }

        doctors.add(doctor);
        System.out.println("Dokter berhasil ditambahkan.\n");
    }
}
