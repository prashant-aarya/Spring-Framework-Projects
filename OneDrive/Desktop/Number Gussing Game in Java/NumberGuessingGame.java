import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();                 //Random Class
        int highScore = 0;
        boolean playAgain;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Enter your name: ");
        String playerName = sc.nextLine();              //Player Name

        do {
            int maxNumber = 100;
            int maxAttempts = 7;
            String level = "MEDIUM";
            int score = 0;

            System.out.println("\nChoose difficulty level:");
            System.out.println("1. Easy (0 - 50, 10 attempts)");
            System.out.println("2. Medium (0 - 100, 7 attempts)");
            System.out.println("3. Hard (0 - 200, 5 attempts)");
            System.out.print("Enter your choice (1-3): ");
            int choice = sc.nextInt();                                  //Choice

            switch (choice) {
                case 1:
                    maxNumber = 50;
                    maxAttempts = 10;
                    level = "EASY";
                    break;
                case 2:
                    maxNumber = 100;
                    maxAttempts = 7;
                    level = "MEDIUM";
                    break;
                case 3:
                    maxNumber = 200;
                    maxAttempts = 5;
                    level = "HARD";
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to Medium level.");
            }

            int secretNumber = rand.nextInt(maxNumber + 1);
            int attempts = 0;
            boolean won = false;

            System.out.println("\nHello " + playerName + "! You've selected " + level + " level.");
            System.out.println("You have " + maxAttempts + " attempts to guess a number between 0 and " + maxNumber + ".");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + ": ");
                int guess = sc.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low!");
                } else if (guess > secretNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                    won = true;
                    break;
                }
            }

            if (won) {
                score = (maxAttempts - attempts + 1) * 10;
            }

            System.out.println("\n-------------------------------");
            System.out.println("Player Name  : " + playerName);
            System.out.println("Difficulty   : " + level);
            System.out.println("Attempts Used: " + attempts);
            System.out.println("Score        : " + score);
            System.out.println("-------------------------------");

            if (score > highScore) {
                highScore = score;
                System.out.println("New High Score!");
            }

            System.out.println("Current High Score: " + highScore);

            System.out.print("\nDo you want to play again? (yes/no): ");
            sc.nextLine(); // clear buffer
            String response = sc.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes");

        } 
        while (playAgain);

        System.out.println("Thanks for playing, " + playerName + "! Your highest score was: " + highScore);
        sc.close();
    }
}



/*
Output :- 

Welcome to the Number Guessing Game!
Enter your name: Prashant Arya

Choose difficulty level:
1. Easy (0 - 50, 10 attempts)
2. Medium (0 - 100, 7 attempts)
3. Hard (0 - 200, 5 attempts)
Enter your choice (1-3): 2

Hello Prashant Arya! You've selected MEDIUM level.
You have 7 attempts to guess a number between 0 and 100.
Attempt 1: 50
Too high!
Attempt 2: 30
Too low!
Attempt 3: 40
Too high!
Attempt 4: 35
Too low!
Attempt 5: 37
Congratulations! You guessed the number.

-------------------------------
Player Name  : Prashant Arya
Difficulty   : MEDIUM
Attempts Used: 5
Score        : 30
-------------------------------
New High Score!
Current High Score: 30

Do you want to play again? (yes/no): no
Thanks for playing, Prashant Arya! Your highest score was: 30 

*/