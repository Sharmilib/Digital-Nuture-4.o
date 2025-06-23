public class Logger {
 // Step 1: Private static instance of the same class
 private static Logger instance;

 // Step 2: Private constructor to prevent external instantiation
 private Logger() {
     System.out.println("Logger instance created");
 }

 // Step 3: Public method to provide access to the instance
 public static Logger getInstance() {
     if (instance == null) {
         instance = new Logger();
     }
     return instance;
 }

 // Optional: A sample method
 public void log(String message) {
     System.out.println("Log: " + message);
 }
}

