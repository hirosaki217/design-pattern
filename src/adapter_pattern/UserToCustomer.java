package adapter_pattern;

public class UserToCustomer {
    private User user;
    private String firstName;
    private String lastName;
    private int age;
    public UserToCustomer(User user){
        this.user = user;
        String[] pieces = user.getName().split(" ");
        this.firstName = pieces[0];
        this.lastName = pieces[1];
        this.age = user.getAge();

    }

    public Customer get(){
        return new Customer(firstName, lastName, age);
    };
}
