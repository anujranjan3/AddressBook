package com.mphasis.service;
import com.mphasis.model.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.mphasis.controller.*;
import java.io.File;
import java.io.FileNotFoundException;

/*
 * @author : Anuj Ranjan Kumar
 * Created Date : 22nd October 2020
 * Modified Date : 27th October 2020
 * functionality : This File Contains Logic for
 *                 1.addPerson
 *                 2.editDetailsOfPerson
 *                 3.deletePerson
 *                 4.sortPersonByLastName
 *                 5.sortPersonByZipCode
 *                 6.printAllPersons
 *                 7.printPersonDetails
 * */

public class PersonServices {

    Person person=new Person();
    Scanner scanner=new Scanner(System.in);
    private static final String COMMA_DELIMITER = ",";
    FileController fileController=new FileController();
    private String csv;

    /*
     * functionality : contains logic to set and get the fileName with path
     * @return csv - the output value that is returned
     * */

    public String PersonServices()
    {
        System.out.println("Enter The Name of the file i.e output.csv");
        String filename=scanner.next();
        csv="D:\\"+filename;
        return csv;
    }

    /*
     * functionality : contains logic to add person details i.e.,
     *                 First Name,Last Name, Address, City, State, Pincode,
     *                 Phone Number
     * */

    public void addPerson() throws IOException {

        PersonServices();
        System.out.println("Enter the Following Details of the person");
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        System.out.println("Enter Last Name : ");
        String lastName = scanner.next();
        System.out.println("Enter Address : ");
        String address = scanner.next();
        System.out.println("Enter City : ");
        String city = scanner.next();
        System.out.println("Enter State : ");
        String state = scanner.next();
        System.out.println("Enter Pincode : ");
        int pincode = scanner.nextInt();
        System.out.println("Enter Phone Number : ");
        long phoneNumber = scanner.nextLong();

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAddress(address);
        person.setCity(city);
        person.setState(state);
        person.setPincode(pincode);
        person.setPhoneNumber(phoneNumber);
        scanner.close();

        FileWriter fstream = new FileWriter(csv, true);
        BufferedWriter out = new BufferedWriter(fstream);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(person.getFirstName());
        stringBuilder.append(',');
        stringBuilder.append(person.getLastName());
        stringBuilder.append(',');
        stringBuilder.append(person.getAddress());
        stringBuilder.append(',');
        stringBuilder.append(person.getCity());
        stringBuilder.append(',');
        stringBuilder.append(person.getState());
        stringBuilder.append(',');
        stringBuilder.append(person.getPincode());
        stringBuilder.append(',');
        stringBuilder.append(person.getPhoneNumber());
        stringBuilder.append('\n');

        out.write(stringBuilder.toString());
        System.out.println("done!");
        out.close();
        scanner.close();
    }

    /*
     * functionality : contains logic to edit person details
     * */

    public void editDetailsOfPerson()  {

        fileController.editMain();
    }

    /*
     * functionality : contains logic to delete person details
     * */

    public void deletePerson() {

        fileController.deleteMain();
    }

    /*
     * functionality : contains logic to sort person details by last name
     * */

