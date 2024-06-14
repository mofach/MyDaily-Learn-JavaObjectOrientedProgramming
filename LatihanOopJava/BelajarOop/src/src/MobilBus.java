package src;
// MobilBus merupakan subclass dari Mobil
public class MobilBus extends Mobil {
    private int kapasitasPenumpang;

    // Konstruktor
    public MobilBus(String merk, String tipe, int tahunProduksi, int kapasitasPenumpang) {
        super(merk, tipe, tahunProduksi);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    // Getter untuk kapasitas penumpang
    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }

    // Override metode displayInfo untuk menambahkan info kapasitas penumpang
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
    }
}

