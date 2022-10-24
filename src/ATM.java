import java.util.Scanner;

public class ATM {

    static Scanner in = new Scanner(System.in);
   static double balance = 1000;

    public static void main(String[]args){

        System.out.println("Select an option to proceed, W - withdraw, D - deposit, C - check balance, Q - quit");

        String option = in.nextLine();
        option = option.toUpperCase();

        switch (option) {
            case "W":
                withdraw();
                break;
            case "D":
                deposit();
                break;
            case "C":
                checkBalance();
                break;
            case "Q":
                quit();
                break;
            default:
                System.out.println("Invalid input");
        }
        }

    private static void deposit() {
        System.out.println("How much do you want to deposit");
        double depositAmount = in.nextDouble();
        in.nextLine();
        balance = balance + depositAmount;
        System.out.println("You deposited" + depositAmount + "Your new balance" + balance);
    }

    public static void withdraw() {
        System.out.println("How much do you want to withdraw");
        double withdrawAmount = in.nextDouble();
        in.nextLine();
        balance = balance + withdrawAmount;
        System.out.println("You withdrew" + withdrawAmount + "Your new balance" + balance);
    }
    public static void checkBalance(){
        System.out.println("The money left in your bank account is" + balance);
        System.out.println("Thank you for banking with us");
    }
    public static void quit(){
        System.out.println("Goodbye");
        System.exit(0);
    }
}
