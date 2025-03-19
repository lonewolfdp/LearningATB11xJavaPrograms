package Task;

import java.util.Scanner;

public class OddEvenUserInput14March {
    public static void main(String[] args) {
// Take user input & Check weather the input is even or odd number

        int a;
        System.out.println("Enter your Number: ");
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();

        if (a1%2 == 0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }
    }
