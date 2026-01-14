package ex_13_Strings;

public class Lab037_String_Functions_2 {
    public static void main(String[] args) {
        String str ="Barracuda";
        CharSequence str1= "Scorpene";
        System.out.println("Print CharSequence-" +str1);
        System.out.println("Print Subsequence-" +str1.subSequence(0,3));
        System.out.println("Print String-" +str);
        System.out.println("Print SubString-" +str.substring(0,3));
        System.out.println("Print SubString single param-" +str.substring(3));
        System.out.println("Trim-" +str.trim());
    }
}
