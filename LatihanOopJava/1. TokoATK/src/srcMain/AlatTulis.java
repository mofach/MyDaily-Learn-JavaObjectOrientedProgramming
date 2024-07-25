package srcMain;

// AlatTulis.java

public class AlatTulis {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int hargaTotal;

    // Setter method
    public void setAlatTulis(String nama, int stok, int hargaSatuan) {
        this.nama = nama;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
        this.hargaTotal = stok * hargaSatuan;
    }

    // Getter method
    public void getAlatTulis() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Stok: " + this.stok);
        System.out.println("Harga Satuan: Rp. " + this.hargaSatuan);
        System.out.println("Harga Total: Rp. " + this.hargaTotal);
    }

    // Method untuk mendapatkan harga total
    public int getHargaTotal() {
        return this.hargaTotal;
    }
}

