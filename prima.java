import java.util.Scanner;

public class prima {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Program cek prima\n");
        boolean ulangi = false;

        do {
            System.out.print("Inputkan angka : ");
            long angka = scan.nextLong();

            int p = 0;
            for (long i = 2; i <= angka; i++) {
                if ((angka % i) == 0) {
                    p++;
                }
            }

            if (p == 1) {
                System.out.println("prima\n");
            } else {
                System.out.println("bukan\n");
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
