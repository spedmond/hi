import java.util.Locale;
import java.util.Scanner;

public class hi {
    public static void main(String[] args) {
        Scanner awd = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = awd.nextLine();
        String firstUpper = first.toUpperCase();
        System.out.println("String length: " + first.length());
        System.out.println("First half: " + first.substring(0,(first.length()/2)));
        System.out.println("Second half: " + first.substring((first.length()/2)));
        if (first.substring(0,1) == firstUpper) {
            System.out.println("The first letter is capitalized");
        }
        else {
            System.out.println("The first letter is lowercase");
        }

        System.out.print("Enter second string: ");
        String second = awd.nextLine();
        String secondUpper = second.toUpperCase();
        if (first.length()>second.length()) {
            System.out.println(first + " is longer");
        }
        else if (first.length()==second.length()) {
            System.out.println(first + " and " + second + " are the same length");
        }
        else {
            System.out.println(second + " is longer");
        }

        if (first.compareTo(second) < 0) {
            System.out.println(first + " comes first alphabetically");
        }
        else if (first.compareTo(second) > 0) {
            System.out.println(second + " comes first alphabetically");
        }
        else {
            System.out.println("Same strings");
        }

        if (first.indexOf(second) != -1) {
            System.out.println(second + " is found in " + first + " at index " + first.indexOf(second));
        }
        else {
            System.out.println(second + " is not found in " + first);
        }

        if (second.substring(0,1) == secondUpper) {
            System.out.println("The first letter is capitalized");
        }
        else {
            System.out.println("The first letter is lowercase");
        }
    }
}
