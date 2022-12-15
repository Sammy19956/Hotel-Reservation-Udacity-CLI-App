import model.Customer;

public class Driver {
    public static void main(String[] args) {
        Customer customer = new Customer("first", "Second", "j@domain.com");
        System.out.println(customer);

        Customer customer1 = new Customer("first", "Second", "email@domain");
        System.out.println(customer1);

    }
}
