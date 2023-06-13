package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
    MilesPerGallon mpgSonic = new MilesPerGallon();
    mpgSonic.calculateMPG();
    }
    //method calculate miles per gallon
    public void calculateMPG(){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?:");
        Double numMiles = input.nextDouble();

        System.out.println("How many gallons of gas have you consumed?:");
        Double numGallons = input.nextDouble();

        Double mpg = numMiles/numGallons;
        System.out.println("You are getting," + mpg.toString() +" mpg." );

    }

}
