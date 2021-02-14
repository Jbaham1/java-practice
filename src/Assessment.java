import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Assessment {

    public static void main(String[] args) {
        square(4);
        sum(1, 2);
        sum(3.5, 4.8);
        average(new int[]{1, 2});
        capitalizeRecords();
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
    public static void capitalizeRecords() {
        ArrayList<String> user = new ArrayList<>();
        user.add("harry potter");
        user.add("Harmoine granger");
      while(user.hasNext())
        }
    }

}

