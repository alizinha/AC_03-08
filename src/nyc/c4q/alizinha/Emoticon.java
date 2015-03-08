package nyc.c4q.alizinha;

/**
 * Created by c4q-Allison and Madelyn  on 3/8/15.
 */

import java.util.Scanner;
public class Emoticon {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How do you feel?");
        String smiley = scanner.next();

        if (smiley.equals(":)"))
            System.out.println("Today you're happy.");
        else if (smiley.equals(":("))
            System.out.println("Today you're sad.");
        else
            System.out.println("Invalid Answer");

    }
}