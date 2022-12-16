package model;

public class Customer {
    public String firstName;
    public String lastName;
    public String email;

    public Customer(String firstName, String lastName, String email) {
        String regex = "^(.+)@(.+)$";
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
//        if (email.matches(regex)) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.email = email;
//        } else {
//            throw new IllegalArgumentException("Invalid email");
//        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void createAccount(String email, String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName, email);
        System.out.println(customer);
    }

}
