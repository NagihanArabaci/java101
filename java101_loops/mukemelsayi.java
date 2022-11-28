import java.util.Scanner;

public class mukemelsayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                sum += i;
            }


        }
        if (sum == sayi) {
            System.out.println(sayi + " Mükemmel sayıdır");
        } else System.out.println(sayi + " Mükemmel sayı dağildir");
    }
}
