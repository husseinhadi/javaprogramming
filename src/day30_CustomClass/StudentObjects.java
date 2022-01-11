package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

     Student student1 =   new Student();

     student1.setInfo("Hussein", 'M',  34, 2232,'A');



        Student student2 =new Student();
        student2.setInfo("Ann", 'F',  30, 2332,'F');


        Student student3 =new Student();
        student3.setInfo("Ali", 'M',  40, 2212,'B');


        Student student4 =new Student();
        student4.setInfo("Maria", 'F',  20, 23412,'C');


        Student student5 =new Student();
        student5.setInfo("MJ", 'F',  32, 2412,'A');


        Student[] students ={student1, student2, student3, student4, student5};


        for (Student student : students) {
            System.out.println(student);
        }


        System.out.println("_____________________________________________________");


        ArrayList<Student> earlyBirds =new ArrayList<>(); // grade: A
        ArrayList<Student> angryBirds =new ArrayList<>();

        for (Student student : students) {
            if (student.grade=='A'){
                earlyBirds.add(student);
        }else {
                angryBirds.add(student);

            }

            System.out.println(earlyBirds);
            System.out.println( angryBirds);

        }


    }
}
