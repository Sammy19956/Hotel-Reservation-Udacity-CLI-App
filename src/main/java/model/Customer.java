package model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }


    public void createAccount(String email, String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName, email);
        System.out.println(customer);
    }

}
