package AddressBook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Edit Contact");
            System.out.print("Enter Your Choice :");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
            }
        } while (choice != 0);
    }
}
