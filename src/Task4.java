import java.util.Scanner;
import java.lang.Math;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ticketValue = (int)(Math.random() * 15) + 20;
        int userGuess = 0;
        boolean done = false;

        do {
            System.out.println("How many tickets do you think were sold? From 20 through 35 is the range.");
            if (scan.hasNextInt()) {
                userGuess = scan.nextInt();
                if (userGuess >= 20 && userGuess <= 35) {
                    done = true;
                }
                else {
                    System.out.println("You inputted an invalid number. Please ensure that you input a positive, integer value falling in the given range.");
                }
            }
            else {
                System.out.println("You inputted an invalid data type. Please ensure that you input a positive, integer value falling in the given range.");
            }
            scan.nextLine();
        } while (!done);

        if (userGuess == ticketValue) {
            System.out.println("The number was " + userGuess + ". You were correct!");
        }
        else if (userGuess < ticketValue) {
            System.out.println("Sorry, you guessed the wrong number. It was " + ticketValue + ". You were too low.");
        }
        else {
            System.out.println("Sorry, you guessed the wrong number. It was " + ticketValue + ". You were too high.");
        }
    }
}
