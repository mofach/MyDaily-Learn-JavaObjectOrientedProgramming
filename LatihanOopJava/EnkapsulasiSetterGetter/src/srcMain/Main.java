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
        int[] bilangan = {2, 5, 3, 5, 9, 5};
        bilanganObjek.setBilangan(bilangan);

        // Menampilkan bilangan asli
        System.out.print("Bilangan asli: ");
        for (int num : bilanganObjek.getBilangan()) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Mengganti angka 5 dengan 1
        bilanganObjek.gantiAngka(5, 1);

        // Menampilkan bilangan setelah mengganti angka
        System.out.print("Bilangan setelah mengganti angka 5 dengan 1: ");
        for (int num : bilanganObjek.getBilangan()) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Mengalikan bilangan dengan 0.5
        bilanganObjek.kaliBilangan(0.5);

        // Menampilkan bilangan setelah dikalikan dengan 0.5
        System.out.print("Bilangan setelah dikalikan dengan 0.5: ");
        for (int num : bilanganObjek.getBilangan()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

