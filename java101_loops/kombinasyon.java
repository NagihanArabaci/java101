import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        // n!=1*2*3*4..*n
        // r!=1*2*3*4*..*r
        // c(n,r)=n!/(r!*(n-r)!)
        int n, r;
        double kombinasyon;
        int total = 1;
        int total1 = 1;
        int total2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        n = scanner.nextInt();
        System.out.println("Sayı giriniz: ");
        r = scanner.nextInt();
        int nr = n - r;

        for (int i = 1; i <= n; i++) {
            total = total * i;


        }
        System.out.println("total " + total);
        for (int j = 1; j <= r; j++) {
            total1 = total1 * j;

        }
        System.out.println("total1 " + total1);
        for (int k = 1; k <= nr; k++) {
            total2 = total2 * k;

        }
        System.out.println("total2 " + total2);
        kombinasyon = (double) total / (total1 * (total2));
        System.out.println("Girilen sayıların kombinasyon hali: " + kombinasyon);

    }
}
