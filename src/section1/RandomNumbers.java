package section1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int number = random.nextInt(100) + 1;
            System.out.println("Let the game begin!");
            int wishedNumber = 88;
            if (number < wishedNumber) {
                System.out.println("Your number is too small. Please, try again.");
            }
            if (number > 88) {
                System.out.println("Your number is too big. Please, try again.");
            }
            if (number == wishedNumber) {
                System.out.println("Congratulations, " + name);
                break;
            }
        }
    }
}
