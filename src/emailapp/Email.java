package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength;

//constructor receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Welcome to the company! Your email has been created " + this.firstName + " " + this.lastName);

        //call method asking for department -return department
        this.department = setDepartment();
        System.out.println("Your department: " + this.department);

        //call method that returns random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("You new password is: " + this.password);
    }
    //ask for department

    private String setDepartment() {
        System.out.println("What department will you be joining? \n1. for Sales \n2. for Development \n3. for Accounting \n0 for none \n Select department option");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1){return "sales";}
        else if (depChoice == 2){return "dev";}
        else if (depChoice == 3){return "acct";}
        else{return "";}
    }
    private String randomPassword(int length){
        //possible characters
        String passwordSet = "ABCDEFHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_-";
        //array of characters set to length parameter
        char [] password = new char[length];
        //iterate over the length parameter
        for(int i = 0; i < length; i++){
            //get random characters and save in random variable
         int random =  (int) (Math.random() * passwordSet.length());
         //random character at index i in password array equal to random character in password set variable
         password[i] = passwordSet.charAt(random);
         //print random characters
            System.out.println(random);
            //print new random password
            System.out.println(passwordSet.charAt(random));
        }
        //return a new string with the password characters in it.
        return new String(password);
    }


    //generate random password
    //set mailbox capacity
    //set the alternate email
    //change the password

}
