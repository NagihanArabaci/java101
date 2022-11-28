import java.util.Scanner;

public class ekokebob {
    public static void main(String[] args) {
        // ekok=(n*r)/ebob
        int n,r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz : ");
        n = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        r = scanner.nextInt();
        int ebob=1;
        int ekok=1;

        int m = n;
        while(m>=1){
            if(n % m == 0 && r % m == 0){
                ebob =m;
                break;
            }
            m--;
        }
        ekok=(n*r)/ebob;
        System.out.println(n + " ve " + r + " sayılarının en büyük ortak böleni: "+ ebob);
        System.out.println(n + " ve " + r + " sayılarının en küçük ortak katı: "+ ekok);
    }
}
