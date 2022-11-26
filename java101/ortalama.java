import java.util.Scanner;

public class ortalama {
     public static void main(String[] args) {
         int fizik,mat,turkce,muzik,kimya,toplam;
         double result;

         Scanner input = new Scanner(System.in);

         System.out.println("Matematik notunuzu girin: ");
         mat= input.nextInt();

         System.out.println("Fizik notunuzu girin: ");
         fizik= input.nextInt();

         System.out.println("Türkçe notunuzu girin: ");
         turkce= input.nextInt();


         System.out.println(" Müzik notunuzu girin: ");
         muzik= input.nextInt();

         System.out.println(" Kimya notunuzu girin: ");
         kimya= input.nextInt();

         toplam = (mat+fizik+muzik+turkce+kimya);
         result =toplam/5.0;
         System.out.println(result);
         String newValue=result>60 ? "Sınıfı Geçti": "Sınıfta Kaldı";
         System.out.println(newValue);






     }
}
