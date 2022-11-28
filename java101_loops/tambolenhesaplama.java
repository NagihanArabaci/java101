import java.util.Scanner;

public class tambolenhesaplama {
    static void findDivisors(int n) {
        double avg;
        int sum = 0;
        int counter = 0;

        for (int i = 0; i <= n; i++) {
            System.out.println("i değerler: " + i);
            if (i % 4 == 0 && i % 3 == 0) {
                counter++;
                sum += i;
                System.out.println("bölünen değerler" + sum);
            }
        }
        avg = (double) sum / counter;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        int k;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        k = scanner.nextInt();
        findDivisors(k);

    }
}
