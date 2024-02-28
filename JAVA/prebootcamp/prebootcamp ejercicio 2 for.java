import java.util.Scanner;
public class ScannerUserInput {
    public static void main(String[] args) {
        // String input with the Java Scanner
        System.out.println("How old are you?");
        Scanner stringScanner = new Scanner(System.in);
        String age = stringScanner.next();
        System.out.println(age + " is a good age to be!");
    }
}