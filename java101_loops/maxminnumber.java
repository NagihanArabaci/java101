import java.util.Scanner;

public class maxminnumber {
    public static void main(String[] args) {


        System.out.println("Kaç tane sayı girmek istediğinizi giriniz : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        System.out.printf("%d tane sayı giriniz %n", n);
        for (int i = 1; i <= n; i++) {

            int current = sc.nextInt();
            System.out.println(i + ". sayı : " + current);
            if (current > largest) {
                largest = current;
            }
            if (current < smallest) {
                smallest = current;
            }
        }
        System.out.println("En büyük sayı : " + largest);
        System.out.println("En küçük sayı : " + smallest);


    }
}
