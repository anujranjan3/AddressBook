package com.mphasis.controller;
import com.mphasis.service.*;
import com.mphasis.service.AddressBookServices;
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

public class AddressBookController {

    Scanner scanner=new Scanner(System.in);
    PersonServices personServices=new PersonServices();
    AddressBookServices addressBookServices=new AddressBookServices();

    /*
     * functionality : This method calls the personService Object and
     *                 Functions that is used to add details of a person
     *                 in a given csv file
     * */

    public void addPerson() throws IOException {

        personServices.addPerson();
    }

    /*
     * functionality : This method calls the personService Object and
     *                 Functions that is used to edit details of a person
     *                 in a given csv file
     * */

    public void editDetailsOfPerson() throws IOException {

        personServices.editDetailsOfPerson();
    }

    /*
     * functionality : This method calls the personService Object and
     *                 Functions that is used to delete details of a person
     *                 in a given csv file
     * */

    public void deletePerson(){
        personServices.deletePerson();
    }

    /*
     * functionality : This method calls the personService Object and
     *                 Functions that is used to sort details of a person
     *                 by last Name in a given csv file
     * */

    public void sortPersonByLastName() {

        personServices.sortPersonByLastName();
    }

    /*
     * functionality : This method calls the personService Object and
     *                 Functions that is used to sort details of a person
     *                 by Zip Code in a given csv file
     * */


    public void sortPersonByZipCode(){

        personServices.sortPersonByZipCode();
    }

    /*
     * functionality : This method calls the personService Object and
     *                 Functions that is used to print details of all person
     *                 in a given csv file
     * */

    public void printAllPersons() throws IOException {

        personServices.printAllPersons();
    }

    /*
     * functionality : This method calls the personService Object and
     *                 Functions that is used to print details of a person
     *                 in a given csv file
     * */

    public void printPersonDetails(){

        personServices.printPersonDetails();
    }

    /*
     * functionality : This method calls the addressBookService Object and
     *                 Functions that is used to create new Address Book
     * */

    public void createNewAddressBook() throws IOException {

        addressBookServices.createNewAddressBook();
    }

    /*
     * functionality : This method calls the addressBookService Object and
     *                 Functions that is used to create new Address Book
     * */

    public void openExistingAddressBook(){

        addressBookServices.openExistingAddressBook();
    }

    /*
     * functionality : This method calls the addressBookService Object and
     *                 Functions that is used to Quit Address Book
     * */

    public void quitAddressBook(){

        addressBookServices.quitAddressBook();
    }

    /*
     * functionality : This method calls the addressBookService Object and
     *                 Functions that is used to close Address Book
     * */

    public void closeAddressBook(){

        addressBookServices.closeAddressBook();
    }

    /*
     * functionality : This method calls the addressBookService Object and
     *                 Functions that is used to save Address Book
     * */

    public void saveAddressBook(){

        addressBookServices.saveAddressBook();
    }
}
