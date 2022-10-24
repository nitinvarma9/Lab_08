import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        boolean hasMoreItems = SafeInputs.getYNConfirm(pipe, "Do you have an item to scan?");
        double sumOfItems = 0;
        while(hasMoreItems)
        {
            double price=SafeInputs.getRangedDouble(pipe, "Enter price of your item",0.50,9.99);
            sumOfItems+=price;
            hasMoreItems=SafeInputs.getYNConfirm(pipe, "Do you have an item to scan?");
        }

        System.out.printf("Total amount is: %.2f",sumOfItems);

    }


}


