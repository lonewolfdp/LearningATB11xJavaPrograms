package Task;

import java.util.Scanner;

public class MaxNumTernaryOper14March {
    public static void main(String[] args) {

 //Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

        int a;
        System.out.println("Enter 1st number :");
        Scanner sc = new Scanner(System.in);
        int a1= sc.nextInt();


        int b;
        System.out.println("Enter 2nd number :");
        Scanner sc1 = new Scanner(System.in);
        int b1= sc1.nextInt();


        int c= a1>b1 ? a1 : b1;
        System.out.println("The Maximum Number is : "+c);


    }
}
