import java.util.Scanner;

public class Task1 {
    public static void printNominatedPlayers () {
        Scanner sc=new Scanner(System.in);
        int nmPlayers;
        System.out.println("Enter the desired sport (football , basketball,volleyball)");
        String desiredSport= sc.next();

        if (desiredSport.equals("football")||desiredSport.equals("basketball")||desiredSport.equals("volleyball")) {
            if (desiredSport.equals("football")) {
                nmPlayers = 11;
            } else if (desiredSport.equals("basketball")) {
                nmPlayers = 5;
            } else {
                nmPlayers = 6;
            }
            int nm=1;
            while (nmPlayers != 0) {
                System.out.println("Player "+nm);
                nm++;
                nmPlayers--;
            }
        }
        else{
                System.out.println("Invalid sport!");
            }
    }
    public static void main(String[] args) {
        printNominatedPlayers();
        }
    }

