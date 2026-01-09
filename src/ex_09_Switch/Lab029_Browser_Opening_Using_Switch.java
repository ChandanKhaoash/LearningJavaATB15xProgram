package ex_09_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Lab029_Browser_Opening_Using_Switch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the browser you wish to open");
        if (scanner.hasNext()) {
            String browser = scanner.next();
            browser= browser.toLowerCase();
            switch(browser) {
                case "chrome" :
                    System.out.println("Opening Chrome Browser...");
                    System.out.println("TC1 Executed....");
                    break;

                case "firefox":
                    System.out.println("Opening Firefox browser...");
                    System.out.println("TC2 executed...");
                    break;

                case "edge":
                    System.out.println("Opening Edge browser...");
                    System.out.println("TC3 executed...");
                    break;

                default:
                    System.out.println("No Such browser exists...");


            }


        }
    }
}
