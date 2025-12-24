package ex_05_Type_Casting;

public class Lab019_TypeCasting_2 {
    public static void main(String[] args) {
        int a= 300;
       // byte b= a; // Implicit narrowing
        byte b1= (byte)a;
        System.out.println(b1);
    }
}
