package com.blbz;

import java.util.ArrayList;

public class MainClass {
	
	public static void main(String[] args) {
		
		AddressBook dMart = new AddressBook();
		System.out.println("-----------------------------------------------------------Welcome to Address Book Manangement System--------------------------------------------------------\n");
		dMart.display();
		dMart.showContact();
	}

}

class AddressBook{
	
	public String firstName ;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public String zip;
	public String phoneNumber;
	public String email;
	
	ArrayList<String> listOfFirstName   = new ArrayList<String>();
	ArrayList<String> listOfLastName    = new ArrayList<String>();
	ArrayList<String> listOfAddress     = new ArrayList<String>();
	ArrayList<String> listOfCity        = new ArrayList<String>();
	ArrayList<String> listOfState       = new ArrayList<String>();
	ArrayList<String> listOfZip         = new ArrayList<String>();
	ArrayList<String> listOfPhoneNumber = new ArrayList<String>();
	ArrayList<String> listOfEmail       = new ArrayList<String>();
	
	public void display()
	{
		listOfFirstName.add("Pushpak"); listOfFirstName.add("Balaji");listOfFirstName.add("Pranav");
		listOfLastName.add("Ghatode");  listOfLastName.add("Rathod");listOfLastName.add("Bobade");
		listOfAddress.add("Kailash Nagar"); listOfAddress.add("Shivaji Nagar");listOfAddress.add("Ashok Nagar");
		listOfCity.add("Pune"); listOfCity.add("Nashik");listOfCity.add("Nanded");
		listOfState.add("Maharashtra"); listOfState.add("Maharashtra");listOfState.add("Maharashtra");
		listOfZip.add("400001"); listOfZip.add("400002");listOfZip.add("400003");
		listOfPhoneNumber.add("384792876"); listOfPhoneNumber.add("192844564");listOfPhoneNumber.add("192456564");
		listOfEmail.add("abc@gmail.com"); listOfEmail.add("xyz@gmail.com");listOfEmail.add("pqr@gmail.com");
	}
	
	public void showContact()
	{	System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n","First Name","Last Name","Address","City","State","Zip","Phone Number","E-mail");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");					
		for(int i = 0; i < listOfFirstName.size();i++)
			System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n",listOfFirstName.get(i),listOfLastName.get(i),
							listOfAddress.get(i),listOfCity.get(i),listOfState.get(i),listOfZip.get(i),listOfPhoneNumber.get(i),listOfEmail.get(i));
	}
}