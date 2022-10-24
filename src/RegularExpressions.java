import java.util.Scanner;

public class RegularExpressions {
    public static void main(String[]args){
      String myZipCode; // Receive this from the user

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your zipcode");
//        myZipCode = scanner.nextLine();
//        String zipCodePattern = "\\d{5}";
//        System.out.println("The zip code entered matches the pattern: " + myZipCode.matches(zipCodePattern));

        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        String firstNamePattern = "[A-Z][a-zA-Z]*";
        System.out.println("The first name entered matches the pattern: " + firstName.matches(firstNamePattern));

    }
}
