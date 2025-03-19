package Task;

import java.util.Scanner;

public class UserInput14March {
    public static void main(String[] args) {
       //Take a user input - Name, Age and Salary and print them in the end.

        char name;
        System.out.println("Enter your Name :");
        Scanner scanner=new Scanner(System.in);
        String name1=scanner.nextLine();


        int age;
        System.out.println("Enter your age :");
        Scanner scanner1=new Scanner(System.in);
        int age1= scanner1.nextInt();

        float salary;
        System.out.println("Enter your salary :");
        Scanner scanner2=new Scanner(System.in);
        float salary1 = scanner2.nextFloat();

        System.out.println("Your Name is "+name1+"\n Your Age is "+age1+ "\n Your Salary is "+salary1);

    }
}
