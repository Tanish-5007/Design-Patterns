package behavioural.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Logger infoLogger = new InfoLogger();
        Logger debugLogger = new DebugLogger();
        Logger errorLogger = new ErrorLogger();

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        infoLogger.logMessage(Logger.INFO, "This is an information.");
        infoLogger.logMessage(Logger.DEBUG, "This is a debug information.");
        infoLogger.logMessage(Logger.ERROR, "This is an error information.");
    }
}
