public class Main {
    public static void main(String[] args) {
        Course mat=new Course("Matematik","101","MAT");
        Course fizik=new Course("Fizik","102","FZK");
        Course kimya=new Course("Kimya","103","KMY");

        Teacher teacher1=new Teacher("Mahmut Hoca","025489632356","KMY");
        Teacher teacher2=new Teacher("Mehmet Hoca","025489632356","MAT");
        Teacher teacher3=new Teacher("Mahmut Hoca","025489632356","FZK");

        mat.addTeacher(teacher2);
        fizik.addTeacher(teacher3);
        kimya.addTeacher(teacher1);

        Student s1 = new Student(mat, fizik, kimya,"İnek Şaban", "4", "140144015" );
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student(mat, fizik, kimya,"Güdük Necmi", "4", "2211133" );
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student(mat, fizik, kimya,"Hayta İsmail", "4", "221121312");
        s3.addBulkExamNote(50,20,40);
        s3.isPass();






    }
}