package com.techelevator.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class TELog {

    public static void log(String message) {
        File logFile = new File("C:/Users/jenbr/Desktop/module-1-pair-programming-4/exercise/logs", "search.log");

        try {
            try (PrintWriter pw = new PrintWriter(new FileOutputStream(logFile, true))) {
                pw.println(message);
            } catch (FileNotFoundException e) {
                throw new TELogException(e.getLocalizedMessage());
            }
        } finally {

        }
    }
}
