import java.util.Arrays;

public class dragon {
    public static void main(String[] args) {
        int dragon[] = { 7, 2 };
        int knight[] = { 2, 1, 8, 5 };

        Arrays.sort(dragon);
        Arrays.sort(knight);

        int total = 0;
        int d = 0;

        for (int k : knight) {
            if ((d < dragon.length) && (k >= dragon[d])) {
                total += k;
                d++;
            }
        }

        if (d == dragon.length) {
            System.out.println(total);
        } else {
            System.out.println("Knight Fall");
        }
    }
}