public class CloudLogger implements Logger {
    @Override
    public void logFailure() {
        System.out.println("Failure has been logged.");
    }

    @Override
    public void logEvent() {
        System.out.println("Event has been logged.");
    }
}
