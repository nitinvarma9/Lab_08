import java.util.Scanner;

public class Birthdays {
    public static void main(String[]args){
        Scanner pipe = new Scanner(System.in);
        int birthMonth = SafeInputs.getRangedInt(pipe,"Enter your birthday month in number", 1,12);
        System.out.println("Your birthday month is: " + birthMonth);
        System.out.println("Your birthday month in words is: " + methods.findMonthInWords(birthMonth));

        int birthDay = SafeInputs.getRangedInt(pipe,"What is the day you were born on?", 1,31);
        System.out.println("The day you were born on is: " + birthDay);
    }
}
