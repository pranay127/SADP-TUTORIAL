package UI;
import java.util.Scanner;
import Bussinesslogic.*;
import factory.*;

public class CalUi {
    private static String exp;
    private double result;

    public String getExp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Expression:");
        exp = sc.nextLine();
        if(exp.length() > 20){
            System.out.println("Maximum length of 20");
            getExp();
        }
        return exp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalUi c = new CalUi();
        CalHandler ch = new CalHandler();
        while(true){
            exp = c.getExp();
            c.result = ch.evaluate(exp);
            System.out.println("Result: " + c.result +"\nContinue (Y/N)? ");
            String choice = sc.nextLine();
            if(choice.equals("N") || choice.equals("n"))
                break;
        }
    }
}
