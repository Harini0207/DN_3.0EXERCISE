public class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal;
 
    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }
    public void processPayment(double amount) {
        //send.payment
        payPal.sendPayment(amount);
    }
}