package srcMain;

/**
 *
 * @author AqilMFach
 */
// Main.java

public class Main {
    public static void main(String[] args) {
        Bilangan bilanganObjek = new Bilangan();

        // Set bilangan
        int[] bilangan = {-5, -3, -6, -3, -4};
        bilanganObjek.setBilangan(bilangan);
        System.out.println("Program statistika sederhana dengan paradigma OOP");
        System.out.println("By Aqil Muhammad Fachrezi (22552011065)\n");
        // Menampilkan bilangan
        System.out.print("Bilangan: ");
        for (int num : bilanganObjek.getBilangan()) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Mendapatkan dan menampilkan rata-rata
        double rataRata = bilanganObjek.getRataRata();
        System.out.println("a.) Nilai Rata-Rata: " + rataRata);

        // Mendapatkan dan menampilkan nilai maksimum
        int maksimum = bilanganObjek.getMaksimum();
        System.out.println("b.) Nilai Maksimum: " + maksimum);

        // Mendapatkan dan menampilkan nilai minimum
        int minimum = bilanganObjek.getMinimum();
        System.out.println("c.) Nilai Minimum: " + minimum);

        // Mendapatkan dan menampilkan indeks dari angka -3
        int target = -3;
        int[] indices = bilanganObjek.getIndexOf(target);
        System.out.print("d.) Angka " + target + " terdapat pada index: ");
        for (int index : indices) {
            System.out.print(index + " ");
        }
        System.out.println();
    }
}
