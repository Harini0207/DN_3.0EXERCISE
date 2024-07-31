public class PaymentByCreditCard implements PaymentStratergy {
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        card = new CreditCard("cardNumber", "expiryDate", "cvv");
    }

    @Override
    public boolean validatePaymentDetails() {
        if (card.getCardNumber() != null && card.getExpiryDate() != null && card.getCvv() != null) {
            return true;
        }
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying amount using Credit Card");
        card.setAmount(card.getAmount() + amount);
    }
}