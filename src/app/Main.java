package app;

import java.util.Scanner;

public class Main {

    static double miles;
    static double input1;
    static double kms;
    static double input2;

    public static void main(String[] args) {
        convertMiles();
        convertKms();
    }

    private static void convertMiles() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter miles: ");
        miles = scanner.nextDouble();

        input1 = convertMilesToKilometers(miles);

        System.out.println(miles + " miles = " + input1 + " kilometers");
    }

    private static void convertKms() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter kilometers: ");
        kms = scanner.nextDouble();

        input2 = convertKilometersToMiles(kms);

        System.out.println(kms + " kilometers = " + input2 + " miles");
    }
    private static double convertMilesToKilometers(double miles) {
        return miles * 1.609344;
    }

    private static double convertKilometersToMiles(double kms) {
        return kms / 1.609344;
    }
}
