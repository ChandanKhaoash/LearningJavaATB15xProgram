package ex_08_Conditions;

import java.util.Scanner;

public class Lab025_Conditions_task1 {
    public static void main(String[] args) {
        System.out.println("Enter Side 1");
        Scanner scanner= new Scanner(System.in);
        int side1= scanner.nextInt();
        System.out.println("Enter Side 2");
        int side2= scanner.nextInt();
        System.out.println("Enter Side 3");
        int side3= scanner.nextInt();

        if (side1==side2 && side2==side3) {
            System.out.println("Equilateral Triangle");
        }
        else if (side1==side2 || side2==side3 || side3==side1) {
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
    }

}
