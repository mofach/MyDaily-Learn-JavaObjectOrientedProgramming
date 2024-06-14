package src;

/**
 *
 * @author AqilMFach
 */
// Definisi kelas Mobil
public class Mobil {
    private String merk;
    private String tipe;
    private int tahunProduksi;

    // Konstruktor
    public Mobil(String merk, String tipe, int tahunProduksi) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahunProduksi = tahunProduksi;
    }

    // Getter
    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    // Metode untuk menampilkan informasi mobil
    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}

