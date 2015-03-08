package nyc.c4q.alizinha;

import java.util.Scanner;
public class Main {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your score? ");
        int score = scanner.nextInt();
        if (score == 100)
            System.out.println("Perfect score!");
        else if (score >= 90)
            System.out.println("Great!");
        else if (score >= 75)
            System.out.println("Not bad!");
        else if (score >=60)
            System.out.println("You passed.");
        else
            System.out.println("You failed. :(");

        System.out.println("We're done!");

    }
}
