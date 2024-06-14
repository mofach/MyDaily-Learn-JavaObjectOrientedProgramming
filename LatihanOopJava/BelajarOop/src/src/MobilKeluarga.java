package src;

/**
 *
 * @author AqilMFach
 */
// MobilKeluarga merupakan subclass dari Mobil
public class MobilKeluarga extends Mobil {
    private int jumlahKursi;

    // Konstruktor
    public MobilKeluarga(String merk, String tipe, int tahunProduksi, int jumlahKursi) {
        super(merk, tipe, tahunProduksi);
        this.jumlahKursi = jumlahKursi;
    }

    // Getter untuk jumlah kursi
    public int getJumlahKursi() {
        return jumlahKursi;
    }

    // Override metode displayInfo untuk menambahkan info jumlah kursi
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jumlah Kursi: " + jumlahKursi);
    }
}

