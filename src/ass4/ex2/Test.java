package ass4.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Account acc = new Account();
        System.out.println("Enter the amount");
        while (true)
            try {
                acc.deposit(s.nextDouble());
                break;
            } catch (InputMismatchException ex) {
                System.out.println("InputMismatchException");
                s = new Scanner(System.in);
            } catch (InvalidInputException ex) {
                s = new Scanner(System.in);
                System.out.println("InvalidInputException");
            }
    }
}

