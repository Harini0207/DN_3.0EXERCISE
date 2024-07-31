public class Decoratorpattern {
    public static void main(String[] args) {
        INotifier emailNotifier = new EmailNotifier();
        INotifier emailAndSMSNotifier = new SMSNotifierDecorator(emailNotifier);
        INotifier emailSMSAndSlackNotifier = new SlackNotifierDecorator(emailAndSMSNotifier);

        System.out.println("Sending via Email only:");
        emailNotifier.send("Hello via Email!");

        System.out.println("\nSending via Email and SMS:");
        emailAndSMSNotifier.send("Hello via Email and SMS!");

        System.out.println("\nSending via Email, SMS, and Slack:");
        emailSMSAndSlackNotifier.send("Hello via Email, SMS, and Slack!");
    }
}
