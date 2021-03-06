package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int academicYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int courseCost = 600;
    private static int id = 1000;

    //constructor prompt: name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter student first name: ");
        this.firstName = in.nextLine();
        firstName = this.firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        System.out.println("Please enter student last name: ");
        this.lastName = in.nextLine();
        lastName = this.lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        System.out.println("Please select student academic year.\n1. Freshmen\n2. Sophomore\n3. Junior\n4. Senior");
        this.academicYear = in.nextInt();

        setStudentID();
    }

    //generate student id
    private void setStudentID() {
        //grade level + ID
        id++;
        studentID = academicYear + "" + id;
    }

    //enroll in courses
    public void enroll() {
        //loop user hits 0 when done enrolling
        do {
            System.out.print("Enter course to enroll (q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + courseCost;
            } else {
                break;
            }
        } while (1 != 0);
    }

    //view balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Please enter your payment amount. $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //show status
    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + academicYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
