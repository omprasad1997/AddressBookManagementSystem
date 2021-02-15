package com.blbz;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	public static final int  showContact 	     = 1;
	public static final int  addNewContact       = 2;
	public static final int  editExistingContact = 3;
	public static final int  deletePersonContact = 4;
	public static final int  exit  				 = 5;
	
	public static void main(String[] args) {
		
		AddressBook dMart = new AddressBook();
		
		System.out.println("-----------------------------------------------------------Welcome to Address Book Manangement System--------------------------------------------------------\n");
		dMart.display();
		boolean flag = true;
		Scanner temp = new Scanner(System.in);

		while(flag) 
		{
			System.out.println("1 : Showing Contact");
			System.out.println("2 : Adding New Contact");
			System.out.println("3 : Edit Existing Contact");
			System.out.println("4 : Delete Person Contact");
			System.out.println("5 : Exit");
			
			System.out.print("Enter a choice : ");
			int choice = temp.nextInt();
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");					
				
			switch(choice)
			{
				case showContact:
				{
					dMart.showContact();
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");					
					break;
				}
				case addNewContact :{
					dMart.addNewContact();
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");					
					break;
				}
				case editExistingContact:{
					dMart.editExistingContact();
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");					
					break;
				}
				case deletePersonContact:{
					dMart.deleteContact();
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");					
					break;
				}
				case exit:{
					System.out.println("-------------------------------------------Thank you for using address book management system.--------------------------------------------------------------");
					System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");					
					flag = false;
					break;
				}
			}
		}
	}
}



class AddressBook{
	
	Scanner sc = new Scanner(System.in);
	
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
	
	public void addNewContact()
	{
		System.out.print("First Name : ");
		firstName = sc.nextLine();
		listOfFirstName.add(firstName);
		
		System.out.print("Last Name : ");
		lastName = sc.nextLine();
		listOfLastName.add(lastName);
		
		System.out.print("Address : ");
		address = sc.nextLine();
		listOfAddress.add(address);
		
		System.out.print("City Name : ");
		city = sc.nextLine();
		listOfCity.add(city);
		
		System.out.print("State Name : ");
		state = sc.nextLine();
		listOfState.add(state);
		
		System.out.print("Zip code : ");
		zip = sc.nextLine();
		listOfZip.add(zip);
		
		System.out.print("Phone Number: ");
		phoneNumber = sc.nextLine();
		listOfPhoneNumber.add(phoneNumber);
		
		System.out.print("E-mail id : ");
		email = sc.nextLine();
		listOfEmail.add(email);
		
		System.out.println("You have successfully added new contact.");
	}
	public void editExistingContact() {
		int counter=0;
		System.out.print("Enter person name do you want to edit : ");
		String editName = sc.nextLine();
		for(int i = 0; i < listOfFirstName.size(); i++) {
			if(listOfFirstName.get(i).equals(editName)) 
					break;	
			else
				counter++;
		}
		if(counter==listOfFirstName.size())
				System.out.println("Invalid Name");
		else {
			System.out.print("First Name : ");
			listOfFirstName.set(counter,sc.nextLine());
			
			System.out.print("Last Name : ");
			listOfLastName.set(counter,sc.nextLine());
			
			System.out.print("Address Name : ");
			listOfAddress.set(counter,sc.nextLine());
			
			System.out.print("City Name : ");
			listOfCity.set(counter,sc.nextLine());
			
			System.out.print("State Name : ");
			listOfState.set(counter,sc.nextLine());
			
			System.out.print("Zip Name : ");
			listOfZip.set(counter,sc.nextLine());
			
			System.out.print("Phone Number : ");
			listOfPhoneNumber.set(counter,sc.nextLine());

			System.out.print("E-mail id : ");
			listOfEmail.set(counter,sc.nextLine());
			
			System.out.println("You have successfully edited contact.");
		}	
	}
	public void deleteContact()
	{
		int count = 0;
		System.out.print("Enter person name do you want to delete : ");
		String name = sc.nextLine();
		for(int i = 0; i < listOfFirstName.size(); i++) {
				if(listOfFirstName.get(i).equals(name))
					break;
				else
					count++;
			}
		
		if(count==listOfFirstName.size()) {
				System.out.println("Invalid Name");	
		}
		else {
			listOfFirstName.remove(count);
			listOfLastName.remove(count);
			listOfAddress.remove(count);
			listOfCity.remove(count);
			listOfState.remove(count);
			listOfZip.remove(count);
			listOfPhoneNumber.remove(count);
			listOfEmail.remove(count);
			System.out.println("You have successfully deleted contact.");
		}
	}
}	