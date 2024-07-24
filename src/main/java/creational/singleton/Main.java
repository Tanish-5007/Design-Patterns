package creational.singleton;

public class Main {
    public static void main(String[] args) {

        LoggerSingleton loggerSingleton = LoggerSingleton.getLoggerInstance();
        LoggerSingleton loggerSingleton2 = LoggerSingleton.getLoggerInstance();

        System.out.println(loggerSingleton);
        System.out.println(loggerSingleton2);

    }
}
