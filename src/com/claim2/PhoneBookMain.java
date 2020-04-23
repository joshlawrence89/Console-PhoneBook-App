package com.claim2;

import java.util.Scanner;

public class PhoneBookMain {

	public static Person[] Info = new Person[0];

	public static void main(String[] args) {
				
		System.out.println("Hello and Welcome to your address book!");
		
		Person[] Info = new Person[0];
		
		
		while (true) {
		System.out.println("Choose an option");
		System.out.println("1. Add record");
		System.out.println("2. Update record");
		System.out.println("3. Delete record");
		System.out.println("4. Display existing records");
		System.out.println("5. Search by First Name");
		System.out.println("6. Search by Last Name");
		System.out.println("7. Search by Full Name");
		System.out.println("8. Search by Phone Number");
		System.out.println("9. Search by City");
		System.out.println("10. Search by State");
		System.out.println("11. Exit");
		
		Scanner userInput = new Scanner(System.in);

		switch (userInput.nextInt()) {
		
		case 1 : System.out.println("Please enter the information for a new record: Name, Steet Address, City, State, Zipcode, Phone Number");
				
		Scanner userInput2 = new Scanner(System.in);
		String[] line = userInput2.nextLine().split(",");
				
				Person person1 = new Person();
				Address address1 = new Address();
				
				person1.setFullName(line[0]);
				address1.setStreetNumber(line[1]);
				address1.setCity(line[2]);
				address1.setState(line[3]);
				address1.setZip(line[4]);
				person1.setPhoneNumber(line[5]);
				
				String[] tempName = line[0].split(" ");
				person1.setFirstName(tempName[0]);
				person1.setLastName(tempName[tempName.length - 1]);
				String middleName = "";
				for(int i = 1; i < tempName.length - 1; i++) {
					middleName += tempName[i];
					if(i !=tempName.length - 2 ) {
						middleName += " ";
					}
					
				}
			person1.setMiddleName(middleName);	
				
			person1.setAddress(address1);
			Person[] tempArray = new Person[Info.length + 1];
			for (int i = 0; i < Info.length; i++) {
				tempArray[i] = Info[i];
			}
			tempArray[tempArray.length - 1] = person1;
			Info = tempArray;

				
			break;
		case 2 : System.out.println("Please enter the phone number of the record you wish to update");
		for (int i = 0; i < Info.length; i++) {
			if(Info[i].getPhoneNumber().equals(userInput.next())) {
				System.out.println(Info[i].toString());
				System.out.println("Which field would you like to edit (please edit one at a time)");
				System.out.println("1. first name");
				System.out.println("2. middle name");
				System.out.println("3. last name");
				System.out.println("4. address");
				System.out.println("5. city");
				System.out.println("6. state");
				System.out.println("7. zipcode");
				System.out.println("8. phone number");
				
				switch (userInput.nextInt()) {
				case 1 : System.out.println("Enter new first name");
				Info[i].setFirstName(userInput.next());
					break;
					
				case 2 : System.out.println("Enter new middle name");
				Scanner userInput3 = new Scanner(System.in);
				Info[i].setMiddleName(userInput3.nextLine());
					break;
					
				case 3 : System.out.println("Enter new last name");
				Info[i].setLastName(userInput.next());
					break;
					
				case 4 : System.out.println("Enter new address");
				Scanner userInput4 = new Scanner(System.in);
				Info[i].getAddress().setStreetNumber(userInput4.nextLine());
					break;
					
				case 5 : System.out.println("Enter new city");
				Scanner userInput5 = new Scanner(System.in);
				Info[i].getAddress().setCity(userInput5.nextLine());
					break;
					
				case 6 : System.out.println("Enter new state");
				Info[i].getAddress().setState(userInput.next());
					break;
					
				case 7 : System.out.println("Enter new zipcode");
				Info[i].getAddress().setZip(userInput.next());
					break;
					
				case 8 :System.out.println("Enter new phone number");
				Info[i].setPhoneNumber(userInput.next());
					break;
				}
				
				System.out.println(Info[i].toString());

			}
		}
		case 3 : System.out.println("Please enter the phone number of the record you wish to delete");
		Scanner userInput6 = new Scanner(System.in);
		Person[] temporaryArray = new Person[Info.length - 1];
		String tempPhoneNumber = userInput6.next();
				int counts = 0;
				for(int i = 0; i < Info.length; i++) {
					if(!Info[i].getPhoneNumber().equals(tempPhoneNumber)) {
						temporaryArray[counts] = Info[i]; 
						counts++;
			}
		}
				Info = temporaryArray;

		for(int e = 0; e < Info.length; e++) {
			System.out.println(Info[e].toString());
			}

		case 4: Person[] sorted = new Person[Info.length];
		
		sorted = Info.clone();
		Person a = new Person();
		
		for (int l = 0; l < sorted.length; l++) {
			for (int i = 0, j = 1; i < sorted.length - 1; j++, i++) {
			if (sorted[i].getFirstName().compareTo(sorted[j].getFirstName()) > 0) {
				a = sorted[i];
				sorted[i] = sorted[j];
				sorted[j] = a;
				System.out.println(a);
			}
			}
		}
		for (int i = 0; i < sorted.length; i++) {
		System.out.println(sorted[i].toString());
		}
		
			break;
		case 5: System.out.println("Enter first name");
		String firstName = userInput.next();
		for (int i = 0; i < Info.length; i++) {
			if(Info[i].getFirstName().equalsIgnoreCase(firstName)) {
				System.out.println(Info[i].toString());
			}
		}
		
			break;
		case 6: System.out.println("Enter last name");
		String lastName = userInput.next();
		for (int i = 0; i < Info.length; i++) {
			if(Info[i].getLastName().equalsIgnoreCase(lastName)) {
				System.out.println(Info[i].toString());
			}
		}
		
			break;
		case 7: System.out.println("Enter full name");
		String fullName = userInput.next();
		for (int i = 0; i < Info.length; i++) {
			if(Info[i].getFullName().equalsIgnoreCase(fullName)) {
				System.out.println(Info[i].toString());
			}
		}
		
		break;
		case 8: System.out.println("Enter phone number");
		String phoneNumber = userInput.next();
		for (int i = 0; i < Info.length; i++) {
			if(Info[i].getPhoneNumber().equals(phoneNumber)) {
				System.out.println(Info[i].toString());
			}
		}
		
			break;
		case 9: System.out.println("Enter City");
		String city = userInput.next();
		for (int i = 0; i < Info.length; i++) {
			if(Info[i].getAddress().getCity().equalsIgnoreCase(city)) {
				System.out.println(Info[i].toString());
			}
		}
		
			break;
		case 10: System.out.println("Enter State");
		String state = userInput.next();
		for (int i = 0; i < Info.length; i++) {
			if(Info[i].getAddress().getState().equalsIgnoreCase(state)) {
				System.out.println(Info[i].toString());
			}
		}
			
			break;
		case 11:
			System.out.println("Have a great day! Hope to see you again!");
			System.exit(0);
		} 
		}
		
	}
	
	}