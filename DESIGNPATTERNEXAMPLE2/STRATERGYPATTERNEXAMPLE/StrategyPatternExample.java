public class StrategyPatternExample{
    public static void main(String[] args) {
        PaymentStratergy creditCardPayment = new PaymentByCreditCard();
        creditCardPayment.collectPaymentDetails();
        if (creditCardPayment.validatePaymentDetails()) {
            creditCardPayment.pay(250);
        }

        PaymentStratergy payPalPayment = new PaymentByPayPal();
        payPalPayment.collectPaymentDetails();
        if (payPalPayment.validatePaymentDetails()) {
            payPalPayment.pay(75);
        }
    }
}