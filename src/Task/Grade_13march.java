package Task;

public class Grade_13march {
    public static void main(String[] args) {

//    Write a program that calculates and displays the letter grade for a given numerical score
//    (e.g., A, B, C, D, or F) based on the following grading scale:
//    A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: 0-59

        String grade1= args[0];
        String grade2= args[1];
        String grade3= args[2];
       // System.out.println(grade1);
        int grade= Integer.parseInt(grade1);
        int gradeA= Integer.parseInt(grade2);
        int gradeB= Integer.parseInt(grade3);

 String Result= (grade>90 && grade<100)? "A-Grade" :
         (grade>90 && grade<100)? "A-Grade" :
                 (grade>80 && grade<89)? "B-Grade" :
                         (grade>70 && grade<79)? "C-Grade" :
                                 (grade>60 && grade<69)? "D-Grade" : "F-Grade" ;

        System.out.println(Result);

        String Result1= (gradeA>90 && gradeA<100)? "A-Grade" :
                (gradeA>90 && gradeA<100)? "A-Grade" :
                        (gradeA>80 && gradeA<89)? "B-Grade" :
                                (gradeA>70 && gradeA<79)? "C-Grade" :
                                        (gradeA>60 && gradeA<69)? "D-Grade" : "F-Grade" ;

        System.out.println(Result1);

        String Result2= (gradeB>90 && gradeB<100)? "A-Grade" :
                (gradeB>90 && gradeB<100)? "A-Grade" :
                        (gradeB>80 && gradeB<89)? "B-Grade" :
                                (gradeB>70 && gradeB<79)? "C-Grade" :
                                        (gradeB>60 && gradeB<69)? "D-Grade" : "F-Grade" ;

        System.out.println(Result2);
    }
}
