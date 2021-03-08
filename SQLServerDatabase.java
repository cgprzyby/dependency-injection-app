public class SQLServerDatabase implements Database {
    Logger logger;

    // Method 1: Constructor injection
    SQLServerDatabase(Logger logger) {
        this.logger = logger;
        System.out.println("SQLServerDatabase has been created with injected Logger instance.");
    }

    SQLServerDatabase() {
        System.out.println("SQLServerDatabase has been created.");
    }

    // Method 2: Setter injection
    public void setLogger(Logger logger) {
        this.logger = logger;
        System.out.println("Logger has been injected using setLogger().");
    }

    @Override
    public void saveData() {
        try {
            System.out.println("Data has been saved.");
            logger.logEvent();
        } catch(Exception exception) {
            logger.logFailure();
        }
    }

    @Override
    public void deleteData() {
        try {
            System.out.println("Data has been deleted.");
            logger.logEvent();
        } catch(Exception exception) {
            logger.logFailure();
        }
    }
}
