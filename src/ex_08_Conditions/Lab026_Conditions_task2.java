package ex_08_Conditions;

public class Lab026_Conditions_task2 {
    public static void main(String[] args) {
        int i;
        for (i=1; i <=100; i++) {
            if (i%5 == 0 && i%3 ==0)
                System.out.println("FizzBuzz " +i);
           else if (i%3==0)
                System.out.println("Fizz " +i);
            else if (i%5==0)
                System.out.println("Buzz " +i);

            else System.out.println("Neither a multiple of 3 or 5 or both");
        }
    }
}
