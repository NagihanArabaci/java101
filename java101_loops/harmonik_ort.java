import java.util.Scanner;

public class harmonik_ort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int n = scanner.nextInt();
        double result=0.0;
        for(double i=1;i<=n;i++){
            result +=(1/i);
        }
        System.out.println("Girilen sayının harmonik ortalaması "+result);
    }
}
