import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        square(4);
        sum(1, 2);
        sum(3.5, 4.8);
        average(new int[]{1, 2});
        //initialize interface to new variable
        Hello myUser;
        //add info to new variable
        myUser = new Users("harry", "potter", false);
        //say hello added to new variable
        System.out.println("Well, " + myUser.sayHello());

        myUser = new Users("Harmoine", "granger", true);
        System.out.println("Well, " + myUser.sayHello());
        System.out.println("Is admin? "+((Users) myUser).setAdmin());

        myUser = new Users("baby", "shark", true);
        System.out.println("Well, " + myUser.sayHello());
        System.out.println(((Users) myUser).isAdmin());
//        System.out.println("Is admin? "+((User) myUser).setAdmin());

        myUser = new Users("baby", "baluga", false);
        System.out.println("Well, " + myUser.sayHello());
        System.out.println("Is admin? "+((Users) myUser).setAdmin());
    }


    public static void square(double input) {
        //create a variable that calculates the square of a number
        double result = input * input;
        System.out.println("Your number squared is " + result);
    }

    //sum double
    public static void sum(double one, double two) {
        //create a variable that calculates sum
        double result = one + two;
        System.out.println("The sum of two doubles is " + result);
    }

    public static void sum(int one, int two) {
        //create a variable that calculates sum
        int result = one + two;
        System.out.println("The sum of two integers is " + result);
    }

    // create an integer array as parameter
    //https://www.baeldung.com/java-array-sum-average
    public static void average(int[] array) {
        System.out.println("Your average is " + Arrays.stream(array).average().orElse(Double.NaN));

    }


    //Array list in parameter and use the user name to show what the list is
    public static ArrayList<Users> capitalizeRecords(ArrayList<Users> users) {
        for (Users user : users) {
           String firstName = user.getFirstName().substring(0, 1).toUpperCase() + user.getFirstName().substring(1);
            String lastName = user.getLastName().substring(0, 1).toUpperCase() + user.getLastName().substring(1);
        }
        System.out.println(users);
        return users;
    }

    //public static ArrayList<Device> blackFridaySale(ArrayList<Device> input) {
    //    for (Device device: input) {
    //        if (device.getBrand().equalsIgnoreCase("Apple")) {
    //            device.setPrice(device.getPrice()*.95);
    //        }
    //        else if (device.getBrand().equalsIgnoreCase("Microsoft") ) {
    //            device.setPrice(device.getPrice()*.93);
    //        }
    //        else {
    //            System.out.println("No markdown for you!");
    //        }
    //    }
    //    return input;
    //}
}

