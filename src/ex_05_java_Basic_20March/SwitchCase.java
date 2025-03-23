package ex_05_java_Basic_20March;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        //Write the name of the week from the nu,ber


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number :");
        int week= scanner.nextInt();

        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}
