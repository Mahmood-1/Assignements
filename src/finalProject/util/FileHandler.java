package finalProject.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandler {


    public static Scanner read() {
        try {
           File file = new File("C:\\Users\\Hooda\\IdeaProjects\\Assignements\\src\\finalProject\\util\\Store.txt");
           return new Scanner(file);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static PrintWriter write() {
        try {
            File file = new File("C:\\Users\\Hooda\\IdeaProjects\\Assignements\\src\\finalProject\\util\\Store.txt");
            return new PrintWriter(file);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
