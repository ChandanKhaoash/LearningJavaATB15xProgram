package ex_06_Ternary_Operator;

public class Lab022_AgeCategoryWithUserInputCLI {
    public static void main(String[] args) {
       // int age= 11;
        int age= Integer.parseInt(args[0]);
        String ageCategory = (age < 18) ? "Minor": (age<=60) ? "Adult": "Senior Citizen";
        System.out.println(ageCategory);
    }
}
