public class EmailNotifier implements INotifier {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}