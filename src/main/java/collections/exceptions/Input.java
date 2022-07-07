package collections.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public int readnumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("nalezy podac liczbe!");
            return readnumber();
        }
    }


    public static void main(String[] args) {
        Input input = new Input();
        int number = input.readnumber();
        System.out.println("Podano " + number);
    }
}
