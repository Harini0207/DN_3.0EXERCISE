public abstract class NotifierDecorator implements INotifier {
    protected final INotifier wrapped;

    public NotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
    }
}
