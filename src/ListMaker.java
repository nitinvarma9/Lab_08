import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        final String menu = "A- add, D- delete, P -print, Q -quit";
        boolean done = false;
        String cmd = "";

        do
        {
            displayList();
            cmd = SafeInputs.getRegExString(console, menu, "[AaDdPpQq]");
            cmd = cmd.toUpperCase();

            switch(cmd)
            {
                case "A":
                    Add();
                    break;
                case "D":
                    Delete();
                    break;
                case "P":
                    displayList();
                    break;
                case "Q":
                    Quit();
                    break;



            }
            System.out.println("cmd is " +cmd);
        }
        while(!done);
    }

    private static void Quit() {
        Scanner sc = new Scanner(System.in);
        String message = "Are you sure? ";
        boolean quit = SafeInputs.getYNConfirm(sc,message);
        if(quit) {
            System.exit(1);
        }
        return;
    }
    private static void Delete() {
        Scanner sc = new Scanner(System.in);
        String message = "Enter the index number of the item to be removed ";
        if(list.isEmpty()) {
            System.out.println("List is Empty ");
            return;
        }
        int index = SafeInputs.getRangedInt(sc, message,0, list.size());
        list.remove(index-0);
    }
    private static void Add() {
        Scanner sc = new Scanner(System.in);
        String item = SafeInputs.getNonZeroLenString(sc, "What do you want to add? ");
        list.add(item);

    }
    private static void displayList()
    {
        System.out.println("  ");
        if(list.size() !=0)
        {

            for(int i =0; i < list.size(); i++)
            {
                System.out.printf(" %3d. %2s ", i+0, list.get(i) );
                System.out.println(" ");
            }
        }
        else
            System.out.println(" List is empty ");
        System.out.println("  ");
    }
}
