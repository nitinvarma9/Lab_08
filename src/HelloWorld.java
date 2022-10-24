import java.util.Scanner;

public class HelloWorld {
    public static void main(String[]args){

        System.out.println("Hello World!");
        int square = methods.squareNum(4);
        System.out.println(square);

        methods methodObject = new methods();
//        String myBirthdayMonth = methodObject.findMonthInWords(7);

        String myBirthdayMonth = methods.findMonthInWords(7);
        System.out.println("My birthday is: " + myBirthdayMonth);

        String myMomsBirthday = methods.findMonthInWords(9);
        System.out.println("My mom's birthday is: " + myMomsBirthday);

//       Scanner scanner = new Scanner(System.in);
//        String prompt = "Enter your SSN";
//        String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";
//       String ssn = SafeInputs.getRegExString(scanner, prompt, ssnPattern);
//        System.out.println("Your SSN is this: " + ssn);
    }
}
