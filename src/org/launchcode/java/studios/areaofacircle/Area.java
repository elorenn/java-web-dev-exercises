package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        String strRadius = input.nextLine();
        try {
            double radius = Double.parseDouble(strRadius);
            while (radius < 0) {
                System.out.println("Error: radius cannot be negative.");
                System.out.println("Enter a radius: ");
                strRadius = input.nextLine();
                radius = Double.parseDouble(strRadius);
            }
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle with radius " + radius + " is: " + area);

        }
        catch (NumberFormatException e) {
            System.out.println("Error: " + e);
        }

    }
}
