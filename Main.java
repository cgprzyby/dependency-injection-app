public class Main {
    public static void main(String[] args) {
        // Create instance of type Logger to inject into SQLServerDatabase
        CloudLogger cloudLogger = new CloudLogger();

        //  Method 1: Constructor injection
        //  Inject instance into SQLServerDatabase during instantiation
        SQLServerDatabase sqlServerDatabase = new SQLServerDatabase(cloudLogger);

        // Method 2: Setter injection
        // Instantiate SQLServerDatabase
        SQLServerDatabase anotherSqlServerDatabase = new SQLServerDatabase();
        // Inject Logger dependency with setLogger
        anotherSqlServerDatabase.setLogger(cloudLogger);

        // Bad practice, Logger is instantiated within FirestoreDatabase
        FirestoreDatabase firestoreDatabase = new FirestoreDatabase();
    }
}
