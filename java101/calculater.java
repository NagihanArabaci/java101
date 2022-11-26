import java.util.Scanner;

public class calculater {
    public  static void main(String[] args) {
        int select;
        double n1,n2,result;
        Scanner scanner=new Scanner(System.in);


        System.out.println("İşlem için rakam girin : 1=+,2=-,3=*,4=/" );
        select= scanner.nextInt();

        System.out.println("Birinci sayıyı girin: ");
        n1= scanner.nextDouble();

        System.out.println("İkinci sayıyı girin: ");
        n2= scanner.nextDouble();

        switch (select) {
            case 1:
                result=n1+n2;
                System.out.println("Toplama işlemi sonucu: " + result);
                break;
            case 2:
                result=n1-n2;
                System.out.println("Çıkarma işlemi sonucu: " + result);
                break;

            case 3:
                result=n1*n2;
                System.out.println("Çarpma işlemi sonucu: " + result);
                break;

            case 4:
                result=n1/n2;
                System.out.println("Bölme işlemi sonucu: " + result);
                break;
            default:
                System.out.println("Herhangi bir işlem seçilmedi");
                break;


        }

    }

}
