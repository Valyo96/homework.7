import java.util.Random;
import java.util.Scanner;

public class Task2a {
    // тази е направена с do-while
    public static void playGame() {
        Random number=new Random();
        Scanner sc=new Scanner(System.in);
        int rNumber=number.nextInt(20) +1;
        int tryCount=0;
        int playerGuess;
        System.out.println("Guess the number(1-20)!");
        do {
            playerGuess= sc.nextInt();
            tryCount++;
            if (rNumber == playerGuess) {
                System.out.println("You guessed right, " + playerGuess + " is the correct number!");
                System.out.println("It took you "+tryCount+" tries!");
            } else if (playerGuess > rNumber) {
                System.out.println("Too high , try again!");
            } else {
                System.out.println("Too low, try again!");
            }
        } while (playerGuess!=rNumber);
    }
    public static void main(String[] args) {
        playGame();

    }
}
