package exercises;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
        //instance of aAreaOfRectangle
        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
        // call method
        areaOfRectangle.calculateAreaOfRectangle();

    }
    //class variables (property)
    //constructor

    //method
    public void calculateAreaOfRectangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the length of the rectangle?:");
        Double myRectangleLength = scanner.nextDouble();
        System.out.println("What's the length of the width?:");
        Double myRectangleWidth = scanner.nextDouble();
        // area calc
        Double area = myRectangleLength * myRectangleWidth;
        // print area why .toString because of double?
        System.out.println("Area of the rectangle is: " + area.toString());

    }
}
