import java.util.Scanner;
public class SafeInputs {
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt);
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clears the input buffer

                if (retVal >= low && retVal <= high) {
                    done = true;

                } else {
                    System.out.println("\n The number is out of range [" + low + "-" + high + "]: " + retVal);
                }

            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer! You entered: " + trash);
            }

        } while (!done);

        return retVal;

    }


    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt);
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clears the input buffer

                if (retVal >= low && retVal <= high) {
                    done = true;

                } else {
                    System.out.println("\n The number is out of range [" + low + "-" + high + "]: " + retVal);
                }

            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a number! You entered: " + trash);
            }

        } while (!done);

        return retVal;

    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx){
        String retVal = "";
        String trash = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.matches(regEx)) {
                done = true;
            } else {
                System.out.println("\n" + prompt + "must match the pattern " + regEx);
                System.out.println("Try again!");
            }
        }while (!done) ;

            return retVal;
    }
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.println("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }
    public static int getInt(Scanner pipe, String prompt){
        int retVal = 0;
        String trash = "";

        do {
            System.out.println("\n" + prompt);
            if (pipe.hasNextInt()){
                retVal = pipe.nextInt();
                pipe.nextLine();
            }else{
                trash = pipe.nextLine();
                System.out.println("You must enter an integer! You entered: " + trash);
            }
        }while(retVal > 0 && retVal < 0);

        return retVal;

    }
    public static double getDouble(Scanner pipe, String prompt){
        double retVal = 0;
        String trash = "";

        do {
            System.out.println("\n" + prompt);
            if (pipe.hasNextDouble()){
                retVal = pipe.nextDouble();
                pipe.nextLine();
            }else{
                trash = pipe.nextLine();
                System.out.println("You must enter a number! You entered: " + trash);
            }
        }while(retVal < 0 && retVal > 0);

        return retVal;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String retString = "";
        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            if (pipe.hasNextLine())
                retString = pipe.nextLine();

        } while (retString == null || (retString.trim().length() == 1
                && !(retString.trim().equalsIgnoreCase("y") || retString.trim().equalsIgnoreCase("n"))));

        if (retString.trim().equalsIgnoreCase("y"))
            return true;
        else
            return false;
    }

    public static void prettyHeader(String msg) {
        int astCount=60;
        while(astCount!= 0)
        {System.out.print("*");
            astCount--;
        }
        System.out.println();
        int astsonLeft=(60-msg.length())/10;
        int left = 1;
        while(left <= astsonLeft)
        {
            System.out.print("*");
            left++;
        }
        System.out.print(msg);
        int right = 1;
        while(right <= astsonLeft)
        {
            System.out.print("*");
            right++;
        }
        System.out.println();
        astCount = 60;
        while(astCount!= 0)
        {
            System.out.print("*");
            astCount--;
        }
    }
}




