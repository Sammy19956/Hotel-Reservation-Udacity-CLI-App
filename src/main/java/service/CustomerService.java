package service;

import model.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerService {
    static List<Customer> customerList = new ArrayList<>();
    public static Collection<Customer> addCustomer(String email, String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName, email);
        customerList.add(customer);
        return customerList;
    }

    public static Customer getCustomer(String email) {
        Customer customer = null;
        for(Customer customer1: customerList) {
            if(customer1.email.equals(email)) {
                customer = customer1;
            }
        }
        return customer;
    }

    public static List<Customer> getAllCustomers() {
        return customerList;
    }
}
