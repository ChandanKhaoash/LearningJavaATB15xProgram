package ex_12_Functions;

import java.util.Scanner;

public class Lab034_Calculator_using_Func {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter 1st No");
        int a = readInt(scanner, "Enter 1st No");
        int b = readInt(scanner, "Enter 2nd No");
        add(a,b);
        sub(a,b);
        multiply(a,b);
        divide(a,b);

    }


    public static int readInt (Scanner scanner, String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        else
            System.out.println("Enter Numbers in Int format");
        return 0;


    }
    public static void add (int a, int b) {
        System.out.println("Sum of two numbers: "+ (a+b));
    }
    public static void sub (int a, int b) {
        System.out.println("Diff of two numbers: "+ (a-b));
    }
    public static void multiply (int a, int b) {
        System.out.println("Product of two numbers: "+ (a*b));
    }
    public static void divide (int a, int b) throws Exception {
        if(b==0) {
            throw new Exception("Divide by 0 is not possible");
        }
        else {
            System.out.println("Div of two numbers: " + (a / b));
        }
    }
}

