import java.util.Scanner;

public class beskuvvet {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);

        }
        for (int j = 1; j <= n; j *= 5) {
            System.out.println(j);
        }
    }
}
