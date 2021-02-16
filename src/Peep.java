public class Peep implements Hello {

    //private instances of first and last name that are inaccessible outside of this class
    private String firstName;
    private String lastName;

    //getters and setters after constructor creation
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //person constructor that takes in first and last name as two separate strings
    public Peep(String firstName, String lastName) throws IllegalArgumentException {
        //the Fname and Lname parameters will take in strings in those positions and set the first and last names depending on the location of the strings.
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
//
        //capitalize first name in string
        //this is referring to the first parameter (in the firsName position) and setting it as the 'First Name' of the person
        this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
//
        //capitalize first name in string
        //this is referring to the second parameter (in the lastName position) and setting it as the 'Last Name' of the person
//
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Name can NOT be blank");
        }

    }

    //sayHello is a string and public NOT void...
    //since person is extending greeter interface you can override the message and add whatever person methods has
    // in this case it would be first and last names....

    @Override
    //override abstract interface
    public String sayHello() {
        //make it public and string like interface
        //example Hello from Jeremiah Baham.
        return "Hello from " + firstName + " " + lastName + ".";
//add new return statement
    }
}
