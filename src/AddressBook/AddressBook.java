package AddressBook;

import java.util.*;

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

    void deleteContact() {
        boolean found = false;
        System.out.println("Enter name to delete :");
        String fName = sc.nextLine();
        Iterator<Contact> iterator = listcontact.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getFirstName().equals(fName))
                iterator.remove();
            found = true;
        }
        if (!found) {
            System.out.println("Record not found");
        } else
            System.out.println("The record is successfully deleted.....");
    }

    void editContact() {
        boolean found = false;
        System.out.println("Enter name to edit :");
        String fName = sc.nextLine();
        ListIterator<Contact> list = listcontact.listIterator();
        while (list.hasNext()) {
            Contact contact = list.next();
            if (contact.getFirstName().equals(fName)) {
                System.out.print("Enter new name :");
                String firstName = sc.nextLine();
                System.out.print("Enter last name :");
                String lastName = sc.nextLine();
                System.out.print("Enter new address :");
                String address = sc.nextLine();
                System.out.print("Enter new city :");
                String city = sc.nextLine();
                System.out.print("Enter new state :");
                String state = sc.nextLine();
                System.out.print("Enter new zip code :");
                int zip = sc.nextInt();
                System.out.print("Enter new phone number :");
                long phoneNumber = sc.nextInt();
                System.out.print("Enter new email id :");
                String email = sc.next();
                Contact contact1 = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                list.set(contact1);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Record not found");
        } else {
            System.out.println("The record is updated successfully.....");
        }
    }
}
