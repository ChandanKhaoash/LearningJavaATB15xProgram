package ex_13_Strings;

public class Lab035_String_Programs_1 {
    public static void main(String[] args) {
        String str = "Abcd";
        String str1= "abcd";
        String str2= "abcd";
        String str3= "abcd";
        String str4 = new String("abcd");
        String str5 = new String("abcd");
        String str6 = new String("abcd");

        System.out.println(str1==str2);
        System.out.println(str1==str);
        System.out.println(str3==str4);
        System.out.println(str4==str5);
        System.out.println(str.equalsIgnoreCase(str3));
        System.out.println(str.equalsIgnoreCase(str4));
        System.out.println(str.equals(str6));
        System.out.println(str.equals(str1));
        System.out.println(str1.equals(str5));
    }
}
