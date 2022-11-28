import java.util.Scanner;

public class teksayilartoplam {

        public static void main(String[] args) {
            int k;
            Scanner scanner=new Scanner(System.in);

            int sum =0;

            do{
                System.out.println("Sayı giriniz: ");
                k=scanner.nextInt();
                if(k%4==0 ){
                    sum +=k;
                }

            }while (k % 2==0);
            System.out.println("Çift sayılar ve dörde tam bölünen sayıların toplamı: " + sum);

        }
    }


