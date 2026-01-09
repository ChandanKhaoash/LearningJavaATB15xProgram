package ex_11_Break_and_Continue;

public class Lab030_Break_Continue {
    public static void main(String[] args) {
        for(int i=0; i< 10; i++) {
            if(i>5)
            continue;
            else
            System.out.println(i);
            break;
        }

    }
}
