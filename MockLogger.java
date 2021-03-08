public class MockLogger implements Logger {
    boolean didCallLogFailure = false;
    @Override
    public void logFailure() {
        didCallLogFailure = true;
    }

    boolean didCallLogEvent = false;
    @Override
    public void logEvent() {
        didCallLogEvent = true;
    }

    public boolean getDidCallLogEvent() {
        return this.didCallLogEvent;
    }

    public boolean getDidCallLogFailure() {
        return this.didCallLogFailure;
    }
}


