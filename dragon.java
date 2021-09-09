public class dragon {
    public static void main(String[] args) {
        int gold = 0;
        int d = 0;
        int k = 0;

        int dragon[] = { 7, 2 };
        int knight[] = { 4, 3, 1, 2 };
        // int dragon[] = { 5, 4 };
        // int knight[] = { 7, 8, 4 };

        int n = dragon.length;
        int m = knight.length;

        while ((d < n) && (k < m)) {
            // while {
            if (knight[k] >= dragon[d]) {
                gold += knight[k];
                k++;
                d++;
                break;
            }
            // }
        }
        if (d == n) {
            System.out.println(gold);
        } else {
            System.out.println("knight fail");
        }

        // // dragon
        // for (int i = 0; i < n; i++) {
        // // knight
        // for (int j = 0; j < m; j++) {
        // if (knight[j] >= dragon[i]) {
        // // gold += knight[j];
        // System.out.println("Loowater is doomed!" + knight[j]);
        // i++;
        // }
        // // k = m;
        // }
        // // d = i;
        // // if (d == n) {
        // // System.out.println(gold);
        // // break;
        // // } else {
        // // System.out.println("Loowater is doomed!");
        // // }
        // }
    }
}