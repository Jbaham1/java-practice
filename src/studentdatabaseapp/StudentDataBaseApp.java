package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.showInfor());
        //ask how many new Students we want to add
        System.out.println("Enter number of new students to enroll");
        Scanner in = new Scanner(System.in);
        int numOfStrudents = in.nextInt();
        Student[] students = new Student[numOfStrudents];
        // create n number of new students
    }
}
