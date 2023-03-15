public class Main {
     public static void main(String[] args) {
        Student student = new Student();
        student.surName = "Kalmatova";
        student.name = "Zarina";
        student.birthday = "23.02.1993";
        student.age = 30;
        System.out.println(student.surName + "\n" + student.name + "\n" +
                student.birthday + "\n" + student.age + "\n");
        Student student1 = new Student();
        student1.surName = "Musaevv";
        student1.name = "Nursalin";
        student1.birthday = "25.07.2004";
        student1.age = 19;
        System.out.println(student1.surName + "\n" + student1.name + "\n" +
                student1.birthday + "\n" + student1.age + "\n");
        Student student2 = new Student();
        student2.surName = "Mamasaliev";
        student2.name = "Nurdolot";
        student2.birthday = "19.02.2007";
        student2.age = 15;
        System.out.println(student2.surName + "\n" + student2.name + "\n" +
                student2.birthday + "\n" + student2.age + "\n");
    }
}