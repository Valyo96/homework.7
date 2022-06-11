import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void playGame() {
       Random number=new Random();
       Scanner sc=new Scanner(System.in);
       int rNumber=number.nextInt(20) +1;
       int tryCount=0;
        int playerGuess=0;
        System.out.println("Guess the number(1-20)!");

       while (playerGuess!=rNumber) {
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
       }
    }
    public static void main(String[] args) {
        playGame();

    }
}
