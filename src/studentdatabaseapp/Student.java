package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int academicYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int courseCost = 600;

    //constructor prompt: name and year
public Student(){
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter student first name: ");
    this.firstName = in.nextLine();

    System.out.println("Please enter student last name: ");
    this.lastName = in.nextLine();

    System.out.println("Please select student academic year.\n1. Freshmen\n2. Sophomore\n3. Junior\n4. Senior");
    this.academicYear = in.nextInt();

    System.out.println(firstName +" "+lastName +" "+academicYear);
}
    //generate student id

    //enroll in courses

    //view balance

    // pay tuition

    //show status
}
