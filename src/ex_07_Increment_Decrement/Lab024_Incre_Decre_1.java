package ex_07_Increment_Decrement;

public class Lab024_Incre_Decre_1 {
    public static void main(String[] args) {

        int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);



        int a1 = 3;

        int b = a1++ * ++a1;

        System.out.println(b);


        int a2 = 5;

        System.out.println(a2++ + a2--);
    }
}
