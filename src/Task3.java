import java.util.Scanner;

public class Task3 {
    public static void isNumberPerfect () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNumber = sc.nextInt();
        int numCycle = userNumber-1;
        int sumDividers = 0;
        int divider = 1;
        while (numCycle != 0) {
            if (userNumber%divider==0) {
                sumDividers+=divider;
            }
            numCycle--;
            divider++;
        }
        if (sumDividers==userNumber) {
            System.out.println("Your number "+userNumber+" is perfect!");
        }
        else {
            System.out.println("Your number "+userNumber+" is not perfect!");
        }
    }
    public static void main(String[] args) {
        isNumberPerfect();
    }
}
