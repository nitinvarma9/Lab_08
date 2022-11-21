import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

import javax.swing.JFileChooser;

public class FileAway{

    public static void main(String args[]){

//Create a file chooser object

        final JFileChooser file_chooser = new JFileChooser();

//show dialog to select file

        int returnVal = file_chooser.showOpenDialog(null);

//get selected file

        File file=file_chooser.getSelectedFile();

//variable to store data

        int line_count=0;

        int word_count=0;

        int character_count=0;

        String line="";

        try {

            Scanner read=new Scanner(file);


            while(read.hasNextLine())

            {

                line=read.nextLine();


                String words[]=line.split(" ");


                character_count = character_count + line.length();

                word_count = word_count + words.length;

                line_count = line_count +1;

            }

        } catch (FileNotFoundException e) {

// TODO Auto-generated catch block

            e.printStackTrace();

        }


        System.out.printf("The name of the file selected: %s \n Total character count: %d \n Total word count: %d \n Total line count: %d \n",file.getName(),character_count,word_count,line_count);

    }

}