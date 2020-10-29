package com.mphasis.controller;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/*
 * @author : Anuj Ranjan Kumar
 * Created Date : 23rd October 2020
 * Modified Date : 25th October 2020
 * functionality : to add,edit and delete details of person in csv file
 * */

public class FileController {

    static StringBuffer stringBufferOfData = new StringBuffer();
    static String filename = null;
    static Scanner scanner = new Scanner(System.in);

    /*
     * functionality : contains logic to check for file and read file
     * */

    public void editMain() {

        boolean fileRead = readFile();
        if (fileRead) {

            replacement();
            writeToFile();
        }
        System.exit(0);
    }

    /*
     * functionality : contains logic to read details of person in file
     * */

    private static boolean readFile() {

        System.out.println("Please enter your files name and path i.e C:\\test.csv: ");
        filename = scanner.nextLine();
        Scanner fileToRead = null;
        try {

            fileToRead = new Scanner(new File(filename));
            for (String line; fileToRead.hasNextLine() && (line = fileToRead.nextLine()) != null; ) {

                System.out.println(line);
                stringBufferOfData.append(line).append("\r\n");
            }
            fileToRead.close();
            return true;
        }
        catch (FileNotFoundException ex) {

            System.out.println("The file " + filename + " could not be found! " + ex.getMessage());
            return false;
        }
        finally {

            fileToRead.close();
            return true;
        }

    }

    /*
     * functionality : contains logic to write details of person in file
     * */

    private static void writeToFile() {

        try {

            BufferedWriter bufwriter = new BufferedWriter(new FileWriter(filename));
            bufwriter.write(stringBufferOfData.toString());
            bufwriter.close();
        }
        catch (Exception e) {

            System.out.println("Error occured while attempting to write to file: " + e.getMessage());
        }
    }

    /*
     * functionality : contains logic to edit details of person in file
     * */

    private static void replacement() {

        System.out.println("Please enter the contents of a line you would like to edit: ");
        String lineToEdit = scanner.nextLine();
        System.out.println("Please enter the the replacement text: ");
        String replacementText = scanner.nextLine();
        int startIndex = stringBufferOfData.indexOf(lineToEdit);
        int endIndex = startIndex + lineToEdit.length();
        stringBufferOfData.replace(startIndex, endIndex, replacementText);
        System.out.println("Here is the new edited text:\n" + stringBufferOfData);
    }

    /*
     * functionality : contains logic to read details of person in file
     *                 which has to be deleted
     * */

    public void deleteMain(){

        boolean fileRead = readFile();
        if (fileRead) {

            delete();
            writeToFile();
        }
        System.exit(0);
    }

    /*
     * functionality : contains logic to delete details of person in file
     * */

    private static void delete() {

        System.out.println("Please enter the contents of a line you would like to edit: ");
        String lineToEdit = scanner.nextLine();
        System.out.println("Please enter the First Name : ");
        String replacementText = "";
        int startIndex = stringBufferOfData.indexOf(lineToEdit);
        int endIndex = startIndex + lineToEdit.length();
        stringBufferOfData.replace(startIndex, endIndex, replacementText);
        System.out.println("Data Deleted");
    }

    //below functions are not working correctly
    /*
     * functionality : contains logic to read and sort person details
     * */

    public void onePerson(){

        boolean fileRead = readFile();
        if (fileRead) {

            search();
            writeToFile();
        }
        System.exit(0);
    }

    private static void search() {

        System.out.println(" ");
        String lineToSearch = scanner.nextLine();
        int startIndex = stringBufferOfData.indexOf(lineToSearch);
        int endIndex = startIndex + lineToSearch.length();
    }
}