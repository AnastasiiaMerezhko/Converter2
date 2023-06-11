package app;

import java.util.Scanner;

public class Main {

    static double miles;
    static double input1;

    public static void main(String[] args) {
        convertMiles();
    }

    private static void convertMiles() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter miles: ");
        miles = scanner.nextDouble();

        input1 = convertMilesToKilometers(miles);

        System.out.println(miles + " miles = " + input1 + " kilometers");
    }
    private static double convertMilesToKilometers(double miles) {
        return miles * 1.609344;
    }
}
