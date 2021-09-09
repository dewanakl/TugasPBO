import java.util.Scanner;

public class caribinary {

    public static int cariBinary(int daftar[], int awal, int akhir, int cari) {
        if (!(awal < akhir)) {
            return -1;
        }

        int tengah = (awal + akhir) / 2;

        if (daftar[tengah] < cari) {
            return cariBinary(daftar, tengah + 1, akhir, cari);
        } else if (daftar[tengah] > cari) {
            return cariBinary(daftar, awal, tengah, cari);
        } else {
            return tengah;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Binary Search Java");
        boolean ulangi = false;

        int daftar[] = { 1, 2, 5, 7, 8, 9, 12, 15, 19, 23, 25, 26, 27, 34, 47, 89 };

        do {
            System.out.println("1, 2, 5, 7, 8, 9, 12, 15, 19, 23, 25, 26, 27, 34, 47, 89");

            System.out.print("cari : ");
            int cari = scan.nextInt();

            int hasil = cariBinary(daftar, 0, daftar.length, cari);
            if (hasil == -1) {
                System.out.println("tidak ada dalam index");
            } else {
                System.out.println(cari + " terdapat pada index " + hasil);
            }
            System.out.print("Ulangi ? [y/n] : ");
            String lanjut = scan.next();

            if (lanjut.toLowerCase().equals("y")) {
                ulangi = true;
            } else {
                ulangi = false;
                scan.close();
                System.out.println("Program berhenti");
            }
        } while (ulangi);
    }
}
