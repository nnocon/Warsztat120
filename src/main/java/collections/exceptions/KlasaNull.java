package collections.exceptions;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class KlasaNull {


    public int czytajLiczbe() {
        File file = new File("src\\main\\java\\collections\\exceptions\\ksiazki.txt");
        String text = null;
        try {
            String result = text.toLowerCase();
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Wylapano NullPointerException");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podano litery, nie można przekonwertować do typu int");
            return czytajLiczbe();
        }
    }

    public static void main(String[] args) {
        KlasaNull klasaNull = new KlasaNull();
        int liczba = klasaNull.czytajLiczbe();
        System.out.println("Podano " + liczba);
    }

}
