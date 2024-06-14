/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemsimulasipengirimanbarang;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#,###.##");

        char lanjut;
        do {
            System.out.println("SELAMAT DATANG DI KALKULATOR EKSPEDISI A&MF");
            // Input Data Paket
            System.out.println("Masukkan detail paket:");
            System.out.print("Kota Asal: ");
            String kotaAsal = input.nextLine();
            System.out.print("Kota Tujuan: ");
            String kotaTujuan = input.nextLine();
            System.out.print("Jarak (km): ");
            double jarak = input.nextDouble();
            System.out.print("Berat Paket (kg): ");
            double beratPaket = input.nextDouble();
            System.out.print("Panjang Paket (cm): ");
            double panjang = input.nextDouble();
            System.out.print("Lebar Paket (cm): ");
            double lebar = input.nextDouble();
            System.out.print("Tinggi Paket (cm): ");
            double tinggi = input.nextDouble();
            
            // Buang newline character setelah nextDouble()
            input.nextLine();

            // Perhitungan Biaya Pengiriman
            double biayaPerKg = 2000; // Contoh biaya per kilogram
            double biayaTambahanDimensi = hitungBiayaTambahanDimensi(panjang, lebar, tinggi);
            double totalBiaya = hitungBiayaPengiriman(jarak, beratPaket, biayaPerKg, biayaTambahanDimensi);

            // Tampilan Ringkasan Pengiriman
            System.out.println("\nRingkasan Pengiriman:");
            System.out.println("Kota Asal: " + kotaAsal);
            System.out.println("Kota Tujuan: " + kotaTujuan);
            System.out.println("Jarak: " + jarak + " km");
            System.out.println("Berat Paket: " + beratPaket + " kg");
            System.out.println("Biaya Pengiriman: Rp" + formatter.format(totalBiaya));
            
            // Pembayaran
            double jumlahDibayarkan;
            do {
                System.out.print("Masukkan jumlah uang yang dibayarkan: Rp");
                jumlahDibayarkan = input.nextDouble();

                if (jumlahDibayarkan < totalBiaya) {
                    System.out.println("Uang yang dibayarkan kurang. Silakan bayar sesuai dengan total biaya pengiriman.");
                } else if (jumlahDibayarkan > totalBiaya) {
                    double kembalian = jumlahDibayarkan - totalBiaya;
                    System.out.println("Terima kasih! Kembalian Anda: Rp" + formatter.format(kembalian));
                }
            } while (jumlahDibayarkan < totalBiaya);



            // Meminta input untuk melanjutkan atau tidak
            System.out.print("\nApakah Anda ingin memproses paket lain? (Y/N): ");
            lanjut = input.next().charAt(0);

            // Buang newline character setelah nextChar()
            input.nextLine();
        } while (lanjut == 'Y' || lanjut == 'y');
        System.out.println("\nTerima kasih telah menggunakan layanan kami!");
        System.out.println("\nThis App Built By Aqil Muhammad Fachrezi (22552011065)");
        

        input.close();
    }

    // Fungsi untuk menghitung biaya tambahan berdasarkan dimensi paket
    public static double hitungBiayaTambahanDimensi(double panjang, double lebar, double tinggi) {
        // Implementasi sederhana, bisa disesuaikan dengan kebijakan biaya tambahan dimensi
        double volume = panjang * lebar * tinggi;
        if (volume > 10000) {
            return 50000; // Contoh: biaya tambahan jika volume > 10000 cm^3
        } else {
            return 0;
        }
    }

    // Fungsi untuk menghitung total biaya pengiriman
    public static double hitungBiayaPengiriman(double jarak, double berat, double biayaPerKg, double biayaTambahanDimensi) {
        return (jarak * biayaPerKg) + (berat * biayaPerKg) + biayaTambahanDimensi;
    }
}

