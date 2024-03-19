// Main class to interact with phonebook manager
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        PhonebookManager phonebookManager = new PhonebookManager(); // Initialize phonebook manager
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        while (true) { // Main program loop
            // Display phonebook menu options
            System.out.println("\nPhonebook Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. View Contacts");
            System.out.println("4. Edit Name");
            System.out.println("5. Edit Address");
            System.out.println("6. Edit Phone Number");
            System.out.println("Q. Quit program");
            System.out.print("Enter Choice: ");
            String choice = scanner.nextLine(); // Get user choice

            switch (choice) { // Process user choice
                case "1": // Add Contact option
                    // Prompt user for contact information and add to phonebook
                    System.out.println("Enter First Name:");
                    String firstName = scanner.nextLine();
                    System.out.println("Enter Last Name:");
                    String lastName = scanner.nextLine();
                    System.out.println("Enter Address:");
                    String address = scanner.nextLine();
                    System.out.println("Enter City:");
                    String city = scanner.nextLine();
                    System.out.println("Enter Phone Number:");
                    String phoneNumber = scanner.nextLine();
                    phonebookManager.addEntry(firstName, lastName, address, city, phoneNumber);
                    break;
                case "2": // Delete Contact option
                    // Prompt user for contact number to delete and delete from phonebook
                    System.out.println("Enter Contact Number to Delete:");
                    int contactNumberToDelete = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    phonebookManager.deleteEntry(contactNumberToDelete);
                    break;
                case "3": // View Contacts option
                    // Display all contacts in the phonebook
                    phonebookManager.viewContacts();
                    break;
                case "4": // Edit Name option
                    // Prompt user for contact number and new name, then edit in phonebook
                    System.out.println("Enter Contact Number to Edit Name:");
                    int contactNumberToEditName = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.println("Enter New First Name:");
                    String newFirstName = scanner.nextLine();
                    System.out.println("Enter New Last Name:");
                    String newLastName = scanner.nextLine();
                    phonebookManager.editName(contactNumberToEditName, newFirstName, newLastName);
                    break;
                case "5": // Edit Address option
                    // Prompt user for contact number and new address, then edit in phonebook
                    System.out.println("Enter Contact Number to Edit Address:");
                    int contactNumberToEditAddress = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.println("Enter New Address:");
                    String newAddress = scanner.nextLine();
                    System.out.println("Enter New City:");
                    String newCity = scanner.nextLine();
                    phonebookManager.editAddress(contactNumberToEditAddress, newAddress, newCity);
                    break;
                case "6": // Edit Phone Number option
                    // Prompt user for contact number and new phone number, then edit in phonebook
                    System.out.println("Enter Contact Number to Edit Phone Number:");
                    int contactNumberToEditPhoneNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.println("Enter New Phone Number:");
                    String newPhoneNumber = scanner.nextLine();
                    phonebookManager.editPhoneNumber(contactNumberToEditPhoneNumber, newPhoneNumber);
                    break;
                case "Q": // Quit program option
                case "q":
                    System.out.println("Goodbye!"); // Exit message
                    System.exit(0); // Exit program
                    break;
                default: // Invalid choice
                    System.out.println("Invalid choice!");
            }
        }
    }
}
