package service;

import model.Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerService {

    private static CustomerService customerServiceInstance;

    public static CustomerService getInstance(){
        if (customerServiceInstance == null){
            customerServiceInstance = new CustomerService();
        }
        return customerServiceInstance;
    }

//    static List<Customer> customerList = new ArrayList<>();
    static Customer foundCustomer;
    public static Collection<Customer> addCustomer(String email, String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName, email);
        Customer.customerList.add(customer);
//        customerList.add(customer);
        return Customer.customerList;
    }

    public static Customer getCustomer(String email) {
        for(Customer customer1: Customer.customerList) {
            if(customer1.email.equals(email)) {
                foundCustomer = customer1;
            }
        }
        return foundCustomer;
    }

    public static List<Customer> getAllCustomers() {
        return Customer.customerList;
    }
}
