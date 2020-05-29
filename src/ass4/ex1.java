package ass4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ex1 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int num = 0;
        boolean isTrue = false;
        while (!isTrue) {
            System.out.println("Enter number");
            try {
                num = kbd.nextInt();
                isTrue = true;
            } catch (InputMismatchException e) {
                kbd.nextLine();
                System.out.println("InputMismatchException");
            }

        }
        System.out.println(num);

    }

  
}