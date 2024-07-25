package srcMain;

/**
 *
 * @author AqilMFach
 */
// Bilangan.java

public class Bilangan {
    private int[] bilangan;

    // Setter method
    public void setBilangan(int[] bilangan) {
        this.bilangan = bilangan;
    }

    // Getter method
    public int[] getBilangan() {
        return this.bilangan;
    }

    // Method untuk mengganti angka tertentu dengan angka baru
    public void gantiAngka(int target, int pengganti) {
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] == target) {
                bilangan[i] = pengganti;
            }
        }
    }

    // Method untuk mengalikan semua bilangan dengan suatu nilai
    public void kaliBilangan(double pengali) {
        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = (int) (bilangan[i] * pengali);
        }
    }
}

