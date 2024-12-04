package app;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("testing 1st logging");
        logger1.log("testing 2nd logging");
        logger1.printLogs();

        Logger logger2 = Logger.getInstance();
        logger2.log("testing 3rd logging");
        logger2.log("testing 4th logging");
        logger1.printLogs();

        System.out.println("checking logger2:");
        logger2.printLogs();

    }

}
