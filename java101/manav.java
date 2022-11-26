import java.util.Scanner;

public class manav {
    public static void main(String[] args) {

        double result,armut,elma,domates,muz,patlican;

        Scanner input = new Scanner(System.in);

        System.out.println("Armutun kilogramını giriniz: ");
        armut= input.nextInt();
        System.out.println("Elma kilogramını giriniz: ");
        elma= input.nextInt();
        System.out.println("Domates kilogramını giriniz: ");
        domates= input.nextInt();
        System.out.println("Muz kilogramını giriniz: ");
        muz= input.nextInt();
        System.out.println("Patlıcan kilogramını giriniz: ");
        patlican= input.nextInt();

        result=armut+elma+domates+muz+patlican;
        System.out.println("Toplam kilogram:" + result);



    }
}
