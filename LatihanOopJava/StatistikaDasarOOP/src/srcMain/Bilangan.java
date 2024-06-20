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

    // Method untuk menghitung rata-rata
    public double getRataRata() {
        int total = 0;
        for (int num : bilangan) {
            total += num;
        }
        return (double) total / bilangan.length;
    }

    // Method untuk mencari nilai maksimum
    public int getMaksimum() {
        int max = bilangan[0];
        for (int num : bilangan) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method untuk mencari nilai minimum
    public int getMinimum() {
        int min = bilangan[0];
        for (int num : bilangan) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method untuk mencari indeks dari angka tertentu
    public int[] getIndexOf(int target) {
        int[] indices = new int[bilangan.length];
        int count = 0;
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i] == target) {
                indices[count] = i;
                count++;
            }
        }
        int[] result = new int[count];
        System.arraycopy(indices, 0, result, 0, count);
        return result;
    }
}
