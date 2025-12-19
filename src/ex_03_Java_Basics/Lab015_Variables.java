package ex_03_Java_Basics;

public class Lab015_Variables {
    public static void main(String[] args) {
        byte age_Chandan= 32;
        // 32 here is called literal vzriable
        short income_per_day= 8000;
        int salary=2600000;
        long mobile_no= 9937471245L;
        char grade='A';
        String name= "Chandan";

        System.out.println("Name" +name);
        System.out.printf("Hello my salary is %d and my name is %s", +salary,name);
        System.out.print("Testing sysout print 1");
        System.out.print("Testing sysout print 2");
        System.out.println("Age" +age_Chandan);
        System.out.println("Mobile" +mobile_no);
        System.out.println("Salary per day" +income_per_day);
        System.out.printf("Grade: " +grade);
    }
}
