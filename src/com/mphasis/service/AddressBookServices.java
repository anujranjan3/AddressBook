package com.mphasis.service;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * @author : Anuj Ranjan Kumar
 * Created Date : 22nd October 2020
 * Modified Date : 25th October 2020
 * functionality : This File Contains Logic for
 *                 1.createNewAddressBook
 *                 2.openExistingAddressBook
 *                 3.closeAddressBook
 *                 4.saveAddressBook
 *                 5.quitAddressBook
 * */

public class AddressBookServices {

    PersonServices personServices=new PersonServices();
    Scanner scanner=new Scanner(System.in);

    /*
     * functionality : contains logic to create new Address Book
     * */

    public void createNewAddressBook() throws IOException {

        String newFileName;
        System.out.println("Enter The Name of New file Name  i.e output.csv");
        String filename=scanner.next();
        newFileName="D:\\"+filename;
        File newFile = new File(newFileName);
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
    }

    /*
     * functionality : contains logic to open Existing Address Book
     * */

    public void openExistingAddressBook(){

        personServices.printPersonDetails();
    }

    /*
     * functionality : contains logic to close Address Book
     * */

    public void closeAddressBook(){

        System.out.println(" Address Book closed");
        System.exit(0);
    }

    /*
     * functionality : contains logic to save Address Book
     * */

    public void saveAddressBook(){

        System.out.println("Address Book Saved");
        System.exit(0);
    }

    /*
     * functionality : contains logic to Quit Address Book
     * */

    public void quitAddressBook(){

        System.out.println("Quiting Address Book");
     System.exit(0);
    }
}
