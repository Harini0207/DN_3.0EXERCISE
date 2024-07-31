public interface PaymentStratergy {
    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int amount);
}