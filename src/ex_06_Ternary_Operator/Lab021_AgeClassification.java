package ex_06_Ternary_Operator;

public class Lab021_AgeClassification {
    public static void main(String[] args) {
        //Age <18= Minor, <=60 Adult, rest Senior Citizen
        int age= 11;
        String ageCategory = (age < 18) ? "Minor": (age<=60) ? "Adult": "Senior Citizen";
        System.out.println(ageCategory);

    }
}
