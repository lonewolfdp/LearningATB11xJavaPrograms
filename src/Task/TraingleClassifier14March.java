package Task;

import java.util.Scanner;

public class TraingleClassifier14March {

//Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides,
// determine if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or scalene (no sides are equal).
// Use an if-else statement to classify the triangle.

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter length of side 1");
        double side1=scanner.nextDouble();

        System.out.println("Enter length of side 2 ");
        double side2=scanner.nextDouble();

        System.out.println("Enter legth of side 3");
        double side3=scanner.nextDouble();

        if(side1==side2 && side2==side3) {
            System.out.println("Traingle is equilateral");
        } else if (side1==side2 || side2==side3 || side3==side1) {
            System.out.println("Traingle is isosceles ");
        }
        else {
            System.out.println("Traingle is scalene");
        }
    }


}