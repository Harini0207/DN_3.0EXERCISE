public class Dependencyinjection {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImp();
        CustomerService service = new CustomerService(repository);

        Customer customer = service.findCustomerById(1);
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
    }
}
