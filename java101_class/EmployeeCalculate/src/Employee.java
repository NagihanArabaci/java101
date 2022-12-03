public class Employee {
    String name;
    double salary;
    int workHours=0;
    int hireYear=0;
    double raise_salary=0;
    double tax;
    double count =0;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }
    public double tax(){
        if (salary>1000){
            tax = (salary*0.03);
            return tax;
        }
        return tax;
        //maaşa uygulanan vergiyi hesaplayacaktır
        // çalışanın maaşı 1000'den küçük ise vergi uygulanmayacaktır
        // çalışanın maaşı 1000'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır

    }
    public double bonus(){

        if (workHours>40) {
            count = (workHours - 40) * 30;
            return count;
        }
        return count;
    }
    public double raiseSalary(){

//        Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
//        Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
//        Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
        hireYear =2021-hireYear;
        if (hireYear<10){
            raise_salary = (salary*0.05);
            return raise_salary;

        } else if (hireYear<20) {
            raise_salary =  (salary*0.10);
            return raise_salary;
        }
        else
            raise_salary =  (salary*0.15);
        return raise_salary;

    }
    void toPrint(){
        double vergili_maas=this.salary+(this.bonus()-this.tax());
        double toplam_maas=this.salary+this.raiseSalary();
        System.out.println("Adı: " +this.name);
        System.out.println("Maaşı: " +this.salary);
        System.out.println("Çalışma Saati: " +this.workHours);
        System.out.println("Bonus: "+this.bonus());
        System.out.println("Vergi: " + this.tax());
        System.out.println("Maaş Artışı: " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" +vergili_maas);
        System.out.println("Toplam Maaş :"+toplam_maas);



    }
}
