import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double tutar;

        Scanner input = new Scanner(System.in);
        System.out.println(" Tutarı giriniz : ");
        tutar = input.nextDouble();
        double kdvOran = tutar > 1000 ? 0.08 : 0.18;
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println(kdvliTutar);
        System.out.println();


    }
}
