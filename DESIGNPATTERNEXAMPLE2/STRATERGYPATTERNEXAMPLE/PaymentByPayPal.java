public class PaymentByPayPal implements PaymentStratergy {
    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        email = "email@example.com";
        password = "password";
    }

    @Override
    public boolean validatePaymentDetails() {
        if (email != null && password != null) {
            return true;
        }
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying amount using PayPal");
    }
}
