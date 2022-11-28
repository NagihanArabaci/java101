public class asalsayi {
    public static void main(String[] args) {
        int count, j;
        for (int i = 2; i <= 100; i++) {
            count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.print(i + "  ");
        }
    }
}

