package com.mphasis.model;

/*
* @author : Anuj Ranjan Kumar
* Created Date : 22nd October 2020
* Modified Date : 25th October 2020
* functionality : to get the name,address,phone Number From User
* */

public class Person {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int pincode;
    private long phoneNumber;

    /*
     * functionality : Default Constructor
     * */

    public Person() {
    }

    /*
     * functionality : to set value of first Name,Last Name,Address,city,state,pincode,phoneNumer
     * @param firstName    - first input argument that is taken in
     * @param lastName     - second input argument that is taken in
     * @param address      - third input argument that is taken in
     * @param city         - fourth input argument that is taken in
     * @param state        - fifth input argument that is taken in
     * @param pincode      - sixth input argument that is taken in
     * @param phoneNumber  - seventh input argument that is taken in
     * */

    public Person(String firstName, String lastName, String address, String city, String state, int pincode, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.phoneNumber = phoneNumber;
    }

    /*
     * functionality : to get value of first Name
     * @return firstName - the output value that is returned
     * */

    public String getFirstName()
    {
        return firstName;
    }

    /*
     * functionality : to  set value of first Name
     * @param firstName  - first input argument that is taken in
     * */

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /*
     * functionality : to get value of Last Name
     * @return lastName - the output value that is returned
     * */

    public String getLastName()
    {
        return lastName;
    }

    /*
     * functionality : to  set value of Last Name
     * @param lastName  - first input argument that is taken in
     * */

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /*
     * functionality : to get value of address
     * @return address - the output value that is returned
     * */

    public String getAddress()
    {
        return address;
    }

    /*
     * functionality : to  set value of address
     * @param address  - first input argument that is taken in
     * */

    public void setAddress(String address)
    {
        this.address = address;
    }

    /*
     * functionality : to get value of city
     * @return city - the output value that is returned
     * */

    public String getCity()
    {
        return city;
    }

    /*
     * functionality : to set value of city
     * @param city  - first input argument that is taken in
     * */

    public void setCity(String city)
    {
        this.city = city;
    }

    /*
     * functionality : to get value of state
     * @return state - the output value that is returned
     * */

    public String getState()
    {
        return state;
    }

    /*
     * functionality : to set value of state
     * @param state  - first input argument that is taken in
     * */

    public void setState(String state)
    {
        this.state = state;
    }

    /*
     * functionality : to get value of pincode
     * @return pincode - the output value that is returned
     * */

    public int getPincode()
    {
        return pincode;
    }

    /*
     * functionality : to set value of pincode
     * @param pincode  - first input argument that is taken in
     * */

    public void setPincode(int pincode)
    {
        this.pincode = pincode;
    }

    /*
     * functionality : to get value of phoneNumber
     * @return phoneNumber - the output value that is returned
     * */

    public long getPhoneNumber()
    {
        return phoneNumber;
    }

    /*
     * functionality : to set value of phoneNumber
     * @param phoneNumber  - first input argument that is taken in
     * */

    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    /*
     * functionality : to get string of firstName,lastName,address,city,state,pincode,phoneNumber
     * @return       -  the string output value that is returned
     * */

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
