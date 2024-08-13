import java.util.StringTokenizer;

public class Customer {
    private String name;
    private String dateOfBirth;

    public Customer(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    // Method to read customer data
    public static Customer readCustomerData(String data) {
        StringTokenizer tokenizer = new StringTokenizer(data, "/");
        String name = tokenizer.nextToken();
        String dateOfBirth = tokenizer.nextToken();
        return new Customer(name, dateOfBirth);
    }

    // Method to display customer data
    public void displayCustomerData() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
    }

    public static void main(String[] args) {
        // Example usage:
        String customerData = "John/15/03/1990";
        Customer customer = Customer.readCustomerData(customerData);
        customer.displayCustomerData();
    }
}
