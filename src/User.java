public class User extends Person {
    //extends person in order to get the firsName and lastName parameter
    //fname and lname is private so we have to extend... we cannot call it here without the extension
    protected Boolean admin;

    //by extending Person class the constructor has firsName, lastName and the new admin boolean
    public User(String firstName, String lastName, Boolean admin) {
        super(firstName, lastName);
        this.admin = admin;
    }
    public static void isAdmin(){
        //if admin equals true print user admin or else user is not admin
        if(admin){
            System.out.println("User is an Admin");
        }else{
            System.out.println("User is not Admin");
        }
    }
}

