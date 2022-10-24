import java.util.Scanner;

public class FavNumbers {
 public static void main(String[]args){
     Scanner pipe = new Scanner(System.in);
     int favInteger = SafeInputs.getInt(pipe,"Enter your favourite integer ");
     System.out.println("Your favourite integer is: " + favInteger);

     double favNumber = SafeInputs.getDouble(pipe,"Enter your favourite number ");
     System.out.println("Your favourite number is: " + favNumber);
 }
}
