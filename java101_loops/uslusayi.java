import java.util.Scanner;

public class uslusayi {
    public static void main(String[] args) {
        int n,r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üssünü bulmak istediğiniz sayıyı giriniz : ");
        n = scanner.nextInt();
        System.out.println("Üs değerini giriniz : ");
        r = scanner.nextInt();
        int total=1;

        for (int i=1;i<=r;i++){
            total *=n;

        }
        System.out.println(n+" üzeri " + r +" değeri " +total);
    }
}
