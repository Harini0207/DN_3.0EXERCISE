public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS: " + message);
    }
}
