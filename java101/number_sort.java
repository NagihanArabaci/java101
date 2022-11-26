import java.util.Scanner;

public class number_sort {
    public static void main(String[] args) {

        int number1, number2, number3;
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        number1 = input.nextInt();

        System.out.println("Birinci sayıyı giriniz: ");
        number2 = input.nextInt();

        System.out.println("Birinci sayıyı giriniz: ");
        number3 = input.nextInt();

        if ((number1 < number2) && (number1 < number3)) {
            if (number2 < number3) {
                System.out.println("Girilen sayıların sıralanmış hali: " + number1 + "<" + number2 + "<" + number3);
            } else {
                System.out.println("Girilen sayıların sıralanmış hali: " + number1 + "<" + number3 + "<" + number2);
            }

        }
        if ((number2 < number1) && (number2 < number3)) {
            if (number1 < number3) {
                System.out.println("Girilen sayıların sıralanmış hali: " + number2 + "<" + number1 + "<" + number3);
            } else {
                System.out.println("Girilen sayıların sıralanmış hali: " + number2 + "<" + number3 + "<" + number1);
            }

        }
        if ((number3 < number1) && (number3 < number2)) {
            if (number1 < number2) {
                System.out.println("Girilen sayıların sıralanmış hali: " + number3 + "<" + number1 + "<" + number2);
            } else {
                System.out.println("Girilen sayıların sıralanmış hali: " + number3 + "<" + number2 + "<" + number1);
            }

        }


    }
}
