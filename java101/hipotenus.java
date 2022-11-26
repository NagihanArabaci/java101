import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println(" Birinci kenarı giriniz : ");
        a = input.nextInt();
        System.out.println(" İkinci kenarı giriniz : ");
        b = input.nextInt();
        double hipotenus=Math.sqrt((a*a)+(b*b));
        System.out.println(" Kenarları verilen dik üçgenin hipotenüsü : "+ hipotenus);
        System.out.println(" Üçüncü kenarı giriniz : ");
        c = input.nextInt();

        double cevre =a+b+c;
        double u = (cevre/2);
        double alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("Kenarları girilen üçgenin alanı :" + alan);






    }
}
