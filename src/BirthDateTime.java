import java.util.Scanner;

public class BirthDateTime {

        public static void main(String[] args) {
            Scanner pipe = new Scanner(System.in);
            String brithYear = "Enter you birth year ";
            int year = SafeInputs.getRangedInt(pipe, brithYear, 1950, 2010);

            String brithMonth = "Enter you birth Month ";
            int month = SafeInputs.getRangedInt(pipe, brithMonth, 1, 12);

            String brithDay = "Enter your birth day ";
            int day = BDay(pipe, brithDay, month);

            System.out.println("Enter the day of the week you were born on");
            pipe.hasNext();
            String dayOfWeek = pipe.next();
            pipe.nextLine();

          String hourOfBrith = "Enter your time of brith in hours";
          int hour = SafeInputs.getRangedInt(pipe,hourOfBrith,1,24);

            String minuteOfBrith = "Enter your time of brith in minutes";
            int minute = SafeInputs.getRangedInt(pipe,minuteOfBrith,1,59);

            System.out.println("You were born on " + month + "/" + day + "/" + year +". " + "At " + hour + " hour & " + minute + " minutes, " + "on a " + dayOfWeek);
        }
        private static int BDay(Scanner pipe, String brithDay, int month) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return SafeInputs.getRangedInt(pipe, brithDay, 1, 31);
                case 4:
                case 6:
                case 9:
                case 11:
                    return SafeInputs.getRangedInt(pipe, brithDay, 1, 30);
                case 2:
                    return SafeInputs.getRangedInt(pipe, brithDay, 1, 29);
            }
            return SafeInputs.getRangedInt(pipe, brithDay, 1, 12);
        }
    }



