import java.util.List;

public class Course {
    Teacher courseTeacher; // teacher sınıfından bir nesne üretildi bu sınıfta teacher sınıfının niteliklerini kullanabiliriz
    String name;

    String code; // dersin kodu
    String prefix; // teacher sınıfındaki branh ile eşleşmesi lazım
    int note;
    int sozluNote;

    public Course( String name, String code, String prefix) {

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note=0; // varsayılan değer olarak 0 gelsin
        this.sozluNote=0;
    }
    void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher=t;
        }
        else {
            System.out.println("Eğitmen ile ders bölümleri uyuşmuyor. ");
        }

    }
    void printTeacher(){
        if(this.courseTeacher != null){
            System.out.println(this.name+" dersinin eğitmeni: " + courseTeacher.name);
        }
        else {
            System.out.println(this.name+ " dersinin eğitmeni bulunmamaktadır.");
        }

    }

    // prefix,note,Teacher
}
