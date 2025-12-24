package ex_06_Ternary_Operator;

public class Lab023_Ternary_Operator_2 {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        int max= (n1>n2) ? n1 : (n2>n3) ? n2: n3;
        System.out.println(max);
    }
}
