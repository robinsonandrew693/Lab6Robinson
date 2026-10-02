import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numberFullCharge = 0;
        double minutesPerCharge = 0;
        double costForCharge = 0;
        double availableMinutes;
        double totalCost;
        double hourCost;
        boolean numberChargeDone = false;
        boolean minuteChargeDone = false;
        boolean costChargeDone = false;

        do {
            System.out.println("What is the number of full battery charges available?");
            if (scan.hasNextDouble()) {
                numberFullCharge = scan.nextDouble();
                if (numberFullCharge >= 0) {
                    numberChargeDone = true;
                } else {
                    System.out.println("You inputted an invalid number of full charge available. Please input a positive number or zero.");
                }
            } else {
                System.out.println("You inputted an invalid data type. Please input a positive number.");
            }
            scan.nextLine();
        } while (!numberChargeDone);

        do {
            System.out.println("What is the minutes of robot operation per full charge?");
            if (scan.hasNextDouble()) {
                minutesPerCharge = scan.nextDouble();
                if (minutesPerCharge > 0) {
                    minuteChargeDone = true;
                }
                else {
                    System.out.println("You inputted an invalid number of minutes per charge. Please input a number above zero.");
                }
            }
            else {
                System.out.println("You inputted an invalid data type. Please input a number above zero.");
            }
            scan.nextLine();
        } while (!minuteChargeDone);

        do {
            System.out.println("What is the cost to recharge one battery fully?");
            if (scan.hasNextDouble()) {
                costForCharge = scan.nextDouble();
                if (costForCharge > 0) {
                    costChargeDone = true;
                }
                else {
                    System.out.println("You inputted an invalid cost for charging one battery fully. Please input a number above zero.");
                }
            }
            else {
                System.out.println("You inputted an invalid data type for the cost of charging one battery fully. Please input a number above zero. ");
            }
            scan.nextLine();
        } while (!costChargeDone);

        availableMinutes = numberFullCharge * minutesPerCharge;
        totalCost = (costForCharge * numberFullCharge);
        hourCost = costForCharge * (60/minutesPerCharge);

        System.out.printf("%-19s%8.2f", "Available Minutes:", availableMinutes);
        System.out.printf("\n%-19s%8.2f", "Hour Cost:", hourCost);

    }
}
