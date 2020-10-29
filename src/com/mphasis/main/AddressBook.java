package com.mphasis.main;
import com.mphasis.controller.*;
import java.io.IOException;
import java.util.Scanner;

/*
 * @author : Anuj Ranjan Kumar
 * Created Date : 22nd October 2020
 * Modified Date : 25th October 2020
 * functionality : call the service objects and perform functionality
 *                 1.addPerson
 *                 2.editDetailsOfPerson
 *                 3.deletePerson
 *                 4.sortPersonByLastName
 *                 5.sortPersonByZipCode
 *                 6.printAllPersons
 *                 7.printPersonDetails
 *                 8.createNewAddressBook
 *                 9.openExistingAddressBook
 *                10.closeAddressBook
 *                11.saveAddressBook
 *                12.quitAddressBook
 * */

public class AddressBook {

    public static void main(String[] args) throws IOException {

        System.out.println("Options : \n 1) Add a Person Details \n 2) Edit Person Details \n 3) Delete a Person Details \n" +
                           " 4) Sort Person Details By Last Name \n 5) Sort Person Details By Zip Code \n " +
                           "6) Print All Person Details \n 7) Print Selected Person Details \n 8) Create New Address Book \n" +
                           " 9) Open Existing Address Book \n 10) Close Address Book \n 11 ) Save Address Book\n " +
                           "12) Quit Address Book");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            AddressBookController addressBookController = new AddressBookController();
            switch (choice) {
                case 1 :addressBookController.addPerson();
                break;
                case 2 :addressBookController.editDetailsOfPerson();
                break;
                case 3 :addressBookController.deletePerson();
                break;
                case 4 :addressBookController.sortPersonByLastName();
                break;
                case 5 :addressBookController.sortPersonByZipCode();
                break;
                case 6 :addressBookController.printAllPersons();
                break;
                case 7 :addressBookController.printPersonDetails();
                break;
                case 8 :addressBookController.createNewAddressBook();
                break;
                case 9 :addressBookController.openExistingAddressBook();
                break;
                case 10:addressBookController.closeAddressBook();
                break;
                case 11:addressBookController.saveAddressBook();
                break;
                case 12:addressBookController.quitAddressBook();
                break;
                default:System.out.println("Wrong Input");
            }
        }
    }
}
