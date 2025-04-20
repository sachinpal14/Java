package bankinfo;

class Account {

    String name;
    protected String accountNumber;
    private String password;

    public void getPassword () {
        System.out.println("Password: " + this.password);
    }   
    public void setPassword (String password) {
        this.password = password;
    } // setter method for password
}

public class Bank {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Information System");

        Account account = new Account();
        account.name = "Jhaatu....";
        account.accountNumber = "1234567890";
        account.setPassword("1234"); // setting password using setter method
        account.getPassword(); // getting password using getter method
    }


    // accessing identifiers in the main method

    // private // only accessible within the class
    // protected // accessible within the package and subclasses
    // public // accessible everywhere
    // default // accessible within the package only
}
