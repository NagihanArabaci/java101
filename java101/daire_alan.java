import java.util.Scanner;

public class daire_alan {
    public static void main(String[] args) {
        double n=3.14,alan;
        int r,a;
        Scanner input = new Scanner(System.in);
        System.out.println("Alanını hesaplamak istediğiniz dairenin yarıçapını giriniz : " );
        r=input.nextInt();
        System.out.println("Alanını hesaplamak istediğiniz dairenin merkez açısının ölçüsünü giriniz : " );
        a=input.nextInt();
        alan=(n*(r*r)*a)/360;
        System.out.println("Değerleri girilen dairenin alanı:" + alan);

    }
}
