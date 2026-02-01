package practice.CollectionPrc;

// Singleton Logger class
public class TestLogger {
    private static TestLogger loggerInstance;
    
    private TestLogger() {
        System.out.println("Logger initialized...");
    }
    
    public static synchronized TestLogger getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new TestLogger();
        }
        return loggerInstance;
    }
    
    public void log(String message) {
        System.out.println("[LOG] " + message);
        // In real-world, write to a file or reporting system
    }
}

