import java.util.Scanner;
import java.lang.Math;

public class Task3 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        double firstSide = 0;
        double secondSide = 0;
        double area;
        double hypotenuse;
        double perimeter;
        boolean firstSideDone = false;
        boolean secondSideDone = false;

        do {
            System.out.println("What is the length of the first side of the garden?");
            if (scan.hasNextDouble()) {
                firstSide = scan.nextDouble();
                if (firstSide > 0) {
                    firstSideDone = true;
                }
                else {
                    System.out.println("You inputted an invalid length for the first side. Please make sure it is a positive number.");
                }
            }
            else {
                System.out.println("You inputted an invalid data type for the length of the first side. Please make sure it is a positive number.");
            }
        } while (!firstSideDone);

        do {
            System.out.println("What is the length of the second side of the garden?");
            if (scan.hasNextDouble()) {
                secondSide = scan.nextDouble();
                if (secondSide > 0) {
                    secondSideDone = true;
                }
                else {
                    System.out.println("You inputted an invalid length for the second side. Please make sure it is a positive number.");
                }
            }
            else {
                System.out.println("You inputted an invalid data type for the length of the second side. Please make sure it is a positive number.");
            }
        } while (!secondSideDone);

        hypotenuse = Math.hypot(firstSide, secondSide);
        area = (firstSide * secondSide) / 2;
        perimeter = (firstSide * 2) + (secondSide * 2);

        System.out.printf("%-15s%15.2f%1s", "Area:", area, "m²");
        System.out.printf("\n%-15s%15.2f%1s", "Hypotenuse:", hypotenuse, "m");
        System.out.printf("\n%-15s%15.2f%1s", "Perimeter:", perimeter, "m");

    }
}
