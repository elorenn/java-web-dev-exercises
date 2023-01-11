package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        String strRadius = input.nextLine();

        if (strRadius.isEmpty()) {
            System.out.println("Error. Empty radius.");
        } else {
            try {
                double radius = Double.parseDouble(strRadius);
                if (radius < 0) {
                    System.out.println("Error. Impossible radius.");
                } else {
                    double area = Circle.getArea(radius);
                    System.out.println("The area of a circle with radius " + radius + " is: " + area);
                }
            }
            catch (Exception e) {
                System.out.println("Error. Radius must be a number.");
            }
        }
    }
}
