package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args) {

        //ask how many new Students we want to add
        System.out.println("Enter number of new students to enroll");
        Scanner in = new Scanner(System.in);
        int numOfStrudents = in.nextInt();
        Student[] students = new Student[numOfStrudents];

        // create n number of new students
        for (int n = 0; n < numOfStrudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();

        }
        for (int n = 0; n < numOfStrudents; n++) {
            System.out.println(students[n].showInfo());
        }

    }
}
