import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double userKilometers = 0;
        double userMiles = 0;
        boolean done = false;

        do {
            System.out.println("What is your distance in kilometers?");
            if (scan.hasNextDouble()) {
                userKilometers = scan.nextDouble();
                if (userKilometers >= 0) {
                    userMiles = userKilometers * 0.621371;
                    done = true;
                }
                else {
                    System.out.println("You inputted an invalid distance for kilometers. Please enter a positive number.");
                }
            }
            else {
                System.out.println("You inputted an invalid data type. Please enter a positive number.");
            }

            scan.nextLine();

        } while (!done);

        System.out.printf("%-12s%12.2f", "Kilometers:", userKilometers);
        System.out.printf("\n%-12s%12.2f", "Miles:", userMiles); //Right-aligned to make it match up to the right space after miles.

    }
}
