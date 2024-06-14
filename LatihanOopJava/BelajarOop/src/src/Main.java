package src;

/**
 *
 * @author AqilMFach
 */
import java.util.Scanner;

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mobil[] mobilArray = new Mobil[10]; // Array untuk menyimpan objek mobil
        int jumlahMobil = 0;

        // Data awal mobil
        mobilArray[jumlahMobil++] = new MobilKeluarga("Toyota", "SUV", 2019, 7);
        mobilArray[jumlahMobil++] = new MobilBus("Mercedes", "Bus", 2020, 40);

        // Loop menu utama
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Lihat mobil");
            System.out.println("2. Tambah mobil");
            System.out.println("3. Edit mobil");
            System.out.println("4. Hapus mobil");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Menampilkan info semua mobil yang sudah ditambahkan
                    System.out.println("\nDaftar Mobil:");
                    for (int i = 0; i < jumlahMobil; i++) {
                        System.out.println((i + 1) + ". ");
                        mobilArray[i].displayInfo();
                        System.out.println();
                    }
                    break;
                case 2:
                    // Tambah mobil
                    System.out.print("\nMerk mobil: ");
                    String merk = scanner.next();
                    System.out.print("Tipe mobil: ");
                    String tipe = scanner.next();
                    System.out.print("Tahun produksi mobil: ");
                    int tahunProduksi = scanner.nextInt();
                    System.out.print("Jumlah kursi (0 jika bukan mobil keluarga): ");
                    int jumlahKursi = scanner.nextInt();

                    if (jumlahKursi > 0) {
                        // Mobil keluarga
                        mobilArray[jumlahMobil] = new MobilKeluarga(merk, tipe, tahunProduksi, jumlahKursi);
                    } else {
                        // Mobil biasa (bukan keluarga)
                        System.out.print("Kapasitas penumpang bus: ");
                        int kapasitasPenumpang = scanner.nextInt();
                        mobilArray[jumlahMobil] = new MobilBus(merk, tipe, tahunProduksi, kapasitasPenumpang);
                    }

                    jumlahMobil++;
                    System.out.println("Mobil berhasil ditambahkan!");
                    break;
                case 3:
                    // Edit mobil
                    System.out.print("\nNomor mobil yang akan diedit: ");
                    int nomorEdit = scanner.nextInt() - 1;

                    if (nomorEdit >= 0 && nomorEdit < jumlahMobil) {
                        // Memilih mobil yang akan diedit
                        Mobil mobilEdit = mobilArray[nomorEdit];

                        // Menampilkan informasi mobil sebelum diedit
                        System.out.println("\nInformasi mobil sebelum diedit:");
                        mobilEdit.displayInfo();

                        // Memasukkan data baru
                        System.out.print("\nMerk mobil baru: ");
                        merk = scanner.next();
                        System.out.print("Tipe mobil baru: ");
                        tipe = scanner.next();
                        System.out.print("Tahun produksi mobil baru: ");
                        tahunProduksi = scanner.nextInt();
                        System.out.print("Jumlah kursi (0 jika bukan mobil keluarga): ");
                        jumlahKursi = scanner.nextInt();

                        if (jumlahKursi > 0) {
                            // Mobil keluarga
                            mobilEdit = new MobilKeluarga(merk, tipe, tahunProduksi, jumlahKursi);
                        } else {
                            // Mobil biasa (bukan keluarga)
                            System.out.print("Kapasitas penumpang bus: ");
                            int kapasitasPenumpang = scanner.nextInt();
                            mobilEdit = new MobilBus(merk, tipe, tahunProduksi, kapasitasPenumpang);
                        }

                        mobilArray[nomorEdit] = mobilEdit;

                        // Menampilkan informasi mobil setelah diedit
                        System.out.println("\nMobil berhasil diedit! Informasi baru:");
                        mobilEdit.displayInfo();
                    } else {
                        System.out.println("Nomor mobil tidak valid.");
                    }
                    break;
                case 4:
                    // Hapus mobil
                    System.out.print("\nNomor mobil yang akan dihapus: ");
                    int nomorHapus = scanner.nextInt() - 1;

                    if (nomorHapus >= 0 && nomorHapus < jumlahMobil) {
                        for (int i = nomorHapus; i < jumlahMobil - 1; i++) {
                            mobilArray[i] = mobilArray[i + 1];
                        }
                        mobilArray[jumlahMobil - 1] = null;
                        jumlahMobil--;
                        System.out.println("Mobil berhasil dihapus!");
                    } else {
                        System.out.println("Nomor mobil tidak valid.");
                    }
                    break;
                case 5:
                    // Keluar dari program
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

