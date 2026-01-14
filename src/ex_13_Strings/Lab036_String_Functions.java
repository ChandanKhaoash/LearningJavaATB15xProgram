package ex_13_Strings;

public class Lab036_String_Functions {
    public static void main(String[] args) {
        String str = "Arihant Ship";
        String str2= "Arihantham";
        String str3= " ";
        System.out.println("charAt-"+str.charAt(3));
        System.out.println("compareTo-" +str.compareTo(str2));
        System.out.println("IndexOf-" +str2.indexOf("A"));
        System.out.println("LastIndexOf-" +str2.lastIndexOf("A"));
        System.out.println("isEmpty-"+str3.isEmpty());
        System.out.println("isBlank-"+str3.isBlank());
        System.out.println("replace-"+str.replace("Ship","Boat"));
        System.out.println("Join-" +String.join("**", str, str3, str2));
        System.out.println("startsWith-"+str.startsWith("A"));
        System.out.println("endsWith-"+str2.endsWith("a"));
        System.out.println("Concat-" +str.concat(" is a strategic asset for Indian Navy"));
        System.out.println("Concat with another String-" +str.concat(str2));
        System.out.println("Repeat-" +str.repeat(3));
    }
}
