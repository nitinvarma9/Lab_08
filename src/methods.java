import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  nextInt is an object method
        int myNumber = in.nextInt();

        // sqrt is a static method
        double squareRoot = Math.sqrt(49);

        System.out.printf("%5s %5s%n", "number", "Square");
        for (int num = 1; num <= 20; num++) {
            System.out.printf("%5d %5d%n", num, squareNum(num));
        }


    }

    public static int squareNum(int number) {
        //calculate the square of the number
        int squared = number * number;

        //we will return the square
        return squared;
    }

    /**
     * A method to return the month you are born in words
     */
    public static String findMonthInWords(int monthValue) {
        String monthInWord = "";
        switch (monthValue) {
            case 1:
                monthInWord = "January";
                break;
            case 2:
                monthInWord = "February";
                break;

            case 3:
                monthInWord = "March";
                break;

            case 4:
                monthInWord = "April";
                break;

            case 5:
                monthInWord = "May";
                break;

            case 6:
                monthInWord = "June";
                break;

            case 7:
                monthInWord = "July";
                break;

            case 8:
                monthInWord = "August";
                break;

            case 9:
                monthInWord = "September";
                break;

            case 10:
                monthInWord = "October";
                break;

            case 11:
                monthInWord = "November";
                break;

            case 12:
                monthInWord = "December";
                break;

            default:
                monthInWord = "Invalid Month Value";
        }
        return monthInWord;

    }


}