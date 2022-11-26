import java.util.Scanner;

public class not_ort {
    public static void main(String[] args) {


        int fizik, mat, turkce, muzik, kimya, toplam;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu girin: ");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu girin: ");
        fizik = input.nextInt();

        System.out.println("Türkçe notunuzu girin: ");
        turkce = input.nextInt();

        System.out.println(" Müzik notunuzu girin: ");
        muzik = input.nextInt();

        System.out.println(" Kimya notunuzu girin: ");
        kimya = input.nextInt();
        if (mat < 0 || 100 < mat) {
            toplam = (fizik + muzik  + turkce + kimya);
            result = toplam / 4.0;
            System.out.println(result);
            String newValue = result > 55 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
            System.out.println(newValue);

        }
        if (fizik < 0 || 100 < fizik) {
            toplam = (mat  + muzik + turkce + kimya);
            result = toplam / 4.0;
            System.out.println(result);
            String newValue = result > 55 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
            System.out.println(newValue);
        }
        if (muzik < 0 || 100 < muzik) {
            toplam = (mat + fizik  +  turkce + kimya);
            result = toplam / 4.0;
            System.out.println(result);
            String newValue = result > 55 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
            System.out.println(newValue);
        }

        if (turkce < 0 || 100 < turkce) {
            toplam = (mat + fizik + muzik   + kimya);
            result = toplam / 4.0;
            System.out.println(result);
            String newValue = result > 55 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
            System.out.println(newValue);
        }

        if (kimya < 0 || 100 < kimya) {
            toplam = (mat + fizik + muzik  + turkce );
            result = toplam / 4.0;
            System.out.println(result);
            String newValue = result > 55 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
            System.out.println(newValue);
        }
        else {
        toplam = (mat + fizik + muzik  + turkce + kimya);
        result = toplam / 5.0;
        System.out.println(result);
        String newValue = result > 55 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(newValue);
        }


    }
}
