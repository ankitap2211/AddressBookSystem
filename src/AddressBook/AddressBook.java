package AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact> listcontact = new ArrayList<Contact>();
    Scanner sc = new Scanner(System.in);

    public AddressBook() {
    }

    public void addContact() {
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter your Address: ");
        String address = sc.nextLine();
        System.out.print("Enter City :");
        String city = sc.nextLine();
        System.out.print("Enter State: ");
        String state = sc.nextLine();
        System.out.print("Enter zip code : ");
        int zip = (int) sc.nextLong();
        System.out.print("Enter Phone Number: ");
        long phoneNumber = sc.nextLong();
        System.out.print("Enter EMail ID: ");
        String email = sc.next();

        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        listcontact.add(contact);
    }

    void displayContact() {
        System.out.println("-------------------------------------------------------------------");
        for (Contact contact : listcontact) {
            System.out.println(contact);
            System.out.println("-------------------------------------------------------------------");
        }
    }
}
