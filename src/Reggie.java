import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String prompt = "Enter your SSN";
//        String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";
//        String ssn = SafeInputs.getRegExString(scanner, prompt, ssnPattern);
//        System.out.println("Your SSN is this: " + ssn);
//
//        String prompt = "Enter your UC M number";
//        String mNumberPattern = "(M|m)\\d{5}";
//        String mNumber = SafeInputs.getRegExString(scanner, prompt, mNumberPattern);
//        System.out.println("Your UC M number is this: " + mNumber);

        String prompt = "Select your choice of menu";
        String menuPattern = "(O|o)||(S|s)||(V|v)||(Q|q)"  ;
        String menu = SafeInputs.getRegExString(scanner, prompt, menuPattern);
        System.out.println("Your choice is: " + menu);
    }
}
