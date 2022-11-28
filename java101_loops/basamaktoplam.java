import java.util.Scanner;

public class basamaktoplam {
    static void findSumDigit(int number){
        int total=0;
        while (number>0){
            total =total+number%10;
            number =number/10;

        }
        System.out.println("Girilen sayının basamakları toplamı: " +total);

    }
    public static void main(String[] args) {
        int n;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number ");
        n=scanner.nextInt();
        findSumDigit(n);

    }
}
