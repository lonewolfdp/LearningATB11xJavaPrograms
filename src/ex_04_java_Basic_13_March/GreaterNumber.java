package ex_04_java_Basic_13_March;

public class GreaterNumber {
    public static void main(String[] args) {

        int n1=6;
        int n2=20;
        int n3=-23;


        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
        System.out.println("Max ix " + max);
    }

}
