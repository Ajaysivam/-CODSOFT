import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hi " + name + "! Welcome to the Number Guessing Game!");

        int score = 0, round = 0;
        String playAgain;

        do {
            int number = rand.nextInt(100) + 1;
            int attempts = 0, maxAttempts = 5;
            boolean correct = false;

            System.out.println("\nRound " + (++round) + ": Guess the number between 1 and 100");

            while (attempts < maxAttempts) {
                        System.out.print("Attempt " + (attempts + 1) + " - Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed it in " + attempts + " tries.");
                    score++;
                    correct = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!correct)
                System.out.println("Sorry! The correct number was " + number);

            System.out.print("Play again? (yes/no): ");
            sc.nextLine(); // clear buffer
            playAgain = sc.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("\nThanks for playing, " + name + "! You won " + score + " round(s).");
        sc.close();
    }
}
