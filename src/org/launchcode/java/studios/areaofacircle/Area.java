package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main (String[] args) {
        double radius;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble(); //Declares the 'name' variable and initializes it with text from the command line.
        input.close();
        System.out.println("You entered:" + radius);
//        area =  3.14 * r * r;
        area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius:" + radius + " is "+ area);
//
    }
}
