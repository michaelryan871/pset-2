/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;
import java.lang.Math;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

        System.out.print("\nEnter your first name: ");
        String firstName = in.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = in.nextLine();
        System.out.print("Enter your grade: ");
        int yourGrade = in.nextInt();
        System.out.print("Enter your age: ");
        int yourAge = in.nextInt();
        in.nextLine();
        System.out.print("Enter your hometown: ");
        String yourHometown = in.nextLine();

        System.out.println("\nNAME     : " + firstName + " " + lastName);
        System.out.println("GRADE    : " + yourGrade);
        System.out.println("AGE      : " + yourAge);
        System.out.println("HOMETOWN : " + yourHometown);


        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

         final double DOLLAR = 1.00;
         final double QUARTER = 0.25;
         final double DIME = 0.10;
         final double NICKEL = 0.05;
         final double PENNY = 0.01;

         System.out.print("\nEnter a dollar amount: ");
         double dollarAmountSmall = in.nextDouble(); // named "dollarAmountSmall" since the range is between 0 and 1.

         double dollars = Math.floor(dollarAmountSmall / DOLLAR);
         dollarAmountSmall = dollarAmountSmall - (dollars * DOLLAR);
         double quarters = Math.floor(dollarAmountSmall / QUARTER);
         dollarAmountSmall = dollarAmountSmall - (quarters * QUARTER);
         double dimes = Math.floor(dollarAmountSmall / DIME);
         dollarAmountSmall = dollarAmountSmall - (dimes * DIME);
         double nickels =Math.floor(dollarAmountSmall / NICKEL);
         dollarAmountSmall = dollarAmountSmall - (nickels * NICKEL);
         double pennies = Math.floor(dollarAmountSmall / PENNY);

         System.out.println("\nDOLLARS  : " + String.format("%.0f", dollars));
         System.out.println("QUARTERS : " + String.format("%.0f", quarters));
         System.out.println("DIMES    : " + String.format("%.0f", dimes));
         System.out.println("NICKELS  : " + String.format("%.0f", nickels));
         System.out.println("PENNIES  : " + String.format("%.0f", pennies));

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

         final double TEN_DOLLAR_BILL = 10.00;
         final double FIVE_DOLLAR_BILL = 5.00;

         System.out.print("\nEnter a dollar amount: ");
         double dollarAmountLarge = in.nextDouble(); // named "dollarAmountLarge" since the range is between 0 and 20.

         double tenDollarBills = Math.floor(dollarAmountLarge / TEN_DOLLAR_BILL);
         dollarAmountLarge = dollarAmountLarge - (tenDollarBills * TEN_DOLLAR_BILL);
         double fiveDollarBills = Math.floor(dollarAmountLarge / FIVE_DOLLAR_BILL);
         dollarAmountLarge = dollarAmountLarge - (fiveDollarBills * FIVE_DOLLAR_BILL);
         dollars = Math.floor(dollarAmountLarge / DOLLAR);
         dollarAmountLarge = dollarAmountLarge - (dollars * DOLLAR);
         quarters = Math.floor(dollarAmountLarge / QUARTER);
         dollarAmountLarge = dollarAmountLarge - (quarters * QUARTER);
         dimes = Math.floor(dollarAmountLarge / DIME);
         dollarAmountLarge = dollarAmountLarge - (dimes * DIME);
         nickels = Math.floor(dollarAmountLarge / NICKEL);
         dollarAmountLarge = dollarAmountLarge - (nickels * NICKEL);
         pennies = Math.floor(dollarAmountLarge / 0.01 );

         double totalBills = tenDollarBills + fiveDollarBills + dollars;
         double totalCoins = quarters + dimes + nickels + pennies;

         System.out.println("\nBILLS  : " + String.format("%.0f", totalBills));
         System.out.println("COINS  : " + String.format("%.0f", totalCoins));

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

         final double MILES_TO_INCHES = 63360;
         final double YARDS_TO_INCHES = 36;
         final double FEET_TO_INCHES = 12;

         System.out.print("\nEnter a number of inches: ");
         double numberOfInches = in.nextDouble();

         double miles = Math.floor(numberOfInches / MILES_TO_INCHES);
         numberOfInches = numberOfInches - (miles * MILES_TO_INCHES);
         double yards = Math.floor(numberOfInches / YARDS_TO_INCHES);
         numberOfInches = numberOfInches - (yards * YARDS_TO_INCHES);
         double feet = Math.floor(numberOfInches / FEET_TO_INCHES);
         numberOfInches = numberOfInches - (feet * FEET_TO_INCHES);

         System.out.println("\nMILES  : " + String.format("%.0f", miles));
         System.out.println("YARDS  : " + String.format("%.0f", yards));
         System.out.println("FEET   : " + String.format("%.0f", feet));
         System.out.println("INCHES : " + String.format("%.0f", numberOfInches));

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

         final double KILOMETERS_TO_CM = 100000;
         final double METERS_TO_CM = 100;

         System.out.print("\nEnter a number of centimeters: ");
         double numberOfCentimeters = in.nextDouble();

         double kilometers = Math.floor(numberOfCentimeters / KILOMETERS_TO_CM);
         numberOfCentimeters = numberOfCentimeters - (kilometers * KILOMETERS_TO_CM);
         double meters = Math.floor(numberOfCentimeters / METERS_TO_CM);
         numberOfCentimeters = numberOfCentimeters - (meters * METERS_TO_CM);

         System.out.println("\nKILOMETERS  : " + String.format("%.0f", kilometers));
         System.out.println("METERS      : " + String.format("%.0f", meters));
         System.out.println("CENTIMETERS : " + String.format("%.0f", numberOfCentimeters));

        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

         System.out.print("\nEnter a diameter: ");
         double circleDiameter = in.nextDouble();
         in.nextLine();

         double radiusCircle = circleDiameter / 2;
         double areaCircle = Math.PI * (Math.pow(radiusCircle, 2));
         double circumferenceCircle =  2 * Math.PI * radiusCircle;

         System.out.println("\nAREA          : " + String.format("%.2f", areaCircle));
         System.out.println("CIRCUMFERENCE : " + String.format("%.2f", circumferenceCircle));

        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */

         System.out.print("\nEnter a length: ");
         double rectangleLength = in.nextDouble();
         System.out.print("Enter a width: ");
         double rectangleWidth = in.nextDouble();
         in.nextLine();

         double perimeterRectangle = (rectangleLength * 2) + (rectangleWidth * 2);
         double areaRectangle = rectangleLength * rectangleWidth;
         double diagonalRectangle = Math.sqrt(Math.pow(rectangleLength, 2) + Math.pow(rectangleWidth, 2));

         System.out.println("\nAREA      : " + String.format("%.2f", areaRectangle));
         System.out.println("PERIMETER : " + String.format("%.2f", perimeterRectangle));
         System.out.println("DIAGONAL  : " + String.format("%.2f", diagonalRectangle));

        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */

         System.out.print("\nEnter a side length: ");
         double sideLength = in.nextDouble();
         in.nextLine();

         double areaHexagon = (3 * Math.sqrt(3)) / 2 * (Math.pow(sideLength, 2));
         double perimeterHexagon = 6 * sideLength;

         System.out.println("\nAREA      : " + String.format("%.2f", areaHexagon));
         System.out.println("PERIMETER : " + String.format("%.2f", perimeterHexagon));

        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */

          System.out.print("\nEnter a String: ");
          String reverseString = in.nextLine();

          int formula = Math.round(reverseString.length() / 2);

          String firstHalf = reverseString.substring(0, formula);
          String secondHalf = reverseString.substring(formula);
          System.out.println("\n" + secondHalf + firstHalf );

        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */

         System.out.print("\nEnter your first name: ");
         String firstNameInitial = in.nextLine();
         System.out.print("Enter your middle name: ");
         String middleNameInitial = in.nextLine();
         System.out.print("Enter your last name: ");
         String lastNameInitial = in.nextLine();

         System.out.println("\n" + firstNameInitial.charAt(0) + middleNameInitial.charAt(0) + lastNameInitial.charAt(0));

        in.close();
    }
}
