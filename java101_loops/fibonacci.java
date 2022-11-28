import java.util.Scanner;

public class fibonacci {
    static void fibonacci(int N) {
        int number1 = 0, number2 = 1;
        int counter = 0;
        while (counter < N) {

            int number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
            counter++;
            System.out.print(number1 + " ");


        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İstediğiniz Fibonacci serisi için sayı giriniz");
        int N = scanner.nextInt();
        fibonacci(N);
    }
}
