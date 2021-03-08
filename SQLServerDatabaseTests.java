import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SQLServerDatabaseTests {
    // Behavior-driven tests: Given, When, Then format
    @Test
    public void testDidSaveDataLogEvent() {
        // Create mock instance of logger
        MockLogger mockLogger = new MockLogger();
        // Given an instance of SQLServerDatabase
        SQLServerDatabase sqlServerDatabase = new SQLServerDatabase(mockLogger);
        // When saveData method is called
        sqlServerDatabase.saveData();
        // logEvent method is executed
        assertTrue(mockLogger.getDidCallLogEvent());
    }

    @Test
    public void testDidDeleteDataLogEvent() {
        // Create mock instance of logger
        MockLogger mockLogger = new MockLogger();
        // Given an instance of SQLServerDatabase
        SQLServerDatabase sqlServerDatabase = new SQLServerDatabase(mockLogger);
        // When saveData method is called
        sqlServerDatabase.deleteData();
        // logEvent method is executed
        assertTrue(mockLogger.getDidCallLogEvent());
    }
}
