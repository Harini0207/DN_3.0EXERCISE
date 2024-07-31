public class CustomerRepositoryImp implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        return new Customer(id, "HARINI");
    }
}
