import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {

    public static void main(String[] args) {
        int[] dataPoints = new int[100];

        Random random = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length - 1; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.print(dataPoints[99]);

        int sum = 0;
        double avg = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        avg = sum / 100.0;
        System.out.println("\n\nThe sum of the random array dataPoints is " + sum + " and the average is " + avg);

           int max = dataPoints[0];
            for(int i = 1; i < dataPoints.length; i++) {
                if (max < dataPoints[i]) {
                    max = dataPoints[i];
                }
            }
        System.out.println(" The Max value is: " + max);
           int min = dataPoints[0];
            for(int i = 1; i < dataPoints.length; i++) {
                if(min > dataPoints[i]) {
                    min = dataPoints[i];
                }
            }
        System.out.println("The Min value is: " + min);


        String wholeNumber = "\nEnter any whole number between 1 and 100: ";
        Scanner pipe = new Scanner(System.in);
        int num = SafeInputs.getRangedInt(pipe,wholeNumber,1,100);
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == num) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("The value " + num + " was not found in the array.");
        } else {
            System.out.println("The value " + num + " was found " + count + " time(s) in the array.");
        }
        int index = contains(dataPoints, num);
        if(index >= 0){
            System.out.println("Number "+num+" Index: "+index);
            System.out.println("Number of times "+num+" has occured: "+occuranceScan(dataPoints, num));
        }
        else {
            System.out.println("Number "+num+" is not in the array");
        }


        boolean found = false;
        int position = 0;
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] == num) {
                position = i++;
                found = true;
                continue;
            }
        }
        if (found) {
            System.out.println("The value " + num + " was found at array index " + position);
        } else {

            System.out.println("The value " + num + " was not found");
    }

    }


    private static int occuranceScan(int[] dataPoints, int num) {
        int count = 0;
        for(int i = 0; i < 100; i++) {
            if(dataPoints[i] == num) {
                count++;
            }
        }
        return count;

    }
    private static int contains(int dataPoints[], int num) {
        int index = 0;
        for(int i = 0; i < 100; i++) {
            if(dataPoints[i] == num) {
                index = i;
                break;
            }
            else
                index = -1;
        }
        return index;
    }
}
