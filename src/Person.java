public class Person implements Greeter{
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
    public Person(String firstName, String lastName) {
        //the Fname and Lname parameters will take in strings in those positions and set the first and last names depending on the location of the strings.
        this.firstName = firstName;
        //this is referring to the first parameter (in the firsName position) and setting it as the 'First Name' of the person
        this.lastName = lastName;
        //this is referring to the second parameter (in the lastName position) and setting it as the 'Last Name' of the person
        if(firstName == null|| lastName == null){
            IllegalArgumentException e;
            e = new IllegalArgumentException("Name can NOT be blank");
            throw e;
        }

    }
    //sayHello is a string and public NOT void...
    //since person is extending greeter interface you can override the message and add whatever person methods has
        // in this case it would be first and last names....
   public String sayHello(){
        //example Hello from Jeremiah Baham.
        return "Hello from " + firstName + " " + lastName+".";

    }
}
