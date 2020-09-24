//Small changes
import java.util.Scanner;

public class Tafels {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Voer getal in om een tafel te genereren" +
                "met een range van van 1 tot 10!: ");
        int n = in .nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + " = " + (n * i));
        }
    }
}