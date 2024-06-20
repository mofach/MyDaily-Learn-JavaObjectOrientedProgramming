package srcMain;

// PenjualAlatTulis.java

public class PenjualAlatTulis {
    private AlatTulis bolpoint;
    private AlatTulis pensil;
    private AlatTulis penghapus;

    public PenjualAlatTulis() {
        this.bolpoint = new AlatTulis();
        this.pensil = new AlatTulis();
        this.penghapus = new AlatTulis();
    }

    // Setter method
    public void setBolpoint(int stok, int hargaSatuan) {
        this.bolpoint.setAlatTulis("Bolpoint", stok, hargaSatuan);
    }

    public void setPensil(int stok, int hargaSatuan) {
        this.pensil.setAlatTulis("Pensil", stok, hargaSatuan);
    }

    public void setPenghapus(int stok, int hargaSatuan) {
        this.penghapus.setAlatTulis("Penghapus", stok, hargaSatuan);
    }

    // Getter method
    public void getBolpoint() {
        this.bolpoint.getAlatTulis();
    }

    public void getPensil() {
        this.pensil.getAlatTulis();
    }

    public void getPenghapus() {
        this.penghapus.getAlatTulis();
    }

    // Method untuk mendapatkan total harga semua alat tulis
    public int getTotalHarga() {
        return this.bolpoint.getHargaTotal() + this.pensil.getHargaTotal() + this.penghapus.getHargaTotal();
    }

    // Method untuk menampilkan total harga
    public void displayTotalHarga() {
        System.out.println("Total Harga Semua Alat Tulis: Rp. " + getTotalHarga());
    }
}

