public class singleton {
    public static void main(String[] args) {
        
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        
       
        logger1.log("First message");
        logger2.log("Second message");
        
        if (logger1 == logger2) {
            System.out.println("Only one logger instance is created and used across the application");
        } else {
            System.out.println("logger1 and logger2 are different instances.");
        }
    }
}


