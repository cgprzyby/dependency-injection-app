public class FirestoreDatabase implements Database {
    Logger logger;

    FirestoreDatabase() {
        CloudLogger cloudLogger = new CloudLogger();
        this.logger = cloudLogger;
        System.out.println("FirestoreDatabase has instantiated CloudLogger.");
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
