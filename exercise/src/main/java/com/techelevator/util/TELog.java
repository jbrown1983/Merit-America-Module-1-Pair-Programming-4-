package com.techelevator.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class TELog {
    public static  void log(String message) {

       // File logger = new File("logs/search.log");

        try {
            PrintWriter pw = new PrintWriter(new FileOutputStream("log/search.log",true));
            pw.println(message);
            pw.close();
        } catch (FileNotFoundException e) {
            throw new TELogException(e.getLocalizedMessage());
        }

    }



}
