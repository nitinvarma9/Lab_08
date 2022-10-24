import java.util.Scanner;

public class CToFTableDisplay {

    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        double CStart=-100.0;
        double CEnd=100.0;

        System.out.printf("%-15s %1s%n", "Celsius","Fahrenheit") ;
        while(CStart <= CEnd)
        {
            System.out.println("|" +CStart+ "     |      " + CtoF(CStart) + "|" );
            CStart+= 1.00;
        }

    }

    public static double CtoF(double C) {
        double F=((9 * C)/5) + 32;
        return F;

    }



}

