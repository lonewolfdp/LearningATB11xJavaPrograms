package Task;

import java.util.Scanner;

public class GradeScanner {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Your Score :");
        int grade = scanner.nextInt();


        String Result= (grade>90 && grade<100)? "A-Grade" :
                (grade>90 && grade<100)? "A-Grade" :
                        (grade>80 && grade<89)? "B-Grade" :
                                (grade>70 && grade<79)? "C-Grade" :
                                        (grade>60 && grade<69)? "D-Grade" : "F-Grade" ;

        System.out.println("Your Grade is :"+Result);

    }
}
