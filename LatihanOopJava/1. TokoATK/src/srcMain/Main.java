package srcMain;

// Main.java

public class Main {
    public static void main(String[] args) {
        PenjualAlatTulis penjual = new PenjualAlatTulis();

        // Setting data alat tulis
        penjual.setBolpoint(10, 2000);
        penjual.setPensil(10, 1000);
        penjual.setPenghapus(10, 500);

        // Menampilkan data alat tulis
        System.out.println("Selamat Datang di Toko ATK Haji Aqil Muhammad Fachrzi (22552011065)");
        System.out.println("Berikut data Alat Tulis Kantor yang kita jual");
        System.out.println("Data Bolpoint:");
        penjual.getBolpoint();

        System.out.println("\nData Pensil:");
        penjual.getPensil();

        System.out.println("\nData Penghapus:");
        penjual.getPenghapus();

        // Menampilkan total harga semua alat tulis
        penjual.displayTotalHarga();
        System.out.println("Terima Kasih sudah berbelanja");
    }
}

