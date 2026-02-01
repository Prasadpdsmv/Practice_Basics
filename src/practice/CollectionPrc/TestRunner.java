package practice.CollectionPrc;

// Example usage in test cases
public class TestRunner {
    public static void main(String[] args) {
        TestLogger logger1 = TestLogger.getInstance();   //>> it returns a variable which is new instance of the claas
        logger1.log("Test Case 1 started");

        TestLogger logger2 = TestLogger.getInstance();
        logger2.log("Test Case 2 started");

        System.out.println(logger1 == logger2); // true → same instance


        TestLogger obj = TestLogger.getInstance();


    }
}
