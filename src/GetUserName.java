import java.util.Scanner;

public class GetUserName {
    public static void main(String[]args){
        Scanner pipe = new Scanner(System.in);
        String userName = SafeInputs.getNonZeroLenString(pipe,"Enter your username ");
        System.out.println("Your username is: ");
    }
}