    public void sortPersonByLastName(){

        PersonServices();
        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader(csv));
            List<Person> personList = new ArrayList<Person>();
            List<String> sortingByLastName=new ArrayList<>();
            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] personDetails = line.split(COMMA_DELIMITER);
                if(personDetails.length > 0 ) {

                    Person person = new Person(personDetails[0],personDetails[1],personDetails[2],personDetails[3],
                            personDetails[4],Integer.parseInt(personDetails[5]),
                            Long.parseLong(personDetails[6]));
                    personList.add(person);
                    sortingByLastName.add(personDetails[1]);
                }
                Collections.sort(sortingByLastName);
            }

            System.out.println("Printing Details Sorted By Last Name: ");

            for(String s: sortingByLastName) {

            for(Person e : personList) {

                    if (e.getLastName().equals(s)) {

                        System.out.println(e.getFirstName() + "   " + e.getLastName() + "   " + "   " + e.getAddress() +
                                "   " + e.getCity() + "   " + e.getState() + "   " + e.getPincode() + "   " +
                                e.getPhoneNumber());
                    }
                }
            }
        }
        catch(Exception ee) {

            ee.printStackTrace();
        }
        finally {

            try {

                br.close();
            }
            catch(IOException ie) {

                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
        }
    }

    /*
     * functionality : contains logic to sort person details by Zip Code
     * */

    public void sortPersonByZipCode() {

        PersonServices();
        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader(csv));
            List<Person> personList = new ArrayList<Person>();
            List<Integer> sortByZipCode=new ArrayList<>();
            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] personDetails = line.split(COMMA_DELIMITER);
                if(personDetails.length > 0 ) {

                    Person person = new Person(personDetails[0],personDetails[1],personDetails[2],personDetails[3],
                            personDetails[4],Integer.parseInt(personDetails[5]),
                            Long.parseLong(personDetails[6]));
                    personList.add(person);
                    sortByZipCode.add(Integer.parseInt(personDetails[5]));
                }
                Collections.sort(sortByZipCode);
            }

            System.out.println("Printing Details Sorted By Zip Code : ");

            for(Integer i: sortByZipCode) {

                for(Person e : personList) {

                    if (e.getPincode()==i) {

                        System.out.println(e.getFirstName() + "   " + e.getLastName() + "   " + "   " + e.getAddress() +
                                "   " + e.getCity() + "   " + e.getState() + "   " + e.getPincode() + "   " +
                                e.getPhoneNumber());
                    }
                }
            }
        }
        catch(Exception ee) {

            ee.printStackTrace();
        }
        finally {

            try {

                br.close();
            }
            catch(IOException ie) {

                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
        }
    }

    /*
     * functionality : contains logic to print all  person details in address book
     * */

    public void printAllPersons() {

        PersonServices();
        Scanner scanner = null;
        try {

            scanner = new Scanner(new File(csv));
            scanner.useDelimiter(COMMA_DELIMITER);
            while (scanner.hasNext()) {

                System.out.print(scanner.next() + "   ");
            }
        }
        catch (FileNotFoundException fe) {

            fe.printStackTrace();
        }
        finally {

            scanner.close();
        }
    }

    /*
     * functionality : contains logic to print specific person details
     * */

    public void printPersonDetails() {

        PersonServices();
        BufferedReader br = null;
        try {

            br = new BufferedReader(new FileReader(csv));
            List<Person> personList = new ArrayList<Person>();
            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {

                String[] personDetails = line.split(COMMA_DELIMITER);
                if(personDetails.length > 0 ) {

                    Person person = new Person(personDetails[0],personDetails[1],personDetails[2],personDetails[3],
                                               personDetails[4],Integer.parseInt(personDetails[5]),
                                               Long.parseLong(personDetails[6]));
                    personList.add(person);
                }
            }
            for(Person e : personList) {

                System.out.println(e.getFirstName() + "   " + e.getLastName() + "   " + "   " + e.getAddress() +
                                   "   " + e.getCity() + "   " + e.getState() + "   " + e.getPincode() + "   " +
                                   e.getPhoneNumber());
            }
            System.out.println("Enter First Name ");
            Scanner scanner=new Scanner(System.in);
            String searchName=scanner.next();
            for(Person e : personList) {

                if (e.getFirstName().equals(searchName)) {

                    System.out.println(e.getFirstName() + "   " + e.getLastName() + "   " + "   " + e.getAddress() +
                                       "   " + e.getCity() + "   " + e.getState() + "   " + e.getPincode() + "   " +
                                       e.getPhoneNumber());
                }
            }
        }
        catch(Exception ee) {

            ee.printStackTrace();
        }
        finally {

            try {

                br.close();
            }
            catch(IOException ie) {

                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
        }
    }
}