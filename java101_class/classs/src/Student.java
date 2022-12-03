public class Student {
    // öğrencinin üç tane ders aldığını varsayarız
    Course mat;
    Course fizik;
    Course kimya;
    String name;
    String stduNo;
    String classes;
    double avarage;
    boolean isPass; // is varsa anlamı öyle mi değil mi

    public Student() {
    }

    public Student(Course mat, Course fizik, Course kimya, String name, String stduNo, String classes) {
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.name = name;
        this.stduNo = stduNo;
        this.classes = classes;
        calcAvarage();
        this.isPass=false;
    }
    // sözlü notunun etkisini hesaplarken 0.20 notunkini hesaplarken 0.80
    // 55ten büyükse geçer
    public void addBulkExamNote(int mat,int kimya,int fizik){
        if(mat >= 0 && mat<=100){
            this.mat.note=mat;
            this.mat.sozluNote=mat;

        }
        if(kimya >= 0 && kimya<=100){
            this.kimya.note=kimya;
            this.kimya.sozluNote=kimya;

        }
        if(fizik >= 0 && fizik<=100){
            this.fizik.note=fizik;
            this.fizik.sozluNote=fizik;

        }

    }
    public void isPass(){
        // sözlü notu sıfır girilmesi pek bir şey değiştirmez
        if(this.fizik.note<=0 || this.kimya.note<=0 ||this.mat.note<=0 ){
            System.out.println("Lütfen geçerli not giriniz");
        }
        else{
            this.isPass =isPassChecked();
            printNote();
            System.out.println("Ortalama: "+ this.avarage);
            if(this.isPass){
                System.out.println("Sınıf Geçti");
            }
            else{
                System.out.println("Sınıfta Kaldı");
            }
        }

            this.isPass=true;

    }
    public void calcAvarage(){
        this.avarage=(((this.fizik.sozluNote)*0.20+(this.fizik.note)*0.80)+((this.kimya.sozluNote)*0.20+(this.kimya.note)*0.80)
                +((this.mat.sozluNote)*0.20+(this.mat.note)*0.80))/3;
    }
    public boolean isPassChecked(){
        calcAvarage();
        return this.avarage>55;
    }
    public void printNote(){
        System.out.println("Öğrencinin Adı : " + this.name);
        System.out.println("==================================");
        System.out.println(this.name+ " adlı öğrencinin matematik notu: " +this.mat.note);
        System.out.println(this.name+ " adlı öğrencinin matematik sözlü notu: " +this.mat.sozluNote);
        System.out.println(this.name+ " adlı öğrencinin fizik notu: " +this.fizik.note);
        System.out.println(this.name+ " adlı öğrencinin fizik sözlü notu: " +this.fizik.sozluNote);
        System.out.println(this.name+ " adlı öğrencinin kimya notu: " +this.kimya.note);
        System.out.println(this.name+ " adlı öğrencinin kimya sözlü notu: " +this.kimya.sozluNote);


    }


}
